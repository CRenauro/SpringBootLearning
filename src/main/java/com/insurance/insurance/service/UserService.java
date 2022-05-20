package com.insurance.insurance.service;

import com.insurance.insurance.web.dto.UserRegistrationDto;
import com.insurance.insurance.model.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
