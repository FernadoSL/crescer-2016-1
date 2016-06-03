create function Id_Ultimo_Concurso return number as
  vData Concurso.DATA_SORTEIO%type;
  vID number;
begin 
  select max(DATA_SORTEIO) 
  into vData
  from Concurso;
  
  select IDConcurso 
  into vID
  from Concurso
  where DATA_SORTEIO = vData;
  
  return vId;
end;

create function VALOR_ARRECADADO (pId number) return number as
  vValor number;
begin
  select sum(valor) 
  into vValor
  from aposta
  where IDCONCURSO = pId;
  
  return vValor;
end;

create or replace function GERA_VALOR return number as
  vValor number;
  vAcumulou number;
  vIdUltimoConcurso number;
  vPremioUltimaSena number;
begin
  vIdUltimoConcurso := Id_Ultimo_Concurso;
  vValor := VALOR_ARRECADADO (vIdUltimoConcurso);
  
  select ACUMULOU 
  into vAcumulou
  from CONCURSO
  where IDCONCURSO = vIdUltimoConcurso; 
  
  select PREMIO_SENA
  into vPremioUltimaSena
  from CONCURSO
  where IDCONCURSO = vIdUltimoConcurso; 
  
  vValor := (vValor * 45,3)/100;
  
  if(vAcumulou > 0) then
    vValor := vValor + vPremioUltimaSena;
  end if;
  
  return vValor;
end;

begin
  DBMS_OUTPUT.PUT_LINE(GERA_VALOR);
end;

update CONCURSO set ACUMULOU = 1 where IDCONCURSO = 1824;
