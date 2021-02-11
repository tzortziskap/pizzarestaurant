/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import org.springframework.stereotype.Repository;
import peoplecert.entity.Ingredient;

/**
 *
 * @author tzortziskapellas
 */
@Repository
public class IngredientsRepo extends HibernateUtil<Ingredient> implements CrudInt<Ingredient>{

    @Override
    public Ingredient find(int id) {
        return super.find(Ingredient.class, id);
    }
    
    @Override
    public Ingredient save(Ingredient ingredients){
        return super.save(ingredients);
    }
}
