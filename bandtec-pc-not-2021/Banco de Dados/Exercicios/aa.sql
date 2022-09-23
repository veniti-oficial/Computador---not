-- Augusto ( criação da tabela funcionário )
create database iParking;
use iParking;
create table Funcionário (
idFuncionário int primary key auto_increment,
NomeFuncionário varchar(45),
Cargo varchar(45),
CPF char(11),
Login varchar (15),
senha varchar(15),
TelefoneFixo char(10),
celular char(11)) auto_increment = 1;
insert into Funcionário ( nomefuncionário, cargo, cpf, telefonefixo, celular ) values
('Joaquim Alves', 'Gerente', 34576532124, 1125412112, 11988256612),
('João Siqueira', 'Monitor', 24564578677, 1125467543, 11987456754),
('Murilo Pinto', 'Estagiário', 65647871231, 1145663433, 11934587766),
('Maicon Douglas', 'Líder', 77838342471, 1133798654, 11997965435),
('Brenda Rosa', 'Monitora', 36345479888, 1165564489, 11909066784),
('Márcia Teixeira', 'Estagiária', 71245699233, 1123234871, 11914234567),
('Gabriel Fernandez', 'Estagiário', 73345625253, 1123234567, 11989766347),
('Fernanda Barbosa', 'Líder', 66245625563, 1175734871, 11972334547),
('Gabriel Silva', 'Líder', 67745625665, 1122734231, 11922366547),
('Natan', 'Gerente', 11745525345, 1125534791, 11951367587),
('Genésio', 'Gerente', 67745625665, 1122734231, 11922366547),
('Anastácia', 'Monitora', 99745235775, 1131534771, 11945366549),
('Junior', 'Estagiário', 91275235345, 1195234851, 11959266219),
('Beatriz', 'Estagiária', 95385238995, 1132224741, 11942786579),
('Jeniffer', 'Estagiária', 11745145788, 1135637781, 11988321569),
('Alisson', 'Estagiário', 44742232695, 1131884274, 11943876316);

select * from funcionário;

-- Christian(criação da tabela empresa) -- 

create table empresa(
    idEmpresa int primary key auto_increment,
    nomeEmpresa varchar(80),
    email varchar(45),
    cnpj char(14),
    telefone char(10),
    data_criaçao date
);

insert into empresa (nomeEmpresa, email, cnpj, telefone, data_criaçao) values
 ('EasyParking', 'easy@estacionamento.com.br', '00001234567899', '99999-9999', '2021-09-10'),
('Park Plus', 'parkplus@estacionamento.com.br', '00009876543211', '12345-5432', '2021-10-01'),
('HaVagas?', 'havagas@estacionamento.com.br', '00006547893215', '65415-4125', '2021-06-30'),
('vagas ja', 'vagasja@estacionamento.com.br', '00003216547416', '45612-0176', '2021-07-28');

select * from empresa;

-- Willians(Criação da tabela estacionamento) -- 

create table estacionamento(
 idEstacionamento int primary key auto_increment,
 nome VARCHAR(80),
 rua VARCHAR(80),
 numero VARCHAR(10),
 bairro VARCHAR(50),
 cep CHAR(8),
 qtdVagas VARCHAR(10)
 );

insert into estacionamento (nome,rua,numero,bairro,cep,qtdVagas) values
('EasyParking','Consuelo Corner','807','Vergel do Lago','13092150','42'),
('Park Plus','Mertz Vista','215','Jardim Apipema','40155200','81'),
('HaVagas','Alverta Village','528','Bonsucesso','78931000','78'),
('vagas ja','Chauncey Valleys','365','Park dos Buritis','20521110','69');

select * from estacionamento;

-- Christian criando  tabela sensor(parte de outro aluno...) --
 create table sensor (
     idSensor int primary key auto_increment,
     statusSensor char (1) check(statusSensor = 1 or statusSensor = 0),
     vagaSensor varchar (10),
     FkEstacionamento int
 );

desc sensor;
 insert into sensor (statusSensor, vagaSensor) values
 ('1', '1'),
 ('1', '2'),
 ('0', '3'),
 ('1', '4'),
 ('0', '5'),
 ('1', '6'),
 ('1', '7'),
 ('0', '8'),
 ('1', '9'),
 ('0', '10');
 
