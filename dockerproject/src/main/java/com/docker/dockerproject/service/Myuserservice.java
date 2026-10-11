package com.docker.dockerproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.docker.dockerproject.UserINFO.MYuserdetails;
import com.docker.dockerproject.entity.Userinfo;
import com.docker.dockerproject.repository.Userinforepo;

@Service
public class Myuserservice implements UserDetailsService {
	@Autowired
	Userinforepo repo;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Userinfo info=repo.findByname(username);
      if(info==null)
      {
    	  throw new UsernameNotFoundException("User not found");
      }
		return new MYuserdetails(info);
	}

}
