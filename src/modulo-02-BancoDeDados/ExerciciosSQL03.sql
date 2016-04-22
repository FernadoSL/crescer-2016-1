--1
select Emp.NomeEmpregado, Dep.NomeDepartamento from Empregado as Emp
inner join 
Departamento as Dep on Dep.IDDepartamento = Emp.IDDepartamento

--2
Select A.Nome, C.Nome from Associado as A
left join 
Cidade as C on A.IDCidade = C.IDCidade

--3
Select UF, count(UF) from cidade
group by uf

select (A.IDCidade) from Associado as A