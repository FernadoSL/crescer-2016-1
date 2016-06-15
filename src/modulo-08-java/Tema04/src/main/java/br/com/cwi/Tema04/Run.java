/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.Tema04;

import br.com.cwi.DAOS.CidadeDao;
import br.com.cwi.entitys.Cidade;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author FERNANDO
 */
public class Run {

    static CidadeDao cidadeDao = new CidadeDao();
        
    public static void main(String[] args) {
        
        Cidade c1 = new Cidade((long)1, "POA", "RS");
        
        cidadeDao.add(c1);
        cidadeDao.add(new Cidade((long)2, "POA", "RS"));
        cidadeDao.add(new Cidade((long)3, "POA", "RS"));
        
        c1.setNome("SaoLeopoldo");
        
        cidadeDao.update(c1);
        
        for(Cidade c : (List<Cidade>)cidadeDao.listAll()){
            System.out.println(c.getNome());
        }
        
        //csv.exportaCSV("csv1", "Cidade");
    }

}
