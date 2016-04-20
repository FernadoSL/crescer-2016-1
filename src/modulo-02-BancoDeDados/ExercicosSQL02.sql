--1
Select Nome,
	Left(Nome, CHARINDEX(' ', Nome)) as PrimeiroNome
from Associado

--2
Select Nome,
	(Year(GETDATE()) - Year(DataNascimento))
from Associado

--3
Select NomeEmpregado, datediff(Month, DataAdmissao, convert(datetime, '31/12/2000', 103)) as MesesTrabalhados
	from Empregado
where  DataAdmissao BETWEEN convert(datetime,'01/05/1980', 103) and convert(datetime,'20/01/1982', 103)
