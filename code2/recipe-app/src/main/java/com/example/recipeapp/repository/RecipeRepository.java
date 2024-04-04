package com.example.recipeapp.repository;

import com.example.recipeapp.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RecipeRepositoryImpl implements RecipeRepository {
    private List<Recipe> recipes = new ArrayList<>();

    @Override
    public List<Recipe> findAll() {
        return recipes;
    }

    @Override
    public Recipe findById(Long id) {
        Optional<Recipe> recipe = recipes.stream()
                .filter(r -> r.getId().equals(id)) // Use r.getId() here
                .findFirst();
        return recipe.orElse(null);
    }

    @Override
    public Recipe save(Recipe recipe) {
        recipes.add(recipe);
        return recipe;
    }

    @Override
    public void delete(Recipe recipe) {
        recipes.remove(recipe);
    }
}