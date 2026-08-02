package com.sanjay_dynasty.springboot_enterprise_api_design.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjay_dynasty.springboot_enterprise_api_design.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    // List<User> findByRole(Role role);

    // List<User> findByEnabled(boolean enabled);

}
