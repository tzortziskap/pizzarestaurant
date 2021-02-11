/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import peoplecert.entity.Pizza;

/**
 *
 * @author tzortziskapellas
 */
@Repository
public class PizzaRepo extends HibernateUtil<Pizza> implements CrudInt<Pizza>{

    @Override
    public Pizza save(Pizza pizza) {
        return super.save(pizza);
 
    }

    @Override
    public Pizza find(int id) {
        return super.find(Pizza.class, id);

    }

    @Override
    public List<Pizza> findall() {
        return super.findAll("Pizza.findAll");
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Pizza.class, id);
    }
    
    
    
}
