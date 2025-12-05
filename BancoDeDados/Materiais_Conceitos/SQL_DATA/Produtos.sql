create table Produtos(
id_Produto serial primary key,
nome varchar(100) not null,
descricao text,
codigo_barras varchar(30) not null unique,
preco numeric (4,2) not null check (preco >=5),
estoque int default 0 not null check(estoque >= 0),
ativo bool default true not null,
criado_em timestamp default Now() not null
);

insert into Produtos (nome, codigo_barras, preco, ativo)
values
('Teclado','0005462354879',78.45,true),
('Mousepad','00054612564845',20.99,false),
('Webcan','0005462348659',99.99,false);

alter table produtos add column fornecedor varchar(40) default 'Sem Fornecedor' not null;

alter table produtos 
alter column codigo_barras type varchar(50)