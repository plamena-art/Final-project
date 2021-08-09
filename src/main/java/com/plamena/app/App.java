package com.plamena.app;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Recipe happyRecipe = getHappyRecipe();
        Mood happy = new Mood(1, "happy", happyRecipe);

        Recipe hungryRecipe = getHungryRecipe();
        Mood hungry = new Mood(2, "hungry", hungryRecipe);

        Recipe sadRecipe = getsadRecipe();
        Mood sad = new Mood(3, "sad", sadRecipe);

        Recipe sillyRecipe = getSillyRecipe();
        Mood Silly = new Mood(4,"silly", sillyRecipe);

    }

    private static Recipe getSillyRecipe() {
        List ingredients = new ArrayList();
        ingredients.add("1/3 firmly packed brown sugar");
        ingredients.add("1 large egg");
        ingredients.add("1/2 cup pure maple syrup");
        ingredients.add("2 tsp baking powder");
        ingredients.add("1/2 tsp salt");
        ingredients.add("2 cups flour");
        ingredients.add("1 cup California walnuts, toasted and chopped");
        ingredients.add("12 tbsp unsalted butter, softened");

        List methodSteps = new ArrayList();
        methodSteps.add("Preheat the oven to 350F");
        methodSteps.add("Beat the butter and brown sugar until smooth. Mix in the egg.Mix in the mample syrup and vanilla extract.Stir in the baking powder, salt, flour and walnuts.");
        methodSteps.add("Place on parchment paper lined baking sheets 1 1/2 inches apart. Bake until light golden brown, about 15 minutes.");

        Recipe sadRecipe = new Recipe(1, "Walnut Maple Cookies",
                ingredients, methodSteps, "Calories Per Serving: 390kcal");
        return sadRecipe;
    }

    private static Recipe getsadRecipe() {
        List ingredients = new ArrayList();
        ingredients.add("490g plain flour");
        ingredients.add("55g caster sugar + 215g caster sugar(extra)");
        ingredients.add("3 tsp dried yeast");
        ingredients.add("250ml milk(warmed)");
        ingredients.add("100g butter,melted");
        ingredients.add("3 egg, yolks");
        ingredients.add("2 tsp Cinnamon Ground");
        ingredients.add("pinch of salt");

        List methodSteps = new ArrayList();
        methodSteps.add("Season the surface of the salmon with salt, black pepper and cayenne pepper. Set aside.");
        methodSteps.add("Mix the honey, water, apple cider vinegar or lemon juice and a pinch of salt together. Stir to combine well.");
        methodSteps.add("Heat up an oven-safe skillet (cast-iron skillet preferred) on high heat. Add the olive oil. Pan-fry the salmon, skin side down first, for about 1 minute. Turn the salmon over and cook for 1 minute. Turn it over again so the skin side is at the bottom.");
        methodSteps.add("Add the garlic into the pan, saute until slightly browned. Add the honey mixture and lemon wedges into the skillet, reduce the sauce until it's sticky.");
        methodSteps.add("Finish it off by broiling the salmon in the oven for 1 minute or until the surface becomes slightly charred.");
        methodSteps.add("Top the salmon with parsley and serve immediately.");

        Recipe sadRecipe = new Recipe(1, "Cinnamon doughnuts",
                ingredients, methodSteps, "Calories Per Serving: 390kcal");
        return sadRecipe;
    }

    private static Recipe getHungryRecipe() {
        List ingredients = new ArrayList();
        ingredients.add("340g salmon, cut into 2-3 fillet strips");
        ingredients.add("salt and black pepper");
        ingredients.add("2 tbsp honey");
        ingredients.add("1 tbsp warm water");
        ingredients.add("3 cloves garlic,minced");
        ingredients.add("1/2 lemon,sliced into wedges");
        ingredients.add("1tbsp chopped parsley");

        List methodSteps = new ArrayList();
        methodSteps.add("Season the surface of the salmon with salt, black pepper and cayenne pepper. Set aside.");
        methodSteps.add("Mix the honey, water, apple cider vinegar or lemon juice and a pinch of salt together. Stir to combine well.");
        methodSteps.add("Heat up an oven-safe skillet (cast-iron skillet preferred) on high heat. Add the olive oil. Pan-fry the salmon, skin side down first, for about 1 minute. Turn the salmon over and cook for 1 minute. Turn it over again so the skin side is at the bottom.");
        methodSteps.add("Add the garlic into the pan, saute until slightly browned. Add the honey mixture and lemon wedges into the skillet, reduce the sauce until it's sticky.");
        methodSteps.add("Finish it off by broiling the salmon in the oven for 1 minute or until the surface becomes slightly charred.");
        methodSteps.add("Top the salmon with parsley and serve immediately.");

        Recipe hungryRecipe = new Recipe(1, "Honey Garlic Salmon",
                ingredients, methodSteps, "Calories Per Serving: 327kcal");
        //total fat: 19g", "Carbohydrates: 15g", "Protein: 26g
        return hungryRecipe;
    }

    private static Recipe getHappyRecipe() {
        List ingredients = new ArrayList();
        ingredients.add("1/4 cup almond flour");
        ingredients.add("2 tbsp cacao powder");
        ingredients.add("2 tbsp coconut extract");
        ingredients.add("1 tsp vanilla extract");
        ingredients.add("1 large egg");

        List methodSteps = new ArrayList();
        methodSteps.add("Whisk all of the ingredients together in a measuring cup.");
        methodSteps.add("Pour the batter into your mug and microwave for 1-2 minutes, or until the cake is cooked through.");
        methodSteps.add("Enjoy plain or top with coconut whipped cream, powdered sugar or berries.");

        Recipe happyRecipe = new Recipe(1, "Delicious and healthy gluten and dairy free chocolate mug cake",
                ingredients, methodSteps, "Calories Per Serving: 433.4kcal");
        //CALORIES: 433.4kcal, CARBOHYDRATES: 39g, PROTEIN: 14.1g, FAT: 24.9g
        return happyRecipe;
    }

}
