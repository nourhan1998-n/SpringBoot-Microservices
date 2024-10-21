package com.example.UserServiceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserServiceClient userServiceClient;

    @Autowired
    public UserService(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    public User getUser(Long id) {
        return userServiceClient.getUserById(id);
    }

    public User createUser(User user) {
        return userServiceClient.createUser(user);
    }
}

