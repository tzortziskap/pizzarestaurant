package peoplecert.service;

import peoplecert.entity.Ingredient;
import peoplecert.repository.IngredientRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class IngredientService {

    @Autowired
    private IngredientRepo ingredientRepo;
    
    

    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = ingredientRepo.findall();
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientRepo.save(ingredient);
    }

    public void deleteIngredient(int id) {
        ingredientRepo.delete(Ingredient.class, id);
    }

    public Ingredient getIngredientById(int id) {
        return ingredientRepo.find(id);
    }

    public Ingredient updateIngredient(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }
}
