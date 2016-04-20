select * From Empregado
order by DataAdmissao 

Select NomeEmpregado, (Salario*12) as SalarioAnual from Empregado
where Cargo = 'Atendente' or (salario*12) < 18500

select IDCidade, Nome from Cidade
where Nome = 'Uberlândia'

select IDCidade, Nome from Cidade
where UF = 'RS'