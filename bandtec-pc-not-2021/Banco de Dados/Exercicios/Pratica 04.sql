create database pratica;
use pratica;

create table Alunos(
RA int primary key,
nomeAluno  varchar(45),
email varchar (45)
);

create table Grupos(
idGrupo int primary key,
nomeGrupo varchar(45),
Projeto varchar(200)
);

create table professor(
idProfessor int primary key auto_increment,
nomeProfessor varchar(45),
disciplina varchar(45)
) auto_increment = 1000;

create table avaliação(
 Nota1 int,
 Nota2 int,
 dataNota datetime
 );

insert into Alunos values
(01212001, 'Kamila com k', 'kamila.silva@bandtec.com.br'),
(01212002, 'Matheus Ferreira', 'Matheus.Ferreira@bandtec.com.br'),
(01212003, 'Nicolas lima', 'Nicolas.lima@bandtec.com.br'),
(01212004, 'Raylane dos santos', 'raylane.santos@bandtec.com.br'),
(01212005, 'rayan de oliveira', 'rayan.oliveira@bandtec.com.br'),
(01212006, 'Victor Veniti de Sousa Melo', 'Victor.Smelo@banctec.com.br');

insert into Grupos values
(01, 'bandcafe', 'medidor de temperatura de café'),
(02, 'bandgarage','sensor de estacionamento de garagem'),
(03, 'bandluz', 'sensor de luminosidade de ambiente');

insert into Professor values 
(null, 'Fernando Brandão', 'Pesquisa e inovação'),
(null, 'Vivian', 'Banco de dados'),
(null, 'Marise', 'Arq comp.') ,
(null, 'thiago', 'Tecnologia da informação'),
(null, 'frizza', 'Algoritmo'),
(null, 'rafa', 'Banco de dados');

select*from Alunos;
select*from Grupos;
select*from Professor;
select*from avaliação;


alter table Alunos add column fkGrupo int;
alter table Alunos add foreign key Alunos(fkGrupo) references Grupos(idGrupo);

update Alunos set fkGrupo = '01' where RA = '01212001';
update Alunos set fkGrupo = '01' where RA = '01212002';
update Alunos set fkGrupo = '02' where RA = '01212003';
update Alunos set fkGrupo = '02' where RA = '01212004';
update Alunos set fkGrupo = '03' where RA = '01212005';
update Alunos set fkGrupo = '03' where RA = '01212006';

select*from alunos join grupos on idGrupo = fkGrupo;

alter table avaliação add fkProfessor int;
alter table avaliação add fkAluno int;

select*from alunos a join grupos on fkGrupo = idGrupo join avaliação on fkGrupo = idGrupo join professor on idProfessor = fkProfessor;





