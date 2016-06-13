/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.aula4;

import br.com.cwi.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author fernando.leandro
 */
public class AppRun {

    
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Crescer");
    static final EntityManager em = emf.createEntityManager();    
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        
        /* Insert pessoa no banco
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        */
        
        /*Delete pssoa no banco
        em.getTransaction().begin();
        em.remove(pessoa);
        em.getTransaction().commit();
        */
        
        /*
        Query query = em.createQuery("select p from pessoa where p");
        List<Pessoa> pessoas = query.getResultList();
        */
        
        em.close();
        emf.close();
    }
    
}
