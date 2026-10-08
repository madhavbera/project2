package com.dockercontainer.place.security;

import java.beans.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Mysecuritycofig {
	
	
	@Autowired
	UserDetailsService userDetailsService;
	
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//		UserDetails user1 =User.withUsername("Amar").password(encoder().encode("pass1")).roles("USER").build();
//		UserDetails user2 =User.withUsername("Ram").password(encoder().encode("pass2")).roles("ADMIN").build();
//
//		return new InMemoryUserDetailsManager(user1,user2);
//	}
	@Bean
	PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)
	{
		http.csrf(csrf->csrf.disable());
		http.authorizeHttpRequests(request->request.requestMatchers("/dockerpalce/hellow","/dockerpalce/createuser/{id}").permitAll().anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
	@Bean
	public AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider(userDetailsService);
		daoAuthenticationProvider.setPasswordEncoder(encoder());
		return daoAuthenticationProvider;
	}
	

}
