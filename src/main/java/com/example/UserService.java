package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nikhil on 12/15/17
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserEntity createNewUser(String username, String password)
    {
        // Set Fields of entity and save
        return null;
    }
}
