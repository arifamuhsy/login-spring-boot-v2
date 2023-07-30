package com.loginspringbootv2.demo.service;

import com.loginspringbootv2.demo.models.User;

public interface UserService {
    User saveUser(User user);

    User getUserByUsername(String username);
}
