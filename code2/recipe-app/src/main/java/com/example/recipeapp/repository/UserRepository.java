
package com.example.recipeapp.repository;
import com.example.recipeapp.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void delete(User user);
}