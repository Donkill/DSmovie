package com.devssuperior.DSmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devssuperior.DSmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}