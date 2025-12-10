create table alunos (
	id_aluno serial primary key,
	nome_completo varchar (100) not null,
	serie_ano varchar (30) not null,
	data_nascimento date
);

drop table if exists alunos

create table Livros(
	id_livro serial primary key,
	titulo_livro varchar (30) not null,
	nome_autor varchar (30),
	ano_publicacao int,
	categoria_tema text
);

drop table if exists livros

create table Emprestimos(
	id_emprestimo serial primary key,
	aluno_emprestimo int references alunos (id_aluno) not null,
	livro_emprestado int references livros (id_livro) not null,
	data_emprestimo date not null,
	data_devolucao date,
	devolvido_em date
);

drop table if exists emprestimos

insert into alunos (nome_completo,serie_ano) 
values('Douglas de Sousa Rezende','Universitário'),
('Thais de Almeida Farias', 'Universitária'),
('Thalia de Almeida Farias', 'Universitária'),
('Bernardo de Sousa Rezende Pereira', '5º ano'),
('Ana Gabriele de Sousa Rezende', '3º ano do eEsino Médios');

insert into livros (titulo_livro,nome_autor, ano_publicacao,categoria_tema) 
values('A gerra dos tronos','George R.R Martin',1996,'Fantasia'),
('O Festins dos Corvos','George R.R Martin',2025, 'Fantasia'),
('A Fúria dos Reis','George R.R Martin',1998,'Fantasia'),
('A Dança dos Dragões','George R.R Martin',2011, 'Fantasia'),
('A Tormenta das Espadas','George R.R Martin',2000, 'Fantasia');

insert into  emprestimos (aluno_emprestimo,livro_emprestado,data_emprestimo,data_devolucao) 
values(1,5,'01/12/2025','02/01/2025'),
(2,4,'02/12/2025','03/01/2025'),
(3,3,'03/12/2025','04/01/2025'),
(4,2,'04/12/2025','05/01/2025'),
(5,1,'05/12/2025','06/01/2025'),
(1,1,'06/12/2025','07/01/2025'),
(2,2,'07/12/2025','08/01/2025'),
(3,3,'08/12/2025','09/01/2025'),
(4,4,'09/12/2025','10/01/2025'),
(5,5,'09/12/2025','11/01/2025');

select * from alunos; /* Mostra todas a colunas da tabela alunos*/

select * from livros;
select titulo_livro , nome_autor from livros; /* lista por titulo e nome do autor*/

select * from emprestimos;

select * from  emprestimos /* Mostra todas a colunas da tabela emprestimos*/
where aluno_emprestimo = 1; /* Mostra todas a linhas da referente ao aluno "1"*/

select * from livros 
where categoria_tema = 'Fantasia';

select * from emprestimos
where data_devolucao in null /* Para o Null não usa-se "=" e sim "is", pois o null e falta de valor e não é possível igualar nd a ele*/

select * from emprestimos
where data_devolucao in not null /* Inverso do caso acima do Null*/

select * from emprestimos
where aluno_emprestimo  = 1 and data_emprestimo = '01/12/2025'; /* Posso usar "AND" ou "OU" para filtros compostos*/

select * from livros
where ano_publicacao between 1997 and 2024 /* Filtra por um intervalo de dados*/

select * from livros
where nome_autor like 'George%' /* Filtra por algo parecido com o parametro passado, obrigatório o uso "%"*/

