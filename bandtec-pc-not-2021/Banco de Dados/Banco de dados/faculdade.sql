create database faculdade;
use faculdade;

create table Aluno (
RA int primary key not null,
nome varchar(100) not null,
email varchar(50) not null,
bairro varchar(50) not null
);

create table empresa (
idEmpresa int primary key,
nomeEmpresa varchar(50),
responsavel varchar(40)
);

insert into Aluno values
(01212037, 'victor veniti', 'victor.smelo@bandtec.com.br', 'vila nova york'),
(01212132, 'Nicolas moreira', 'nicolas.moreira@bandtec.com.br', 'jardim antartica'),
(01212079, 'Matheus Ferreira','matheus.ferreira@bandtec.com.br', 'jardim emia');

insert into empresa values
(01, 'fleury', 'Maria'),
(02, 'C6', 'Pedro'),
(03, 'Tivit', 'Camila'),
(04, 'safra', 'Natalia');

-- Exibir todos os dados ta tabela
select*from empresa;

-- Exibir apenas os nomes e os responsaveis da empresa
select nomeEmpresa, responsavel from empresa;

-- Exibir os dados da tabela ordenados pelo nome da empresa
select * from empresa order by nomeEmpresa;

-- Exibir os dados da tabela, ordenados pelo responsavel da empresa em ordem decrescente
select * from empresa order by responsavel desc;

-- Exibir os dados da tabela, empresa cujo nome contenha a letra R
select*from empresa where nomeEmpresa like '%r%';

-- Exibir os dados da tabela, empresa cujo o nome comece com uma determinada letra  
select*from empresa where nomeEmpresa like 'C%';

-- Exibir os dados da tabela, cujo nome da empresa tenha a penultima letra r
select*from empresa where nomeEmpresa like '%r_';

-- atualize os responsaveis da empresa c6, responsavel = 'Paulo' Exiba os dados da tabela apos a atualização
update empresa set responsavel='paulo' where idEmpresa = '02'; 
select*from empresa;

-- Exclua a empresa cujo nome é 'tivit'. Exiba os dados da tabela para verificar a exclusão.
delete from empresa where idEmpresa = '03';
select*from empresa;

-- Eliminar a tabela 
drop table empresa;


 -- Aula --
 
 -- adicionando o campo de chave estrangeira na tabela
alter table aluno add fkEmpresa int;
desc empresa;

-- referenciando a chave estrangeira entre as tabelas
alter table aluno add foreign key (fkEmpresa) references empresa(idEmpresa);

-- referenciado as fk

update aluno set fkEmpresa = '02' where ra='01212037';
update aluno set fkEmpresa = '04' where ra = '01212079';
update aluno set fkEmpresa = '01' where ra = '01212132';

-- select  referenciando a primary com a chave estranjeira
select*from aluno, empresa where idEmpresa = fkEmpresa;

-- select uma empresa e relacionando com aluno
select*from aluno, empresa where idEmpresa = fkEmpresa and nomeEmpresa = 'c6';
select*from aluno, empresa where fkEmpresa = idEmpresa and nomeEmpresa  in('safra', 'c6');

-- selecionando alguns dadods da tabela
select ra, nome, email, bairro,idEmpresa, nomeEmpresa, responsavel from aluno, empresa where idEmpresa = fkEmpresa and nomeEmpresa = 'c6';


-- select que ela quer
select nome as 'nome do aluno', email, bairro, nomeEmpresa as 'nome da empresa', responsavel from aluno join empresa on idEmpresa = fkEmpresa;

-- outra aula

create table sensor (
idSensor int primary key auto_increment,
nomeSensor varchar(50),
localSensor varchar(75),
temperatura double not null,
dtTemp datetime default current_timestamp,
statusSensor varchar(40),
check(statusSensor = 'ativo' or 
		  statusSensor='inativo')
);
-- current_timestamp coloca a data atual do sistema automaticamente usar o comando 'select sysdate()' para ver o tempo em tempo real

insert into sensor (nomeSensor, localSensor, temperatura, statusSensor) values
('sensor A', 'Estufa alfa', 34.8, 'ativo');

select*from sensor; 

alter table sensor drop check sensor_chk_1; -- como dropar um check da tabela

alter table sensor add check (statusSensor = 'ativo' or statusSensor = 'inativo' or statusSensor = 'Manutenção'); -- adicionando um check na tabela

insert into sensor (nomeSensor, localSensor, temperatura, statusSensor) values
('sensor b', 'Estufa Beta', '24.6', 'PerdaTotal');

insert into sensor (nomeSensor, localSensor, Temperatura, statusSensor) values
('Sensor C', 'Estufa Charlie', '23.7', 'inativo'),
('Sensor D', 'Estufa Delta', '25.4', 'ativo'),
('Sensor E', 'Estufa echo', '25.6', 'manutenção');

select count(idSensor) from sensor; -- mostrar quantos campos preenchidos eu tenho na coluna, se algum tiver null ele não conta
select sum(temperatura) from sensor; --  ele soma os dados de uma coluna
select avg(temperatura) from sensor; -- Ele traz a média dos dados de uma coluna
select round(avg(temperatura),2) from sensor; -- Ele seta X numeros depois da virgula
select truncate(avg(temperatura),2) from sensor; -- Ele não deixa arredondar o valor
select max(temperatura) from sensor; -- me traz a temperatura maximo de um campo da tabela
select min(temperatura) from sensor; -- me traz a temperatura minima de um sensor
select min(temperatura), max(temperatura) from sensor; -- me traz a temperatura maxima e minima no memso comando
select min(temperatura) as 'temperatura minima' , max(temperatura) as 'temperatura minima' from sensor; -- dando apelido as colunas





