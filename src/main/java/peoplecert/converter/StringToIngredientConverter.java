package peoplecert.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import peoplecert.entity.Ingredient;
import peoplecert.service.IngredientService;

/**
 *
 * @author user
 */
@Component
public class StringToIngredientConverter implements Converter<String, Ingredient>{

    @Autowired
    IngredientService service;
    
    @Override
    public Ingredient convert(String s) {
        int id = Integer.parseInt(s);
        Ingredient ingredient = service.getIngredientById(id);
        return ingredient;
    }
    
}
