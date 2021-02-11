/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import peoplecert.entity.Ingredient;

/**
 *
 * @author tzortziskapellas
 */
@Repository
public class IngredientRepo extends HibernateUtil<Ingredient> implements CrudInt<Ingredient>{

    @Override
    public Ingredient find(int id) {
        return super.find(Ingredient.class, id);
    }
    
    @Override
    public Ingredient save(Ingredient ingredients){
        return super.save(ingredients);
    }

    @Override
    public List<Ingredient> findall() {
        return super.findAll("Ingredient.findAll");
    }

    @Override
    public boolean delete(int id) {
        return super.delete(Ingredient.class, id);
    }

}
