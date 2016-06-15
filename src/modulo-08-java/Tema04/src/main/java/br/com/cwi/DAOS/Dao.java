/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.DAOS;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author FERNANDO
 */
public class Dao<G> implements IDaoCrud<G>{

    final Class type;
    final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Crescer");
    final EntityManager em = emf.createEntityManager();
    final EntityTransaction transaction = em.getTransaction();
    
    public Dao(Class<G> type){
        this.type = type;
    }

    @Override
    public void add(G g) {
        transaction.begin();
        em.persist(g);
        transaction.commit();
    }

    @Override
    public void update(G g) {
        transaction.begin();
        em.merge(g);
        transaction.commit();
    }

    @Override
    public void delete(G g) {
        transaction.begin();
        em.remove(g);
        transaction.commit();
    }

    @Override
    public List<G> listAll() {
        String tabela = type.getSimpleName();
        Query query = em.createQuery("SELECT T FROM "+tabela+" T");
        List<G> listaCidades = query.getResultList();
        return listaCidades;
    }
    
}
