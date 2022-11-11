package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    User create(User u);

    User getById(Long id);

    User update(User user);

    void delete(Long id);

    List<User> getAll();

    User getByEmail(String  email);

    User getByEmailAndAge(String email, int age);
}
