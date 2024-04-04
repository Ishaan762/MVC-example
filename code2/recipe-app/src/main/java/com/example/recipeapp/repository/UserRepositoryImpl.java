package com.example.recipeapp.repository;

import com.example.recipeapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = users.stream()
                .filter(u -> u.getId().equals(id)) // Use u.getId() here
                .findFirst();
        return user.orElse(null);
    }

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}