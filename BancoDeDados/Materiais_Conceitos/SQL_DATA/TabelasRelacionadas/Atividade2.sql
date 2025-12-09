create table alunos (
	id_aluno serial primary key,
	nome_completo varchar (100) not null,
	serie_ano varchar (30) not null,
	data_nascimento date
);

create table Livros(
	id_livro serial primary key,
	titulo_livro varchar (30) not null,
	nome_autor varchar (30),
	ano_publicacao int,
	categoria_tema text
);

create table Empréstimos(
	id_emprestimo serial primary key,
	aluno_emprestimo int references alunos (id_aluno) not null,
	livro_emprestado int references livros (id_livro) not null,
	data_emprestimo date not null,
	data_devolucao date,
	devolvido_em date
);

insert into alunos (nome_completo,serie_ano) 
values('Douglas de Sousa Rezende','Universitário'),
('Thais de Almeida Farias', 'Universitária'),
('Thalia de Almeida Farias', 'Universitária'),
('Bernardo de Sousa Rezende Pereira', '5º ano'),
('Ana Gabriele de Sousa Rezende', '3º ano do eEsino Médios');

insert into livros (titulo_livro,nome_autor, ano_publicacao) 
values('A gerra dos tronos','George R.R Martin',1996),
('O Festins dos Corvos','George R.R Martin',2025),
('A Fúria dos Reis','George R.R Martin',1998),
('A Dança dos Dragões','George R.R Martin',2011),
('A Tormenta das Espadas','George R.R Martin',2000);