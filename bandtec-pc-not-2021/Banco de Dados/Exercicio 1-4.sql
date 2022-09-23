use faculdade;

CREATE TABLE Aluno (
    ra INT PRIMARY KEY AUTO_INCREMENT,
    nomeAluno VARCHAR(45),
    bairro VARCHAR(45)
)  AUTO_INCREMENT=1000;

create table curso(
idCurso int primary key auto_increment,
nomeCurso varchar(45),
coordenador varchar(45)
);

create table Matricula(
fkRa int, foreign key (fkRa) references Aluno(ra),
fkCurso int, foreign key (fkCurso) references curso(idCurso),
dtInicio date,
primary key(fkRa,fkCurso, dtInicio),
media decimal(4,2),
nivel char(2)
);

insert into Aluno values
(null, 'Eduardo', 'Centro'),
(null, 'Luiza', 'Consolação'),
(null, 'Pedro', 'Paraiso'),
(null, 'Bruna', 'Mogi'),
(null, 'rafa', 'nova york');

insert into Curso value
(null,'Inglês','Zé'),
(null,'Espanhol','Zazá'),
(null,'Mandarin','Zilu');


insert into Matricula Values
(1000, 1, '2020-11-09', 5.6,'B1'),
(1001, 1, '2020-11-09', 8.3,'A1'),
(1002, 2, '2020-05-11', 7.6,'B2'),
(1001, 3, '2020-11-09', 5.6,'B1');

-- selecione todas as tabelas separadamente
select*from Aluno;
select*from Curso;
select*from matricula;

select nomeAluno, nomeCurso, nivel from Aluno join Matricula on fkRa = ra  join Curso on fkCurso = idCurso where idCurso = '1';
-- 
SELECT 
    nomeAluno, bairro, nomeCurso, coordenador, media, nivel
FROM
    Aluno
        JOIN
    Matricula ON ra = fkRa
        JOIN
    curso ON idCurso = fkCurso;

select*from curso;




