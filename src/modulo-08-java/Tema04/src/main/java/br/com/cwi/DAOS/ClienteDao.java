/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.DAOS;

import br.com.cwi.entitys.Cidade;
import br.com.cwi.entitys.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author FERNANDO
 */
public class ClienteDao implements DaoCrud{

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Crescer");
    private final EntityManager em = emf.createEntityManager(); 
    private final EntityTransaction transaction = em.getTransaction();
    
    private Cliente verificaInstancia(Object o){
        Cliente cliente = null;
        if(o instanceof Cliente){
            cliente = (Cliente)o;
        }
        return cliente;
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
        Query query = em.createQuery("select c from Cliente where c");
        List<Object> listaClientes = query.getResultList();
        return listaClientes;
    }
    
}

