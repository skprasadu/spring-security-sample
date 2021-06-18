package com.hackerrank.springsecurity.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private Long id;
	private String username;
	private String password;
	private String role;

	public User(Long id, String username, String password, String role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public User() {
		
	}
}
