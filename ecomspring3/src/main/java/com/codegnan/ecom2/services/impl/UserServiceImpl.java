package com.codegnan.ecom2.services.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codegnan.ecom2.reposirtory.UserRepository;
import com.codegnan.ecom2.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserDetailsService userDetailsService() {
		
		return new UserDetailsService() {
			
			public UserDetails loadUserByUsername(String username) {
				
				System.out.println(userRepository.findByEmail(username));
				return userRepository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("User not found"));
			}
		};
	}

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
