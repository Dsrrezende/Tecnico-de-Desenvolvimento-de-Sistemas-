--1. Crie as tabelas:
drop table if exists fornecedores;
--* Fornecedores ✅
create table Fornecedores(
ID_FORNECEDOR serial primary key ,
CNPJ char(14) not null unique ,
NOME varchar(100) not null ,
ENDERECO varchar (50) not null ,
CEP char (9) not null ,
NUMERO varchar (10) not null default 'S/N',
CIDADE varchar (25)not null ,
ESTADO char (2) not null ,
TELEFONE char(16) not null default 'S/N',
CADASTRADO_EM timestamp not null default now()
);


--* Produtos ✅
create table Produtos(
ID_PRODUTO serial primary key ,
NOME varchar(100) not null ,
CODIGO_BARRAS varchar (20) not null unique ,
DESCRICAO text,
CATEGORIA varchar(30),
PRECO numeric (7,2) not null default 0.00 check (PRECO > 0),
ESTOQUE int not null check (estoque >= 0),
CADASTRADO_EM timestamp not null default now(),
FK_FORNECEDOR INT not null references Fornecedores (ID_FORNECEDOR)
);

--* Usuários ✅
create table Usuarios(
ID_USUARIO serial primary key ,
CPF char(11) not null unique,
NOME varchar(100) not null,
ENDERECO varchar (50) not null,
CEP char (9) not null ,
NUMERO varchar (10) not null default 'S/N',
CIDADE varchar (25)not null ,
ESTADO char (2) not null ,
TELEFONE char(16) not null default 'S/N',
CADASTRADO_EM timestamp not null default now()
);

create type status as enum ('PAGO','PENDENTE', 'ENTREGUE','A CAMINHO', 'EM PREPARO');


--* Vendas ✅
create table Vendas(
ID_VENDA serial primary key ,
VALOR_VENDA numeric (7,2) not null ,
STATUS status default 'PENDENTE',
DATA_VENDA timestamp default now(),
VENDA_CANCELADA boolean default false ,
MOTIVO_CANCELAMENTO TEXT ,
DATA_CANCELAMENTO timestamp ,
FK_USUARIO INT references Usuarios (ID_USUARIO)
);

--Tabela necessaria pra fazer a ponte entre as vendas e os produtos
create table Itens_Venda (
    ID_ITEM serial primary key,
    FK_VENDA int not null references Vendas (ID_VENDA),
    FK_PRODUTO int not null references Produtos (ID_PRODUTO)
);


--2. Insira alguns dados para cada tabela, pelo menos 5 dados em cada tabela.

insert into Fornecedores (CNPJ, NOME, ENDERECO, CEP, NUMERO, CIDADE, ESTADO, TELEFONE)
values
('12345678000190', 'Alpha Distribuidora LTDA', 'Rua das Indústrias', '25600-120', '150', 'Petrópolis', 'RJ', '(24)99999-1111'),
('98765432000155', 'Beta Alimentos SA', 'Av. Brasil', '20040-002', '1000', 'Rio de Janeiro', 'RJ', '(21)98888-2222'),
('45678912000133', 'Gamma Eletrônicos', 'Rua da Tecnologia', '01310-200', '500', 'São Paulo', 'SP', '(11)97777-3333'),
('32165498000177', 'Delta Logística', 'Rodovia BR-040', '25250-000', 'S/N', 'Duque de Caxias', 'RJ', '(21)96666-4444'),
('74185296000144', 'Omega Escritórios', 'Rua do Comércio', '30140-110', '45', 'Belo Horizonte', 'MG', '(31)95555-5555');


insert into Produtos (NOME, CODIGO_BARRAS, PRECO, ESTOQUE, FK_FORNECEDOR)
values
('Caixa de Copos Descartáveis 200ml', '789111110001', 18.90, 300, 1),
('Arroz Tipo 1 - 5kg', '789123450001', 28.90, 120, 2),
('Mouse Óptico USB', '789456780001', 45.00, 80, 3),
('Serviço de Transporte Rodoviário', '789222220001', 150.00, 999, 4),
('Papel A4 500 folhas', '789852960001', 32.00, 150, 5);



insert into Usuarios (CPF, NOME, ENDERECO, CEP, NUMERO, CIDADE, ESTADO, TELEFONE)
values
('12345678901', 'Carlos Henrique Silva', 'Rua das Acácias', '25600-100', '120', 'Petrópolis', 'RJ', '(24)99999-0001'),
('98765432100', 'Mariana Souza Lima', 'Av. Dom Pedro I', '25710-050', '450', 'Petrópolis', 'RJ', '(24)99999-0002'),
('45678912355', 'Roberto Almeida', 'Rua do Imperador', '25620-003', 'S/N', 'Petrópolis', 'RJ', '(24)99999-0003'),
('74185296322', 'Fernanda Costa', 'Rua Teresa', '25620-020', '89', 'Petrópolis', 'RJ', '(24)99999-0004'),
('36925814766', 'Lucas Pereira', 'Rua Bingen', '25665-010', '300', 'Petrópolis', 'RJ', '(24)99999-0005');

insert into Vendas (VALOR_VENDA, STATUS, FK_USUARIO)
values
(28.90, 'PAGO', 1),        
(9.50, 'PAGO', 2),         
(45.00, 'ENTREGUE', 3),    
(79.90, 'A CAMINHO', 4),   
(32.00, 'EM PREPARO', null );  

insert into Itens_Venda (FK_VENDA, FK_PRODUTO)
values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);




--3. Crie as seguintes consultas:
--a) Listar todos os dados de todos os produtos;
select *from Produtos;

--b) Listar produtos de um determinado fornecedor;
select * from Produtos where FK_FORNECEDOR = 1;

--c) Listar produtos entre uma intervalo de preços;
select * from Produtos where preco between 20.00 and 50.00;

--d) Listar o nome do produto e o nome do fornecedor de cada produto;
select Produtos.nome,Fornecedores.nome from Produtos
join Fornecedores on Produtos.fk_fornecedor = Fornecedores.id_fornecedor;

--e) Listar o nome do usuário, o nome do produto e a data que esse usuário  comprou o produto;
select Usuarios.nome, Produtos.nome, Vendas.data_venda from Usuarios 
join Vendas on Vendas.fk_usuario = Usuarios.id_usuario
join Itens_Venda on Itens_Venda.fk_venda = Vendas.id_venda
join Produtos on Produtos.id_produto = Itens_Venda.fk_produto;

--f) Listar o nome do usuário  e as datas em que ele comprou algo e filtrar por um usuário específico;
select Usuarios.nome, Vendas.data_venda from Usuarios
join Vendas on Vendas.fk_usuario = Usuarios.id_usuario where Usuarios.id_usuario = 1;

--g) Listar o nome dos usuários que não tiveram nenhuma compra;
select Usuarios.nome from Usuarios
left join Vendas on Vendas.fk_usuario = Usuarios.id_usuario where Vendas.id_venda is null;

--h) Listar o identificador e as datas das vendas que não tiveram um usuário;
select Vendas.id_venda, Vendas.data_venda from Vendas where Vendas.fk_usuario is null;


