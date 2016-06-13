/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.Tema04;

import br.com.cwi.DAOS.CidadeDao;
import br.com.cwi.entitys.Cidade;

/**
 *
 * @author FERNANDO
 */
public class Run {

    static CidadeDao cidadeDao = new CidadeDao();
        
    public static void main(String[] args) {
        Cidade cd = new Cidade();
        cd.setId((long)1);
        cidadeDao.add(cd);
    }

    
}
