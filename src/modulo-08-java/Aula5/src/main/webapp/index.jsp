<%@page import="br.com.cwi.aula5.PessoaServlet"%>
<%@page import="br.com.cwi.aula5.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link href="css/cssForm.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Cadastramento Pessoas</h1>
        <div class="container-form">
            <form action="pessoa" method="POST">
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input id="nome" type="text" class="form-control" placeholder="Nome" name="Nome">
                </div>
                <div class="form-group">
                    <label for="idade">Idade:</label>
                    <input id="idade" type="number" class="form-control" placeholder="Idade" name="Idade">
                </div>
                <div class="form-group">
                    <input type="radio" name="gender" value="Masculino" checked> Masculino
                    <input type="radio" name="gender" value="Feminino"> Feminino
                    <input type="radio" name="gender" value="Outros"> Outros
                </div>
                    <button type="submit" class="btn btn-default">Enviar</button>
            </form>
        </div>     
        
        <ul>
        <% 
        for(Pessoa p : PessoaServlet.listaPessoas){
            out.append("<li>" + p.getNome() + " | " + p.getIdade() + " | " + p.getSexo() + "</li>");
        }
        %>
        </ul>
        
    </body>
</html>
