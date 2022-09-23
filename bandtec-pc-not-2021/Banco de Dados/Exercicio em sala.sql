create database exercicio;
use exercicio;

create table empregado(
codiEmp int primary key,
nome varchar(45),
salario double
);

create table dependente(
codDep int,
nome varchar(45),
dataNasc date,
fkEmpregado int,
primary key(codDep, fkEmpregado),
foreign key depndente(fkEmpregado) references empregado(codiEmp)
);

insert into empregado values
(1, 'victor veniti', 87.00),
(2, 'matheus ferreira', 7600);

insert into empregado values
(3, 'kamila', '7800');

select*from empregado;
alter table empregado modify salario decimal(10,2);

insert into dependente values
(2, 'Beatriz veniti', '1999-01-20', 1),
(1, 'raylane', '1997-03-27', 2);

select*from empregado left join dependente on codiEmp = fkEmpregado;  







-- fk na mesma tabela
create table funcionario(
idFunc int primary key,
nome varchar(45),
genero char(1),
salario decimal(10,2),
cpf char(11) unique,
fkSupervisor int,
foreign key funcionario(fkSupervisor) references funcionario(idFunc),
	check (genero = 'M' or genero = 'F')
);

create table dependente(
idDep int,
nomeDep varchar(45),
parentesco varchar(45),
datanasc date,
fkFuncionario int,	
primary key (idDep, fkFuncionario),
foreign key dependente(fkFuncionario) references funcionario(idFunc)
);
drop table funcionario;

insert into funcionario values
(1, 'victor veniti', 'M', 15800, '49797642828', null),
(2, 'beatriz veniti de sousa melo', 'F', 10800, '49797642928', 1) ,
(3, 'tamirez de sousa melo', 'F', 10800, '18738778518', 2),
(4, 'rodrigo brito melo', 'M', 8800, '18364728376', 1);

insert into dependente values
(1, 'andre sousa melo', 'pai', '1970-10-03', 2),
(2, 'gustavo brito melo', 'irmão', '1998-11-07', 4),
(3, 'valeria', 'mãe', '1965-04-25', 3);

select*from funcionario;
select*from funcionario as func join funcionario as supervisor on func.fkSupervisor = supervisor.idFunc join dependente on fkFuncionario = func.idFunc;