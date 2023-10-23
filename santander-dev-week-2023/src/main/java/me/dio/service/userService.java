package me.dio.service;

import org.springframework.stereotype.Service;

import me.dio.domain.model.User;

@Service
public interface userService {
    User findById(Long id);

    User createUser(User userToCreate);




    
    
}
