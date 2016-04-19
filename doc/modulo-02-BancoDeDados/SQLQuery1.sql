create table Cidade(

IDCIdade int NOT NULL ,
Nome varchar(30) NOT NULL,
UF varchar(2) NOT NULL,
	
);

ALTER TABLE Cidade ADD
	CONSTRAINT PK_Cidade PRIMARY KEY (IDCidade)

SELECT * FROM Cidade

INSERT INTO Cidade
	(IDCidade, Nome, UF)
	VALUES
	(1,'São Leopoldo', 'RS');

DROP TABLE Cidade;

create table Cidade(

IDCIdade int NOT NULL ,
Nome varchar(30) NOT NULL,
UF varchar(2) NOT NULL,
		CONSTRAINT PK_Cidade PRIMARY KEY (IDCidade),
		CONSTRAINT UK_Cidade_Nome Unique (Nome)
);

INSERT INTO Cidade
	(IDCidade, Nome, UF)
	VALUES
	(1, 'São Leopoldo', 'RS');

CREATE TABLE Cliente(

IDCliente int IDENTITY NOT NULL,
Nome varchar(30) NOT NULL,
Endereco varchar(35),
Bairro varchar(35),
IDCudade int
);

INSERT INTO Cliente
	(Nome)
	VALUES
	('Sla');

CREATE TABLE Empregado(
IDEmpregado int NOT NULL,
Nome varchar(50),
Sexo char(1),
IDCidade int NOT NULL,
	constraint PK_Empregado Primary Key (IDEmpregado),
	constraint CC_Empregado_Sexo Check (Sexo in('F', 'M')),
	constraint FK_Empregado_Cidade Foreign Key (IDCidade)
		References Cidade(IDCidade)
)