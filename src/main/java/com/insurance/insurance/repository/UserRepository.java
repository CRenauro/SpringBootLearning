package com.insurance.insurance.repository;

import com.insurance.insurance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// DB CRUD operation repo

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
