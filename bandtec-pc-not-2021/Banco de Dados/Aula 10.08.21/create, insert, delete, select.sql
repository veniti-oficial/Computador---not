-- criar banco de dados faculdade;
create database faculdade;

-- selecionar o banco de dados faculdade;
use faculdade;

create table aluno (
ra char(8) primary key,
nome_aluno varchar(100),
bairro varchar(75),
email varchar (50)
);

select*from aluno;

insert into aluno values(
'01212037', 'Victor Veniti de Sousa Melo', 'vila nova york', 'victorveniti@hotmail.com'
);

insert into aluno values
('01212137', 'Paula', 'Jardim delcito', 'paula@bandtec.com.br'),
('01212153', 'Matheus', 'vila maria', 'matheus@bandtec.com.br'),
('01212072', 'Sara', 'São miguel', 'sara@bandtec.com.br'),
('01212039', 'Willains', 'Jardim Rosana', 'willians@bandtec.com.br'),
('01212999', 'Vivian Silva', 'Michigan', 'Vivian@bandtec.com.br');

insert into aluno values
('01212888', 'Isabela Leal', 'primavera II', 'isaleal@bandtec.com.br');

select nome_aluno, ra from aluno;
select nome_aluno, bairro from aluno;
select nome_aluno, email from aluno;

select email, nome_aluno from aluno where nome_aluno = '';
select email, nome_aluno from aluno where bairro = 'Jardim Rosana' or bairro = 'primavera II';

select bairro from aluno
	where bairro like 'primavera%';
    
    select nome_aluno, ra from aluno
		where nome_aluno like '_i%';
        
			select nome_aluno, ra from aluno
				where nome_aluno like '% _e%';
                
					select nome_aluno, ra from aluno
						where nome_aluno <> 'vivian silva';
                        

update aluno set nome_aluno = 'Sara oliveira' where ra = '01221072'
        