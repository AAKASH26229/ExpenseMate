package com.expensemate.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;


import com.expensemate.entity.User;
import com.expensemate.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return org.springframework.security.core.userdetails.User
            .withUsername(user.getEmail())
            .password(user.getPassword())
            .authorities("USER") // You can customize roles later
            .build();
    }
	
//	@Override
//	public UserDetails loadUserByUsernamew(String name) throws UsernameNotFoundException {
//	    User user = userRepository.findByEmail(name)
//	            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//	    System.out.println("Loaded user password (encoded): " + user.getPassword());
//
//	    return new org.springframework.security.core.userdetails.User(
//	            user.getName(),
//	            user.getPassword(),
//	            Collections.emptyList()
//	    );
//	}

}
