package com.dockercontainer.place.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.dockercontainer.place.entity.UserDB;

public class Myusedetails implements UserDetails{
	private String name;
	private String password;
	private List<GrantedAuthority> grantedAuthorities;
	public Myusedetails(UserDB user)
	{
		name=user.getName();
		password=user.getPassword();
		grantedAuthorities=Arrays.stream(user.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		// TODO Auto-generated method stub
		return grantedAuthorities;
	}

	@Override
	public @Nullable String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
