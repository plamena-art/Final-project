package com.plamena.app;

import java.util.List;

public class Recipe {
    int ID;
    String description;
    List<String> ingredients;
    List<String> methodSteps;
    String nutritionInfo;
    private Object String;
    private Object List;

    public Recipe(int ID, String description, List ingredients, List methodSteps, String nutritionInfo) {
        this.ID = ID;
        this.description = description;
        this.ingredients = ingredients;
        this.methodSteps = methodSteps;
        this.nutritionInfo = nutritionInfo;
    }
    public Object getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    public List<String> getMethodSteps() {
        return methodSteps;
    }
    public void setMethodSteps(List<String> methodSteps) {
        this.methodSteps = methodSteps;
    }
    public String getNutritionInfo() {
        return nutritionInfo;
    }
    public void setNutritionInfo(String nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }
}
