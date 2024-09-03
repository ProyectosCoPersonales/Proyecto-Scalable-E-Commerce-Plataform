package com.shop.jordancode.Service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.shop.jordancode.Entities.User.User;
import com.shop.jordancode.Repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}