package com.spring.main.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.spring.main.servives.CustomUserDeatailService;
import com.spring.main.util.JwtUtil;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil util;
	
	@Autowired
	private CustomUserDeatailService service;
	
	@SuppressWarnings("unused")
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String RequestTokenHeader=request.getHeader("Authorization");
		String UserName=null;
		String Jwttoken=null;
		
		if (RequestTokenHeader!=null && RequestTokenHeader.startsWith("Bearer ")) {
			Jwttoken=RequestTokenHeader.substring(7);
			
			UserName=util.extractUsername(Jwttoken);
		}
		
		if(UserName!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userDetails=service.loadUserByUsername(UserName);
			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(UserName,null,userDetails.getAuthorities());
			usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
		}
		else {
			System.out.println("Invalid token");
		}
		
		filterChain.doFilter(request, response);
		
	}

}
