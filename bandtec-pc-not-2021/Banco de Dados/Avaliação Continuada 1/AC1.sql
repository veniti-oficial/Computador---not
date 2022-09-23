use Continuada1;

create table Restaurante(
idRest int primary key,
nome varchar(40),
cep char(9),
tipo varchar(30)
);

insert into Restaurante values
(01, 'Tendall Grill', '05232-080', 'churrascaria'),
(02, 'Coração Mineiro', '02396-560', 'self-service'),
(03, 'Estrela de roma', '03458-673', 'bar e restarurante'),
(04, 'Burguer one', '05738-659', 'Hambuegueria'),
(05, 'Tendal grill', '02358-856', 'Churrascaria');

alter table Restaurante modify column tipo varchar(50);

select*from Restaurante;

select nome, tipo from Restaurante;

select* from restaurante where tipo = 'Churrascaria';

select* from Restaurante where cep ='02358-856';

select*from Restaurante order by nome;

select * from Restaurante order by tipo desc;

select* from Restaurante where nome like 'T%';

select* from Restaurante where cep like '%6';

select* from Restaurante where tipo like '_h%';

select* from Restaurante where nome like '%n_';

update Restaurante set cep ='05232-080' where idRest = '05';

   
  
