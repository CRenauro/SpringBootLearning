package com.insurance.insurance.service;

import com.insurance.insurance.web.dto.UserRegistrationDto;
import com.insurance.insurance.model.Role;
import com.insurance.insurance.model.User;
import com.insurance.insurance.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;



    public UserServiceImpl(UserRepository userRepository) {
       super();
       this.userRepository = userRepository;
   }


    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE USER")));
        return userRepository.save(user);
    }

}
