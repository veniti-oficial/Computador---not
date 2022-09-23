create database praticaFuncionario;
use praticaFuncionario;
drop database praticaFuncionario;
create table setor(
iSetor int primary key auto_increment,
nome varchar(15),
andar int
);

create table funcionario(
idFuncionario int primary key auto_increment,
nome varchar(20),
telefone char(14),
salario decimal(7,2),
check (salario > 0),
fkSetor int,
foreign key (fkSetor) references setor(iSetor)
)auto_increment=100;

create table acompanhante(
idAcompanhante int auto_increment,
nome varchar(20),
relacao varchar(20),
fkFuncionario int,
foreign key (fkFuncionario) references funcionario(idFuncionario),
primary key (idAcompanhante, fkFuncionario)
)auto_increment=1000;

insert into setor values
(null, 'Peças', 2),
(null, 'Correspondência', 4);

insert into funcionario values
(null, 'Kauê', '(11)94545-6565', 7890.2, 1),
(null, 'Bruno', '(14)97878-6565', 5890.2, 1),
(null, 'Breno', '(11)92323-6565', 4678.2, 2),
(null, 'Igor', '(11)99898-6565', 8890.2, 2);
select * from funcionario;
insert into acompanhante values
(null, 'Nicole', 'Prima', 101),
(null, 'Juliana', 'Amiga', 100),
(null, 'Cristian', 'Amigo', 100),
(null, 'Matilde', 'Namorada', 102),
(null, 'Gabi', 'Namorada', 103);

select setor.nome as 'Nome do Setor', funcionario.nome as 'Nome do Funcionário' from funcionario join setor on iSetor = fkSetor;

select setor.iSetor as 'Identificação do Setor', setor.nome as 'Nome do Setor', setor.andar as 'Número do Andar', funcionario.nome as 
'Nome do Funcionario' from setor join funcionario on setor.iSetor = funcionario.fkSetor where iSetor = 1;

select funcionario.nome as 'Nome do Funcionário', acompanhante.nome as 'Nome do Acompanhante' from funcionario join acompanhante on 
funcionario.idFuncionario = acompanhante.fkFuncionario;

select funcionario.nome as 'Nome do Funcionário', acompanhante.nome as 'Nome do Acompanhante', acompanhante.relacao as 'Tipo de Relação' from funcionario join acompanhante on 
funcionario.idFuncionario = acompanhante.fkFuncionario where idFuncionario = 100;

select setor.nome as 'Nome do Setor', funcionario.nome as 'Nome do Funcionário', acompanhante.nome as 'Nome do Acompanhante' from setor
join funcionario join acompanhante on setor.iSetor = funcionario.fkSetor and funcionario.idFuncionario = acompanhante.fkFuncionario;

select sum(funcionario.salario) as 'Soma dos Salários', truncate(avg(funcionario.salario),2) as 'Média dos Salários' from funcionario;

select max(funcionario.salario) as 'Maior Salário', min(funcionario.salario) as 'Menor Salário' from funcionario;

select count(funcionario.salario) as 'Quantidade de Salários Cadastrados' from funcionario;

select funcionario.salario as 'Salários' from funcionario where funcionario.salario > 5000;