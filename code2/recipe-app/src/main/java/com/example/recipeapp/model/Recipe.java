package com.example.recipeapp.model;

import java.util.List;

public class Recipe {
    private Long id;
    private String title;
    private List<String> ingredients;
    private String instructions;
    private int cookingTime;
    private String difficultyLevel;
    private double averageRating;

    // Constructors

    public Recipe() {
    }

    public Recipe(Long id, String title, List<String> ingredients, String instructions, int cookingTime, String difficultyLevel, double averageRating) {
        this.id = id;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingTime = cookingTime;
        this.difficultyLevel = difficultyLevel;
        this.averageRating = averageRating;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Other getters and setters
    // ...
}