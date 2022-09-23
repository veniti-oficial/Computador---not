use sprint1;

create table pais(
idPais int primary key,
nome varchar (50),
capital varchar(30)
);

insert into pais values
('01', 'Brasil', 'Brasilia'),
('02', 'EUA', 'Washington'),
('03', 'Japão', 'Tokuio'),
('04', 'França', 'Paris'),
('05', 'Canada', 'Ottawa');

-- Configurando a chave estrangeira
alter table Atleta add fkPais int; 
alter table Atleta add foreign key Atleta(fkPais) references pais(idPais);

-- referenciando os atletas com os paises
update Atleta set fkPais = '01' where id_Atleta = '01';
update Atleta set fkPais = '05' where id_atleta = '02';
update Atleta set fkPais = '02' where id_atleta = '03';
update Atleta set fkPais = '03' where id_atleta = '04';
update Atleta set fkPais = '04' where id_Atleta = '05';
update Atleta set fkPais = '01' where id_Atleta = '06';
update Atleta set fkPais = '02' where id_Atleta = '07';

-- Exiba os dados dos atletas e dos paises correspondentes
select*from Atleta join pais on id_Atleta = idPais;

-- Exina os dados do atleta e do pais, mas somente de um determinado pais
select*from Atleta join pais on id_atleta = idPais where nomePais = 'Japão';

alter table pais rename column nome to nomePais;

select*from atleta;
--   Exercicio 2 ------------------------------------

select*from musica;

-- Criando tabela album
create table Album(
idAlbum int primary key,
nomeAbum varchar(45),
gravadora varchar(45)
);

-- Inserindo dados na tabela Album
insert into Album values
(01, 'Planeta', 'spotify'),
(02, 'Torches', 'Atlantic Records'),
(03, 'The Black Parade', 'Reprise Records'),
(04, 'TIME', 'Ki/oon Music'),
(05, 'Devil', 'avex entertainment Inc');

-- adicionando a coluna fkAlbum na tabela musica
alter table Musica add column fkEmpresa int;


-- Configurando chave estranjeira
alter table Musica add foreign key Musica(fkAlbum) References Album(idAlbum);

-- Coloque valores nessa coluna, de forma que cada musica inserida na tabela tenha um ALbum correspondente
update Musica set fkAlbum = '01' where idMusica = '01';
update Musica set fkAlbum = '02' where idMusica = '02';
update Musica set fkAlbum = '03' where idMusica = '03';
update Musica set fkAlbum = '04' where idMusica = '04';
update Musica set fkAlbum = '05' where idMusica = '05';

-- Exiba os dados das Musicas e o Album correspondente;
select*from Musica join Album on idMusica = idAlbum;

-- 	Exiba os dados das musicas e dos Albuns, mas somente de um determinado Album
select*from musica join Album on fkAlbum = idAlbum where nomeAlbum = 'Torches';

-- Exiba os dados das musica e dos albund, mas somente de uma determinada gravadora
select*from musica join album on fkAlbum = idAlbum where gravadora = 'spotify';

select*from album;