package com.example.springbootWithAws.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SocialUser, Long> {
    Optional<SocialUser> findByEmail(String email);
}
