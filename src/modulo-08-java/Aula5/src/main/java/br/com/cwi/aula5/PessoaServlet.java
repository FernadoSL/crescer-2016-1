/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.aula5;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.leandro
 */
@WebServlet(name = "Pessoa", urlPatterns = ("/pessoa"))
public class PessoaServlet extends HttpServlet{

    public static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //set tipo content
        resp.setContentType("text/html");
        
        //redirecionamento
        //resp.sendRedirect("");

        
        try (final PrintWriter out = resp.getWriter();) {
                out.append("<!DOCTYPE html>");
                out.append("<html>");
                out.append("<head>");
                out.append("<title>Java - aula5</title>");
                out.append("<meta charset=\"UTF-8\">");
                out.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                out.append("</head>");
                out.append("<body>");
                out.append("<h1>Pessoa</h1>");
                out.append("</body>");
                out.append("</html>");
            }    
        }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String nome = req.getParameter("Nome");
        int idade = parseInt(req.getParameter("Idade"));
        Sexo sexo = Sexo.valueOf(req.getParameter("gender"));
        
        Pessoa pessoa = new Pessoa(nome, idade, sexo);
        listaPessoas.add(pessoa);
        resp.sendRedirect("");
    
    }
}
