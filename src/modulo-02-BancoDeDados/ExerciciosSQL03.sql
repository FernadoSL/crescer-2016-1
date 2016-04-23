--1
select Emp.NomeEmpregado, Dep.NomeDepartamento from Empregado as Emp
inner join 
Departamento as Dep on Dep.IDDepartamento = Emp.IDDepartamento

--2
Select A.Nome, C.Nome from Associado as A
left join 
Cidade as C on A.IDCidade = C.IDCidade

--3 Obs.: No minha table de associados apenas um tem uma cidade associada no RS
Select UF, count(UF) as NumeroCiadesSemAssociados from cidade as C 
left join
Associado as A on A.IDCidade = C.IDCidade
where  A.IDCidade is null
group by UF

select * from Associado 

--4
select a.nome, c.Nome as Cidade, case 
	when	c.uf = 'RS' then '***'
	when	c.UF = 'SC' then '***'
	when	c.UF = 'PR' then '***'
	else NULL 
end as PertenceRegiaoSul
from Associado as a		
left join
cidade as c on c.IDCidade = a.IDCidade

--5
select  e1.NomeEmpregado as NomeGerente,
		e2.NomeEmpregado as NomeEmpregado,
		d1.NomeDepartamento as DepartamentoGerente,
		d2.NomeDepartamento as DepartamentoEmpregado
		from empregado as e1
right join
empregado as e2 on e1.IDEmpregado = e2.IDGerente
left join
Departamento as d1 on e1.IDDepartamento = d1.IDDepartamento
left join
Departamento as d2 on e2.IDDepartamento = d2.IDDepartamento

--6
select * into EmpregadosCopy from Empregado

update EmpregadosCopy 
	set Salario = EmpregadosCopy.Salario + ((Salario/100) * 14.5)
from EmpregadosCopy
inner join departamento on EmpregadosCopy.IDDepartamento = Departamento.IDDepartamento
where (Departamento.Localizacao = 'Sao Paulo')

--8 Obs.: existe um salario maior na lista porém este não está vinculado a nenhum departamento
select top 1 Salario, d.NomeDepartamento
from Empregado as e
inner join
Departamento as d on d.IDDepartamento = e.IDDepartamento
order by Salario desc

--9
select a.nome as NomeAssociado, c.nome as CidadeAssociado, 
	   e.nomeEmpregado as NomeEmpregado, d.Localizacao as CidadeEmpregado
from Associado as a
right join 
Cidade as c  on a.IDCidade = c.IDCidade
right join
Departamento as d on d.Localizacao = c.Nome
right join
Empregado as e on e.IDDepartamento = d.IDDepartamento

--10
Select c.Nome, c.UF from Associado as a
inner join
Cidade as c on a.IDCidade = c.IDCidade
