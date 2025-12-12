--Clientes
--Pedidos

create table clientes (
id_cliente serial primary key,
nome varchar(100) not null,
data_nascimento date,
cpf char(11)not null unique,
ativo boolean default true
);

create type status as enum ('PAGO','PENDENTE', 'ENTREGE','A CAMINHO', 'EM PREPARO');

create table pedidos (
id_pedido serial primary key,
data_pedido timestamp not null default now(),
valor numeric (7,2) not null check(valor > 0),
status status default 'PENDENTE',
fk_cliente int references clientes (id_cliente)
);

insert into clientes (nome,cpf,ativo)
values('Carlos','12345678910', true),
('Fulano','12546983715',true),
('Hacker','53694568231',false);

insert into clientes (nome,cpf,data_nascimento)
values ('Ciclano', '45698523697',now());

insert into pedidos (data_pedido,valor,status,fk_cliente)
values(now(),425.39,'PAGO',1),
('01/12/2025',34.98,'PENDENTE',2);

insert into pedidos (valor)
values (789.45);

select * from pedidos;

select fk_cliente,nome, data_pedido from pedidos --"INNER JOIN"--> prioriza apenas dos registros que tiveram as conexões entre as duas tabelas
join clientes on fk_cliente = id_cliente; -->"outra possibilidade" --> join clientes c on p.fk_cliente = c.id_cliente;

select fk_cliente,nome, data_pedido from pedidos --"LEFT JOIN" --> prioriza a tabela a esquerda do join "PEDIDOS".
left join clientes on fk_cliente = id_cliente; 

select fk_cliente,nome, data_pedido from pedidos --"RIGHT JOIN" --> prioriza a tabela a direita do join "CLIENTES".
right join clientes on fk_cliente = id_cliente; 

select fk_cliente,nome, data_pedido from pedidos --"RIGHT JOIN" --> prioriza a tabela a direita do join "CLIENTES".
full join clientes on fk_cliente = id_cliente; /*"FULL JOIN" --> Priorodos os resultados possiveis. Primeiro lista os resultados que tem conexões, depois mostra os 
resultados da tabela da esquerda (tabela 1) que não tem conexão com a tabela 2 e por último mostra os resultados da tabela da direita (tabela 2) que não tem conexão com a tabela 1*/

create  table Produtos(
id_produto serial primary key,
nome varchar(50) not null,
estoque int not null
);

drop table if exists produtos;

alter table pedidos 
add column id_produto int references produtos (id_produto);

insert into Produtos (nome, estoque)
values ('produto x',10),
('produto z', 25);

insert into Produtos (nome, estoque)
values ('produto A',15),
('produto B', 35);

update pedidos set id_produto = 1 where fk_cliente =1;
update pedidos set id_produto = 2 where  fk_cliente =2;
update pedidos set id_produto = 3 where fk_cliente =3;
update pedidos set id_produto = 4 where  fk_cliente =4;

select fk_cliente, clientes.nome, data_pedido, Produtos.nome from clientes  
join pedidos on fk_cliente = id_cliente
join Produtos on pedidos.id_produto = Produtos.id_produto
;






























