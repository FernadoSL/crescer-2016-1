/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.DAOS;

import br.com.cwi.entitys.Material;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 *
 * @author FERNANDO
 */
public class MaterialDao implements DaoCrud{

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Crescer");
    private final EntityManager em = emf.createEntityManager(); 
    private final EntityTransaction transaction = em.getTransaction();
    
    private Material verificaInstancia(Object o){
        Material material = null;
        if(o instanceof Material){
            material = (Material)o;
        }
        return material;
    }
    
    @Override
    public void add(Object o) {
        try{
            transaction.begin();
            em.persist(verificaInstancia(o));
            transaction.commit();
        }catch(PersistenceException e){
            e.printStackTrace();
        }
            
    }

    @Override
    public void update(Object o) {
        try{
            transaction.begin();
            em.merge(verificaInstancia(o));
            transaction.commit();
        }catch(PersistenceException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Object o) {
        try{
            transaction.begin();
            em.remove(verificaInstancia(o));
            transaction.commit();
        }catch(PersistenceException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Object> listAll() {
        Query query = em.createQuery("select m from Material where m");
        List<Object> listaMateriais = query.getResultList();
        return listaMateriais;
    }
    
}

