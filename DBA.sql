create table pessoa (
	id integer not null auto_increment,
	nome varchar(60) not null,
	idade integer not null,
	sexo char(1) not null,
	datacadastro date not null,
	primary key(id)
);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (1, 'João', 30, 'M', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (2, 'Maria', 15, 'F', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (3, 'Camila', 25, 'F', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (4, 'Rodrigo', 18, 'M', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (5, 'Fernando', 45, 'M', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (6, 'Luis', 50, 'M', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (7, 'Paola', 17, 'F', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (8, 'Henrique', 12, 'M', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (9, 'Diego', 11, 'M', current_date);
insert into pessoa(id, nome, idade, sexo, datacadastro) values (10, 'Carlos', 8, 'M', current_date);

create table pessoa_endereco (
	id integer not null auto_increment,
	idpessoa integer not null,
	endereco varchar(60) not null,
	datacadastro date not null,
	primary key(id),
	constraint fkpessoa_endereco01 foreign key(idpessoa) references pessoa(id)
);
insert into pessoa_endereco(id, idpessoa, endereco, datacadastro) values (1, 1, 'Avenida Teste, 10', current_date);
insert into pessoa_endereco(id, idpessoa, endereco, datacadastro) values (2, 3, 'Rua Moreira, 100', current_date);
insert into pessoa_endereco(id, idpessoa, endereco, datacadastro) values (3, 5, 'Rua Parapura, 970', current_date);
insert into pessoa_endereco(id, idpessoa, endereco, datacadastro) values (4, 7, 'Avenida 9 de Abril, 269', current_date);
insert into pessoa_endereco(id, idpessoa, endereco, datacadastro) values (5, 10, 'Avenida 7 de Setembro, 17', current_date);

create table usuario (
	id integer not null auto_increment,
	nome varchar(60) not null,
	usuario varchar(20) not null,
	senha varchar(8) not null,
	datacadastro date not null,
	primary key(id)
);
insert into usuario(id, nome, usuario, senha, datacadastro) values (1, 'Matheus', 'mahenrique94', '123456', current_date);
insert into usuario(id, nome, usuario, senha, datacadastro) values (2, 'Camila', 'caferreira', 'caca10', current_date);
insert into usuario(id, nome, usuario, senha, datacadastro) values (3, 'Diego', 'carroca', 'idiota', current_date);
insert into usuario(id, nome, usuario, senha, datacadastro) values (4, 'Carlos', 'chenrique', '12345678', current_date);
insert into usuario(id, nome, usuario, senha, datacadastro) values (5, 'Paola', 'paola16', '123123', current_date);