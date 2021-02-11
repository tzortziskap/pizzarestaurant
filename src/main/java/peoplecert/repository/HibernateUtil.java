/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tzortziskapellas
 */
public class HibernateUtil<E> {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    protected Session getSession() {
        session = sessionFactory.getCurrentSession();//One for each connection to DB
        return session;
    }
    
    //Methods for CRUD operations
    protected List<E> findAll(String query){
        getSession();
        Query myQuery = session.createNamedQuery(query);
        List<E> list = myQuery.getResultList();
        return list;
    }
    
    public E save(E entity){
        session = getSession();
        session.saveOrUpdate(entity);
        return entity;
    }
    
    protected E find(Class<E> type, int id){
        session = getSession();
        E e = session.find(type, id);
        return e;
    }
    
    public boolean delete(Class<E> type, int id){
        session = getSession();
        E e = session.find(type, id);
          session.remove(e);
        return true;
    } 
}

