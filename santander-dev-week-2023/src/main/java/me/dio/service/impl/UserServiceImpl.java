package me.dio.service.impl;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.userService;

@Service
public class UserServiceImpl implements userService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists.");

        }

        return userRepository.save(userToCreate);

    }

    
}
