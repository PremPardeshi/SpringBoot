package com.spring.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.main.model.JwtRequest;
import com.spring.main.model.JwtResponse;
import com.spring.main.servives.CustomUserDeatailService;
import com.spring.main.util.JwtUtil;

@RestController
public class Jwtcontroller {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDeatailService customUserService;
	
	@Autowired
	private JwtUtil util;

	@RequestMapping(value="/token", method= RequestMethod.POST)
	public ResponseEntity<?> generatetoken(@RequestBody JwtRequest jwtrequest) throws Exception{
		System.out.println(jwtrequest);
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtrequest.getUsername(), jwtrequest.getPassword()));
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");
			// TODO: handle exception
		}
		
		UserDetails useDetail=customUserService.loadUserByUsername(jwtrequest.getUsername());
		
		String token=util.generateToken(useDetail);
		System.out.println(token);
		return ResponseEntity.ok(new JwtResponse(token));
		
	}
}
