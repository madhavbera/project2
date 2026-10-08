package com.dockercontainer.place.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dockercontainer.place.entity.UserDB;
import com.dockercontainer.place.repo.Myrepo;
@Service
public class Myuserdetailsservice implements UserDetailsService {
	
	@Autowired
	Myrepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserDB user=repo.findbyname(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("Not found");
		}
		return new Myusedetails(user);
	}

}
