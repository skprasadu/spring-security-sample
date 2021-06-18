package com.hackerrank.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hackerrank.springsecurity.dto.User;
import com.hackerrank.springsecurity.repository.UserRepository;

//@Service
public class UserDetailsServiceImp implements UserDetailsService {

	/*@Autowired
	private UserRepository userRepository;*/

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*User user = userRepository.findByUsername(username);

		UserBuilder builder = null;
		if (user != null) {
			builder = org.springframework.security.core.userdetails.User.withUsername(username);
			builder.password(user.getPassword());

			String[] roles = { user.getRole() };

			builder.roles(roles);
			return builder.build();
		} else {
			throw new UsernameNotFoundException("User not found.");
		}*/
		return null;
	}
}
