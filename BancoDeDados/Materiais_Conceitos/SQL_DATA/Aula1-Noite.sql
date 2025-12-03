drop table if exists pessoas;

create table pessoas (
	id_pessoa serial  primary key,
	nome varchar(100) not null,
	idade integer check (idade >=16),
	ativo bool default true,
	cpf char(11),
	altura numeric(3,2)
);
