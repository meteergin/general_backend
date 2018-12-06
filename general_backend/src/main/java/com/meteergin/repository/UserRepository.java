package com.meteergin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meteergin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}