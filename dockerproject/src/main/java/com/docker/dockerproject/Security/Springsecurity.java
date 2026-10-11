package com.docker.dockerproject.Security;
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
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


import com.docker.dockerproject.entity.Userinfo;
import com.docker.dockerproject.repository.Userinforepo;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Springsecurity {
	
	
//	@Bean
//	public UserDetailsService userservice()
//	{
//		UserDetails userone=org.springframework.security.core.userdetails.User.withUsername("user")
//				.password(encoder().encode("user1")).roles("USER").build();
//		UserDetails usertwo=org.springframework.security.core.userdetails.User.withUsername("admin")
//				.password(encoder().encode("pass2")).roles("ADMIN").build();
//		return new InMemoryUserDetailsManager(userone,usertwo);
//	}

	private final UserDetailsService userdaDetailsService;
	public Springsecurity(UserDetailsService user)
	{
		this.userdaDetailsService=user;
	}
	@Bean
	 public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SecurityFilterChain securityfilerchain(HttpSecurity http)
	{
		http.csrf(csrfcustomizer->csrfcustomizer.disable());
		http.authorizeHttpRequests(request->request.requestMatchers("/docker/welcome","/user-info/Data/{id}","/docker/GETData/*").permitAll()
				.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
//    @Bean
//    public UserDetailsService userDetailsService(
//            Userinforepo userrepo) {
//
//        return username -> {
//
//            Userinfo info = userrepo.findByname(username)
//                    .orElseThrow(() ->
//                            new UsernameNotFoundException(
//                                    "User not found"));
//
//            return org.springframework.security.core.userdetails.User
//                    .withUsername(info.getName())
//                    .password(encoder().encode(info.getPassword()))
//                    .roles(info.getRole())
//                    .build();
//        };
//    }
	@Bean
	public AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider(userdaDetailsService);
		
		daoAuthenticationProvider.setPasswordEncoder(encoder());
		return daoAuthenticationProvider;
		
	}

}