select*from sensor;

-- Alan (Criação tabela Leitura) --

create table Leitura(
idLeitura int primary key auto_increment,
fkSensor int,
horarioEntrada datetime,
horarioSaida datetime
)auto_increment = 1;

insert into Leitura (horarioEntrada,horarioSaida) values
('2021-09-02 12:02:34','2021-09-02 12:30:41'),
('2021-09-02 14:13:20','2021-09-02 15:32:11'),
('2021-09-04 08:45:31','2021-09-04 14:21:04'),
('2021-09-04 08:50:21','2021-09-04 09:12:36'),
('2021-09-04 10:12:02','2021-09-04 10:20:19'),
('2021-09-04 02:02:02','2021-09-04 20:20:20'),
('2021-09-07 03:23:00','2021-09-07 05:54:08'),
('2021-09-08 00:00:35','2021-09-09 13:46:38'),
('2021-09-11 18:47:22','2021-09-11 19:45:34');


-- Victor Veniti referenciando as tabelas e dando join nas tabelas --
select*from sensor;
select*from empresa;

alter table Funcionário add fkEmpresa int;

alter table Funcionário add foreign key Funcionário(fkEmpresa) references empresa(idempresa);

update Funcionário set fkEmpresa= '1' where idFuncionário in (1,2,3,4);
update Funcionário set fkEmpresa= '2' where idFuncionário in (5,6,7,8);
update Funcionário set fkEmpresa= '3' where idFuncionário in (9,10,11,12);
update Funcionário set fkEmpresa= '4' where idFuncionário in (13,14,15,16);


alter table estacionamento add fkEmpresa int;
alter table estacionamento add foreign key estacionamento(fkEmpresa) references empresa(idEmpresa);

update estacionamento set fkEmpresa = 1 where idEstacionamento = 1;
update estacionamento set fkEmpresa = 2 where idEstacionamento = 2;
update estacionamento set fkEmpresa = 3 where idEstacionamento = 3;
update estacionamento set fkEmpresa = 4 where idEstacionamento = 4;

alter table sensor add foreign key sensor(fkEstacionamento) references Empresa(idEmpresa);
select*from sensor;
select*from estacionamento;

update sensor set fkEstacionamento = '1' where idSensor in (1,2,3);
update sensor set fkEstacionamento = '2' where idSensor in (4,5,6);
update sensor set fkEstacionamento = '3' where idSensor in (7,8);
update sensor set fkEstacionamento = '4' where idSensor in (9,10);

select*from leitura;
select*from sensor;
alter table leitura add foreign key leitura(fkSensor) references sensor(idSensor);

update leitura set fkSensor = '1' where idLeitura = '1';
update leitura set fkSensor = '2' where idLeitura = '2';
update leitura set fkSensor = '3' where idLeitura = '3';
update leitura set fkSensor = '4' where idLeitura = '4';
update leitura set fkSensor = '5' where idLeitura = '5';
update leitura set fkSensor = '6' where idLeitura = '6';
update leitura set fkSensor = '7' where idLeitura = '7';
update leitura set fkSensor = '8' where idLeitura = '8';
update leitura set fkSensor = '9' where idLeitura = '9';

select nomeFuncionário as 'nome do funcionario', Cargo, CPF, TelefoneFixo as 'Telefone fixo', celular,
	   nomeEmpresa as 'nome da empresa', email, cnpj, telefone, data_criaçao, senha,
       nome as 'nome estacionamento', rua, numero, bairro, cep, qtdVagas,
       statusSensor as 'status do sensor', vagaSensor 'vaga do sensor',
       horarioEntrada as 'horario de entrada', horarioSaida 'horario de saida', placa as 'placa do carro'
	from Funcionário join Empresa on Funcionário.fkEmpresa = Empresa.idEmpresa 
		join Estacionamento on estacionamento.FkEmpresa = Empresa.idEmpresa 
			join Sensor on fkEstacionamento = idEstacionamento
				join Leitura on fkSensor = idSensor;
       


