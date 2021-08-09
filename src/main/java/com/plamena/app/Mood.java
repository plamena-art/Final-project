package com.plamena.app;

public class Mood {
    int ID;
    String status;
    Recipe recipe;

    public Mood(int ID, String status, Recipe recipe) {
        this.ID = ID;
        this.status = status;
        this.recipe = recipe;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
