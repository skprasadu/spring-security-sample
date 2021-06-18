package com.hackerrank.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.hackerrank.springsecurity.service.UserDetailsServiceImp;

@Configuration
@EnableWebSecurity(debug=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	// TODO: please implement the code here

	/*@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET, "/course/**").permitAll()
				.antMatchers(HttpMethod.POST, "/course/**").hasRole("OFFICE_ADMIN").antMatchers("student/**")
				.hasAnyRole("OFFICE_ADMIN", "STUDENT_USER").and().httpBasic();
	}*/

}
