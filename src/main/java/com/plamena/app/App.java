package com.plamena.app;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Recipe happyRecipe = getHappyRecipe();
        Mood happy = new Mood(1, "happy", happyRecipe);
    }
    private static Recipe getHappyRecipe() {
        List ingredients = new ArrayList();
        ingredients.add("1/4 cup almond flour");
        ingredients.add("2 tbsp cacao powder");
        ingredients.add("2 tbsp coconut extract");
        ingredients.add("1 tsp vanilla extract");
        ingredients.add("1 large egg");

        List methodSteps = new ArrayList();
        methodSteps.add("Whisk all of the ingredients together in a measuring cup");
        methodSteps.add("Pour the batter into your mug and microwave for 1-2 minutes, or until the cake is cooked through");
        methodSteps.add("Enjoy plain or top with coconut whipped cream, powdered sugar or berries");

        Recipe happyRecipe = new Recipe(1, "Delicious and healthy gluten and dairy free chocolate mug cake",
                ingredients, methodSteps, "calories");
        return happyRecipe;
    }

//    private static Recipes getRecipes() {
//        List ingredients = new ArrayList();
//        ingredients.add("1/4 cup almond flour");
//        ingredients.add("2 tbsp cacao powder");
//        ingredients.add("2 tbsp coconut extract");
//        ingredients.add("1 tsp vanilla extract");
//        ingredients.add("1 large egg");
//
//        List methodSteps = new ArrayList();
//        methodSteps.add("Whisk all of the ingredients together in a measuring cup");
//        methodSteps.add("Pour the batter into your mug and microwave for 1-2 minutes, or until the cake is cooked through");
//        methodSteps.add("Enjoy plain or top with coconut whipped cream, powdered sugar or berries");
//
//        Recipes happyRecipe = new Recipes(1, "Delicious and healthy gluten and dairy free chocolate mug cake",
//                ingredients, methodSteps, "calories");
//        return happyRecipe;
//    }

}
