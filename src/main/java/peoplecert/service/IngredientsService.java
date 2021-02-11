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
import peoplecert.entity.Ingredient;
import peoplecert.repository.IngredientsRepo;

/**
 *
 * @author tzortziskapellas
 */
@Transactional
@Service
public class IngredientsService {
    
    @Autowired
    private IngredientsRepo ingr;
    
    public void addIngredients(Ingredient ingredients){
            ingr.save(ingredients);
    }
}
