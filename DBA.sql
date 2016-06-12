create table pessoa (
	id integer not null auto_increment,
	nome varchar(60) not null,
	idade integer not null,
	sexo char(1) not null,
	datacadastro date not null,
	primary key(id)
);
insert into pessoa(nome, idade, sexo, datacadastro) values ('João', 30, 'M', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Maria', 15, 'F', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Camila', 25, 'F', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Rodrigo', 18, 'M', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Fernando', 45, 'M', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Luis', 50, 'M', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Paola', 17, 'F', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Henrique', 12, 'M', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Diego', 11, 'M', current_date);
insert into pessoa(nome, idade, sexo, datacadastro) values ('Carlos', 8, 'M', current_date);

create table usuario (
	id integer not null auto_increment,
	nome varchar(60) not null,
	usuario varchar(20) not null,
	senha varchar(8) not null,
	datacadastro date not null,
	primary key(id)
);
insert into usuario(nome, usuario, senha, datacadastro) values ('Matheus', 'mahenrique94', '123456', current_date);
insert into usuario(nome, usuario, senha, datacadastro) values ('Camila', 'caferreira', 'caca10', current_date);
insert into usuario(nome, usuario, senha, datacadastro) values ('Diego', 'carroca', 'idiota', current_date);
insert into usuario(nome, usuario, senha, datacadastro) values ('Carlos', 'chenrique', '12345678', current_date);
insert into usuario(nome, usuario, senha, datacadastro) values ('Paola', 'paola16', '123123', current_date);