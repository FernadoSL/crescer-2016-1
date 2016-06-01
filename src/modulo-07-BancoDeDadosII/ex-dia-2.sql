Declare
  vNome VARCHAR(100);
  vNomeCidade VARCHAR(100);
  vId INTEGER;
  vSoma NUMBER;
  vPrimeiraData Date;
  vUltimaData Date;
Begin
  select cli.Nome , min(ped.DATAPEDIDO), max(ped.DATAPEDIDO), sum(ped.VALORPEDIDO), cid.NOME
  into vNome , vPrimeiraData, vUltimaData, vSoma, vNomeCidade
  from CLIENTE cli
  INNER JOIN PEDIDO ped on ped.IDCLIENTE = cli.IDCLIENTE 
  INNER JOIN CIDADE cid on cid.IDCIDADE = cli.IDCIDADE
  where cli.IDCLIENTE = &_IDCLIENTE
  group by cli.Nome, cid.NOME;
  
  DBMS_OUTPUT.PUT_LINE('Nome: ' || vNome || ' Data Primeiro Pedido: ' || vPrimeiraData || ' Data Ultimo Pedido: ' || vUltimaData || ' Soma de Pedidos: ' || vSoma || ' Nome da Cidade: ' || vNomeCidade);
End;

Declare
  vUf Cidade.UF%Type;
  vNome Cidade.Nome%Type;
  vExiste INTEGER;
Begin
  select cid.Uf , cid.NOME, count(1)
  into vUf , vNome, vExiste
  from Cidade cid
  where cid.Uf = upper('&_UF') and cid.NOME = '&_NomeCidade';
  if(vExiste > 0) then
    DBMS_OUTPUT.PUT_LINE('Nome: ');
  end if;
End;

select * from cidade;