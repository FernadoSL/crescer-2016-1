--01 retorna a lista por data de Admissao
select * From Empregado
order by DataAdmissao 

/*02 retorna a lista de atendentes e empregado com salario anual menor que 18500 
com os nomes dos empregados e seus salarios multiplicados por 12 com o apelido de salario anual
*/
Select NomeEmpregado, (Salario*12) as SalarioAnual from Empregado
where Cargo = 'Atendente' or (salario*12) < 18500

--03 retorna a tabela de cidades com o nome Uberlândia, mostrando seu ID e seu nome
select IDCidade, Nome from Cidade
where Nome = 'Uberlândia'

--04 retorna a tabela de cidades com o ID e nome das cidade de UF RS
select IDCidade, Nome from Cidade
where UF = 'RS'