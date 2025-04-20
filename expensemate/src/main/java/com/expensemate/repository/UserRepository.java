package com.expensemate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensemate.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
	Optional<User> findByname(String name);
	boolean existsByEmail(String email);

}
