-- a) Criar um banco de dados chamado Venda.
create database Venda;

-- b) Selecionar esse banco de dados.
use Venda;

-- c) Criar as tabelas correspondentes à sua modelagem.
create table vendas(
idVenda int primary key auto_increment,
total decimal(10,2),
dataVenda  DATE,
quantidade varchar(20),
desconto decimal(10,2)
);

create table cliente(
idCliente int auto_increment,
nome varchar(45),
email varchar(45),
rua varchar(45),
numero varchar(10),
cep char(8),
idIndicacao int
);
select*from cliente;
alter table cliente add foreign key cliente(idIndicacao) references cliente(idCliente);


create table produto(
idProduto int primary key auto_increment,
nome varchar(45),
descricao varchar(45),
preço decimal(10,2),
fkCliente int,
foreign key (fkCliente) references Cliente(idCliente),
fkVenda int,
foreign key (fkVenda) references vendas(idVenda)
);

-- d) Inserir dados nas tabelas, de forma que exista mais de uma venda para cada cliente, e mais de um cliente sendo indicado por outro cliente. 
insert into Vendas values
(null, 170, '2021/11/23', 6, 10),
(null, 280, '2021/11/22', 10, 20),
(null, 30, '2021/11/21', 1, 0),
(null, 60, '2021/11/20', 2, 0),
(null, 80, '2021/11/19', 3, 10),
(null, 140, '2021/11/18', 5, 10);

insert into cliente values
(1, 'Victor Veiti', 'victor.veniti@hotmail.com', 'avenida arraias do araguaia', 16, 03480080, 3),
(2, 'Matheus Ferreira', 'matheusferreira@bandtec.com.br', 'avenida alcantara machado', 17, 03465789, 1),
(3, 'Beatriz Veniti', 'beatriz.veniti@gmail.com', 'avenida arraias do araguaia', 16, 98735768, 4),
(4, 'Kamila Matos', 'kamila@bandtec.com.br', 'Avenida Brasil', 456, 08735674, 1),
(5, 'Raylane Ferreira', 'raylane@bandtec.com.br', 'avenida haddock lobo', 378, 08735475, 3);



insert into produto values
(null, 'camisa', 'roupa', 30, 1, 3),
(null, 'calça', 'roupa', 30, 2, 1),
(null, 'blusa', 'roupa', 50, 1, 2),
(null, 'tênis', 'roupa', 120, 3, 4),
(null, 'relogio', 'acessorio', 80, 4, 5);

-- e) Exibir todos os dados de cada tabela criada, separadamente.
select*from Vendas;
select*from produto;
select*from cliente;

-- g) Exibir os dados dos clientes e os dados de suas respectivas vendas

select cliente.nome as 'nome do cliente', email, rua, numero, cep, produto.nome as 'nome do produto', descricao, preço, total, dataVenda, desconto 
	from vendas join produto on idVenda = fkVenda join cliente on idCliente = fkCliente; 
    

-- h) Exibir os dados de um determinado cliente (informar o nome do cliente na consulta) e os dados de suas respectivas vendas.

select cliente.nome as 'nome do cliente', email, rua, numero, cep, produto.nome as 'nome do produto', descricao, preço, total, dataVenda, desconto 
	from vendas join produto on idVenda = fkVenda join cliente on idCliente = fkCliente where cliente.nome = 'Victor Veiti';
    
    -- i) Exibir os dados dos clientes e de suas respectivas indicações de clientes.

select nome as 'nome do cliente', email, rua, numero, cep from cliente join cliente on idIndicacao = idCliente;

-- m) Exibir apenas a data da venda, o nome do produto e a quantidade do produto numa determinada venda.

select Vendas.dataVenda as 'data da venda', produto.nome as 'nome do produto', quantidade as 'quantidade de venda' 
	from Vendas join produto on fkVenda = idVenda where idvenda = 1;
    
    -- n) Exibir apenas o nome do produto, o valor do produto e a soma da quantidade de produtos vendidos agrupados pelo nome do produto.
    
    select produto.nome as 'nome do produto', produto.preço as 'preço do produto', sum(vendas.quantidade) as 'quantidade de produtos vendidos'
		from produto join vendas on fkVenda = idVenda group by produto.nome;
        
	-- o) Inserir dados de um novo cliente. Exibir os dados dos clientes, das respectivas vendas, e os clientes que não realizaram nenhuma venda.
        
