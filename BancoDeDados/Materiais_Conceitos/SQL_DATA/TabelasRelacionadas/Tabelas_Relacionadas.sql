drop table if exists Pessoas;
drop table if exists enderecos;

create table enderecos(
	id_endereco serial primary key,
	cep char(8)not null,
	rua varchar (100) not null,
	numero varchar (10) default 'S/N',
	bairro varchar (30) not null,
	complemento text,
	cidade varchar (30) not null,
	estado char (2) not null
	
);

create table pessoas(
	id_pessoa serial  primary key ,
	nome varchar(100) not null,
	email varchar(100) unique,
	data_nascimento date ,
	altura int check (altura > 0),
	endereco int references enderecos (id_endereco),
	criado_em timestamp default now()
);

insert into enderecos (cep, rua, bairro, cidade, estado) 
values ('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ');

insert into enderecos (cep, rua, bairro, cidade, estado, numero, complemento) 
values ('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ', 39, 'Vila Adeilaide'),
('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ', 33, 'Vila Adeilaide'),
('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ', 34, 'Vila Adeilaide'),
('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ', 35, 'Vila Adeilaide'),
('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ', 36, 'Vila Adeilaide'),
('25845000','Rua Adriana espindola','Delícia','Areal', 'RJ', 36, 'Vila Adeilaide');


insert into pessoas (nome,endereco) 
values('Douglas', 2);

select nome, criado_em from pessoas;
select * from enderecos;