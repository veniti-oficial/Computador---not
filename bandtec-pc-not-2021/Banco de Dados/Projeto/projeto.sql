create database technological_parking;

use technological_parking;

create table cadastro(
idEmpresa int Primary key not null,
cnpj varchar(15) not null,
nome_empresa varchar(100) not null,
endereço varchar(100) not null,
numero varchar(10) not null,
bairro varchar(100) not null,
cidade varchar(50) not null,
cep varchar(10) not null,
telefone varchar(20) not null,
e_mail varchar(50) not null
);


insert into cadastro values
(01,80056151000109, 'stop', 'Rua Peru', '25', 'Residencial Recanto do Sol', 'Cuiabá-MT', '78089-040','132265-8574', 'stop.stop@gmail.com'),
(02,61930141000106, 'Digi Estacionamento', 'Avenida São Francisco', '523', 'Alvorada', 'Boa Vista-RR', '69317-186', '152635-9685', 'Digi.estacionamento@gmail.com'),
(03,50282605000190, 'Estacionamento Express', 'Rua São José da Laje','8536', 'Neópolis', 'Neópolis-RN', '59086-030', '112280-9875', 'estacionamento.express@gmail.com');

create table Gestor(
idGestor int primary key auto_increment not null,
nome varchar(10) not null,
cpf char(11) not null,
cargo varchar(3) not null
);

insert into gestor values
(01, 'Amanda Fonseca', '34567898764','CO'),
(02, 'joao das neves', '43576787656','administração'),
(03, 'enrick de andrade', '14567856476','gerente');

CREATE TABLE sensor (
    idSensor INT PRIMARY KEY NOT NULL,
    nVaga VARCHAR(10) NOT NULL,
    HoraEntrada VARCHAR(8) NOT NULL,
    HoraSaida VARCHAR(8) NOT NULL
);



insert into sensor values
(01, 15, '13:32:25', '15:30:29'),
(02, 20, '19:32:59', '21:20:32'),
(03, 25, '08:02:32', '16:32:25');
