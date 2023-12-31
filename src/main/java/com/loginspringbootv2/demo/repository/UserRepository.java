package com.loginspringbootv2.demo.repository;

import com.loginspringbootv2.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(@Param("username") String username);
}
