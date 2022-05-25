package com.insurance.insurance.service;

import com.insurance.insurance.web.dto.UserRegistrationDto;
import com.insurance.insurance.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
