<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="pessoa" method="GET">
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input id="nome" type="text" class="form-control" placeholder="Nome" name="Pessoa">
            </div>
            <div class="form-group">
                <label for="idade">Idade:</label>
                <input id="idade" type="text" class="form-control" placeholder="Nome" name="Pessoa">
            </div>
            <div class>
                
            </div>
                <button type="submit" class="btn btn-default">Enviar</button>
        </form>
        
        
    </body>
</html>
