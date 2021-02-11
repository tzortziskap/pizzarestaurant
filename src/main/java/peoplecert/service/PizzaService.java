/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peoplecert.entity.Pizza;
import peoplecert.repository.PizzaRepo;

/**
 *
 * @author tzortziskapellas
 */
@Transactional
@Service
public class PizzaService {
    
    @Autowired
    private PizzaRepo pizzaRepo;
    

    public List<Pizza> getPizzas() {
        List<Pizza> pizzas = pizzaRepo.findall();
        return pizzas;
    }

    public void addPizza(Pizza pizza) {
        pizzaRepo.save(pizza);
    }

    public void deletePizza(int id) {
        pizzaRepo.delete(Pizza.class, id);
    }

    public Pizza getPizzaById(int id) {
        return pizzaRepo.find(id);
    }

    public Pizza updatePizza(Pizza pizza) {
        return pizzaRepo.save(pizza);
    }
}
