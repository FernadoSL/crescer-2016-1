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

begin
  dbms_output.put_line(Id_Ultimo_Concurso);
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

begin
  DBMS_OUTPUT.PUT_LINE(VALOR_ARRECADADO(Id_Ultimo_Concurso));
end;