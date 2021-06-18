package com.hackerrank.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackerrank.springsecurity.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String user);
}
