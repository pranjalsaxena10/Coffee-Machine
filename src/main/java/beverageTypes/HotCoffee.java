package main.java.beverageTypes;

import main.java.ingredients.IngredientsTypes;

import java.util.HashMap;
import java.util.Map;

public class HotCoffee implements Beverage {

    @Override
    public String beverageType() {
        return "hot_coffee";
    }

    @Override
    public Map<String, Integer> ingredientsRequired() {
        Map<String, Integer> requiredIngredients = new HashMap<>();
        requiredIngredients.put(IngredientsTypes.hot_water.name(), 100);
        requiredIngredients.put(IngredientsTypes.hot_milk.name(), 400);
        requiredIngredients.put(IngredientsTypes.ginger_syrup.name(), 30);
        requiredIngredients.put(IngredientsTypes.sugar_syrup.name(), 50);
        requiredIngredients.put(IngredientsTypes.tea_leaves_syrup.name(), 30);

        return requiredIngredients;
    }
}
