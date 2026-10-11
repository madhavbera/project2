package com.docker.dockerproject.UserINFO;

import java.util.Arrays;

import java.util.Collection;
import java.util.List;

import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.docker.dockerproject.entity.Userinfo;

public  class MYuserdetails implements UserDetails {
      private String name;
      private String password;
      private List<GrantedAuthority> grantedAuthorities;
      public MYuserdetails(Userinfo user)
      {
    	  name=user.getName();
    	  password=user.getPassword();
    	  grantedAuthorities=Arrays.stream(user.getRole().split(",")).map(SimpleGrantedAuthority::new)
    			  .collect(Collectors.toList());
      }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return grantedAuthorities;
	}

	@Override
	public @Nullable String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return name;
	}

}
