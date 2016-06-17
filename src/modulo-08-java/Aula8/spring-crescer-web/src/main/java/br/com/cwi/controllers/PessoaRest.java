/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.controllers;

import br.com.cwi.Pessoa;
import br.com.cwi.services.PessoaService;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fernando.leandro
 */
@RestController
public class PessoaRest {
    
    @Autowired
    PessoaService pessoaService;
            
    @RequestMapping(value = "/data")
    public Date date() {
        return new Date();
    }
    
    
    @RequestMapping(value = "/pessoa.json", method = RequestMethod.POST)
    public List<Pessoa> list(@RequestBody Pessoa p) {
        p.setNascimento(new Date());
        return Stream.of(p).collect(Collectors.toList());
    }
    
    
    @RequestMapping("/pessoa")
    public List<Pessoa> list() {
        return pessoaService.list();
    }
}
