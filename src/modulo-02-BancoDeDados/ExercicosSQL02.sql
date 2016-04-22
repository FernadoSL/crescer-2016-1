--1
Select Nome,
	Left(Nome, CHARINDEX(' ', Nome)) as PrimeiroNome
from Associado

--2
Select Nome,
	(Year(GETDATE()) - Year(DataNascimento)) as Idade
from Associado

--3
Select NomeEmpregado, datediff(Month, DataAdmissao, convert(datetime, '31/12/2000', 103)) as MesesTrabalhados
	from Empregado
where  DataAdmissao BETWEEN convert(datetime,'01/05/1980', 103) and convert(datetime,'20/01/1982', 103)

--4
Select top 1 Cargo, COUNT(1) as NumeroEmpregados From Empregado Group By Cargo Order by count(IDEmpregado) desc;

--6
select nome, 
	Dateadd(year, 50,dataNascimento) as Data50Anos, 
	Datename(weekday,Dateadd(year, 50, dataNascimento)) as DiaDaSemana
from Associado

--7
select UF, COUNT(1) from cidade
group by UF

--8
select uf, nome, count(*) as numeroDeIguais from cidade
group by uf, Nome
having count(*)>1

--9
select Max(idassociado)+1 as ProximoId from Associado

--10
truncate table CidadeAux
insert into CidadeAux (IDCidade, nome, uf) 
select MIN(IDCidade) as menorID, Nome, uf
from cidade
group by uf, Nome


--11
update Cidade
	set nome = '*' + Nome
where Nome in
  (select Nome from Cidade
   group by Nome
   having Count(Nome)>1)
and uf in
  (select uf from Cidade
   group by UF
   having Count(UF)>1)

--12
select Nome, 
	Case 
		when sexo = 'F' then 'Feminino' 
		when sexo = 'M' then 'Masculino'
	End as Genero from associado

--13
select NomeEmpregado, salario,
	Case
		when salario < 1164 then 0
		when salario > 2326 then 27.5
		else 15
	end as PorcentagemImposto from Empregado

--14
delete from Cidade
where (select Nome from cidade
	   group by UF
	   having count(UF)>1)



