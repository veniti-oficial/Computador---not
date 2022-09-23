	create database sprint1;

use sprint1;

create table Atleta (
idAtleta int primary key,
nome varchar(40),
modalidade varchar(40),
qtdMedalha int);

insert into Atleta values
(01, 'Victor Veniti de Sousa Melo', 'muay thai', 3),
(02, 'vinicius da Silva Ruiz', 'xadrez', 5),
(03, 'Isabela Leal', 'vôlei',3),
(04, 'Maria Teixeira', 'Natação', 3),
(05, 'Rafael Araujo', 'xadrez', 4),
(06, 'Igor silva', 'muay thai', 2),
(07, 'Yuri oliveira', 'Natação', 2);

-- Exibir todos os dados da tabela
select*from Atleta;

update atleta set modalidade ='natação' where idAtleta = '06';
select * from atleta where nome like 'V%';
alter table atleta modify column nome varchar(100);
alter table atleta add column abc varchar(30);
alter table atleta drop column abc;
select*from atleta order by qtdMedalha;
select*from atleta where modalidade = 'Natação';
select*from atleta where qtdMedalha;
update atleta set modalidade = 'judo' where idAtleta = '06';
alter table atleta modify column nome varchar(95);
select*from atleta where nome like 'v%';



-- Exibir apenas os nomes e quantidade de medalhas dos atletas
select nome, qtdMedalha from Atleta;

-- Exibir apenas os dados dos atletas de uma determinada modalidade
select idAtleta, nome, modalidade, qtdMedalha from Atleta where modalidade = 'muay thai';

-- Exibir os dados da tabela ordenados pela modalidade
select idAtleta, nome, modalidade, qtdMedalha from Atleta order by modalidade, qtdMedalha;

-- Exibir os dados da tabela, ordenados pela quantidade de medalhas, em ordem decrescente
select idAtleta, nome, modalidade, qtdMedalha from atleta order by qtdMedalha desc;

-- Exibir os dados da tabela, dos atletas cujo o nome contenha a letra S
select idAtleta, nome, modalidade, qtdMedalha from Atleta
	where nome like '%s%';
    
-- Exibir os dados da tabela, cujo o nome comece com uma determinada letra
select idAtleta, nome, modalidade, qtdMedalha from Atleta 
	where nome like 'I%';
    
-- Exibir os dados da tabela, cujo o nome termine com a letra O
    select idAtleta, nome, modalidade, qtdMedalha from Atleta
		where nome like '%o %';
	
-- Exibir os dados da tabela, cujo o nome tenha a penúltima letra R
    select idAtleta, nome, modalidade, qtdMedalha from Atleta
		where nome like '%r_ %';
	
-- Eliminar a tabela
drop table Atleta;

-- renomear um campo da tabela
alter table atleta rename column idAtleta to id_atleta;

desc atleta;

-- alterar varchar,char etc.. 
alter table atleta modify column nome varchar(75);

desc atleta;

-- adicionar um campo na tabela
alter table atleta add column dtNasc date;

desc atleta;

-- adicionar um dado na tabela
update atleta set dtNasc = '2000-01-27' where id_atleta = 04;

update atleta set dtNasc = '1997-03-26' where id_atleta in (05, 03);

delete from atleta where id_atleta = 6;

select*from atleta;

truncate 
        
-- TABELA MUSICA -----------------------------------------------------------------------------------------------------

create table Musica (
idMusica int primary key,
titulo varchar(40),
artista varchar (40),
genero varchar (40)
);

insert into Musica Values
(01, 'plutão', 'VMZ', 'mpb'),
(02, 'Houdini', 'Foster The People', 'indie'),
(03, 'Welcome To The Black Parade', 'My Chemical Romance', 'indie'),
(04, 'Silhouette', 'KANA-BOON', 'KPOP'),
(05, 'Vicke Blanka', ' Black Catcher', 'KPOP');

-- Exibir todos os dados da tabela
select*from Musica;

-- Exibir apenas os títulos e os artistas das Músicas
select titulo, artista from Musica;

-- Exibir apenas os dados das músicas de um determinado gênero
select idMusica, titulo, artista, genero from Musica where genero = 'indie';

-- Exibir apenas os dados das músicas de um determinado artista
select idMusica, titulo, artista, genero from Musica where artista = ' Black Catcher';

-- Exibir os dados da tabela ordenados pelos títulos da Música
select idMusica, titulo, artista, genero from musica order by titulo;

-- Exibir os dados da tabela ordenados pelo artista em ordem decrescente
select idMusica, titulo, artista, genero from musica order by titulo desc;

-- Exibir os dados da tabela, das músicas cujo títulos comece com uma determinada letra
select idMusica, titulo, artista, genero from musica
	where titulo like 'H%';
    
-- Exibir os dados da tabela, das músicas cujo artista termine com uma determinada letra
select idMusica, titulo, artista, genero from musica
	where artista like '%e';
    
-- Exibir os dados da tabela, das músicas cujo gênero tenha como segunda letra uma determinada letra
    select idMusica, titulo, artista, genero from musica
		where genero like '_n%';
        
-- Exibir os dados da tabela, das músicas cujo títulos tenha como penúltima letra uma determinada letra
	select idMusica, titulo, artista, genero from musica
		where titulo like '%n_';
        
-- Elime a tabela
drop table musica; 



