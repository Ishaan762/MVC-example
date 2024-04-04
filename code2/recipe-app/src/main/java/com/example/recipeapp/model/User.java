package com.example.recipeapp.model;

import java.util.List;

public class User {
    private Long id;
    private String username;
    private List<Recipe> favoriteRecipes;
    private List<Rating> ratings;

    // Constructors

    public User() {
    }

    public User(Long id, String username, List<Recipe> favoriteRecipes, List<Rating> ratings) {
        this.id = id;
        this.username = username;
        this.favoriteRecipes = favoriteRecipes;
        this.ratings = ratings;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Recipe> getFavoriteRecipes() {
        return favoriteRecipes;
    }

    public void setFavoriteRecipes(List<Recipe> favoriteRecipes) {
        this.favoriteRecipes = favoriteRecipes;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}