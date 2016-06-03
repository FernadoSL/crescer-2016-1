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
