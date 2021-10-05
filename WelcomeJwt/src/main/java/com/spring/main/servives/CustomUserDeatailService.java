package com.spring.main.servives;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDeatailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String UserName) throws UsernameNotFoundException {
		
		if (UserName.equals("Prem"))
		{
			return new User("Prem","Prem123",new ArrayList<>());
		}
		else
		{
			throw new UsernameNotFoundException("USERname not valid");
		}
	}

}
