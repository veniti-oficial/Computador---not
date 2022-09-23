create database Revista;
use Revista;

create table Revista(
idRevista int primary key auto_increment,
nome varchar(40),
categoria varchar(30)
)auto_increment = 0;

insert into Revista values 
(null, 'veja', null),
(null, 'Isto é', null),
(null, 'Época', null),
(null,'Quatro Rodas', null);

-- Exibir todos os dados da tabela
select*from revista;

-- Atualize os dados das categorias das 3 revistas inseridas, exibir os dados da tabela novamente para verificar se atualizou corretamente
update Revista set categoria = 'Carros' where idRevista = '4';

update Revista set categoria = 'Noticias' where idRevista = '1';
update Revista set categoria = 'Noticias' where idRevista = '2';
-- ou
update Revista set categoria = 'Noticias' where idRevista in (1,2); 

select*from revista;

-- insira mais 3 registros completos
insert into revista values
(null, 'motor show', 'veiculo'),
(null, 'contigo', 'moda'),
(null, 'vogue', 'moda');

-- Exibir novamente os dados da tabela
select*from Revista;

-- Exibir a descrição da estrutura da tabela
desc Revista;

-- altere a tabela para que a coluna categoria possa ter no máximo 40 caracteres
Alter table Revista  modify column categoria varchar(40);

-- Exibir novamente a descrição da estrutura da tabela, para verificar se alterou o tamanho da coluna da categoria
desc revista;

-- acrescentar a coluna periodicidade á tabela, que é varchar (15)
alter table Revista add column periodicidade varchar(15);

select*from Revista;

-- Exluir a coluna  periodicidade da tabela
alter table Revista drop column periodicidade;




