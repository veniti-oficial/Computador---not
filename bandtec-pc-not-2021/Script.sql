create database praticafuncionario;
use praticafuncionario;

create table setor(
idSetor int primary key auto_increment,
setor varchar(45),
andar int
);

create table funcionario(
idFunc int primary key auto_increment,
nomeFunc varchar(45),
telefone varchar(45),
salario double,
check (salario > 0),
fkSetor int,
foreign key (fkSetor) references setor(idSetor)
);
alter table funcionario modify salario decimal(10,2);


create table acompanhante(
idAcomp int auto_increment,
fkFuncionario int,
nomeAcomp varchar(45),
relacao varchar(45),
dataNasc date,
primary key(idAcomp,fkFuncionario),
foreign key (fkFuncionario) references funcionario(idfunc)
);


insert into acompanhante values
(null, 1, 'Lisandra Zambujal Passarinho', 'irmão', '1996/10/25'),
(null, 2, 'Diego Quintela Torquato', 'Filho', '2005/08/23'),
(null, 2, 'Cássia Aranha Jordão', 'Mãe', '1978/04/25'),
(null, 3, 'Zaqueu Pontes Antunes', 'Pai', '1976/03/18'),
(null, 4, 'Eleonor Cabral Chainho', 'Filha', '1986/04/25');

insert into funcionario values
(null, 'Aline Grilo Garrido', '11987357625', 4200, 1),
(null, 'Pavel Monforte Janes', '11974279825', 5600, 2),
(null, 'Janilson Basílio Areosa', '11967348726', 3200.5, 1),
(null, 'Janaína Almeida Brasil', '11976378736', 6700.38, 2),
(null, 'Victor Veniti', '11975285232', '14.200', null);
update funcionario set salario = '6700.37' where idfunc = 4;
select*from funcionario;


insert into setor values
(null, 'RH', 6),
(null, 'Administração', 3);

-- Exibir os dados da tabela criada separadamente.
select*from funcionario;
select*from setor;
select*from acompanhante;

-- Exibir os dados dos setores e dos seus respectivos Funcionarios.
select setor, andar as 'andar do setor', nomeFunc as 'nome funcionario', telefone, salario 
	from setor join funcionario on idSetor = fkSetor;

-- Exibir os dados de um determinado setor e dos seus respectivos funcionarios.
select setor, andar as 'andar do setor', nomeFunc as 'nome funcionario', telefone, salario 
	from setor join funcionario on idSetor = fkSetor where setor = 'RH';

-- Exibir os dados dos funcionarios e seus acompanhantes.
select nomeFunc as 'nome funcionario', telefone, salario, nomeAcomp as 'Nome do acompanhante', relacao as 'relação', dataNasc as 'Data de Nascimento' 
	from funcionario join acompanhante on idFunc = fkFuncionario; 

-- Exibir os dados de apenas um funcionario e os dados de seus acompanhantes.
select nomeFunc as 'nome funcionario', telefone, salario, nomeAcomp as 'Nome do acompanhante', relacao as 'relação', dataNasc as 'Data de Nascimento' 
	from funcionario join acompanhante on idFunc = fkFuncionario where nomeFunc = 'Pavel Monforte Janes';

-- Exibir os dados dos funcionários, dos setores em que trabalham e dos seus acompanhantes.
select setor, andar as 'andar do setor', nomeFunc as 'nome funcionario', telefone, salario, nomeAcomp as 'Nome do acompanhante', relacao as 'relação', dataNasc
	from Setor join Funcionario on idSetor = fkSetor join Acompanhante on idFunc = fkfuncionario; 
    
-- Exibir a soma e a media dos salario dos Funcionarios.
select truncate(Sum(salario),2) as 'Soma dos Salarios',  truncate(avg(salario),2) as 'Media dos salarios' from Funcionario;

-- Exibir a soma e a media dos salario dos Funcionarios mas somente dos salarios maiores que um determinado valor.
select truncate(Sum(salario),2) as 'Soma dos Salarios',  truncate(avg(salario),2) as 'Media dos salarios' from Funcionario where salario > 5000;

-- Exibir o maior e o menor salario dos Funcionarios.
select truncate(Max(salario),2 ) as 'Maior salario', truncate(Min(salario),2) as 'Menos salario' from Funcionario;

-- Exibir a quantidade de salarios cadastrados.
select count(salario) as 'Quantidade de salarios' from Funcionario;

-- Exibir os salarios dos funcionarios porem menor que um determinado valor;
select count(salario) as 'Quantidade de salarios' from Funcionario where salario < 5000;




