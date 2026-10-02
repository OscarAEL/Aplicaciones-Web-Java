package com.tecsup.demoSeguridad01.repository;

import com.tecsup.demoSeguridad01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}