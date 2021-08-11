package com.plamena.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void getSelectedMood() {

        Mood happy = App.getSelectedMood("happy");
        assertEquals("happy", happy.getStatus());

        Mood nomood = App.getSelectedMood("moody");
        assertNull(nomood);
    }

    @Test
    public void getHappyRecipe() {

        Recipe happyRecipe = App.getHappyRecipe();
        assertEquals("Delicious and healthy gluten and dairy free chocolate mug cake", happyRecipe.getDescription());
    }



}