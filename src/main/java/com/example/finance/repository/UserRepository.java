package com.example.finance.repository;

import com.example.finance.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();
    private long currentId = 1;

    public User save(User user) {
        user.setId(currentId++);
        users.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public Optional<User> findByEmail(String email) {
        return users.values().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public void deleteById(Long id) {
        users.remove(id);
    }
}