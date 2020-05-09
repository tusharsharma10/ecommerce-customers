package com.customer.jwt;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.customer.entities.User;
import com.customer.repository.UserRepository;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	@Autowired UserRepository userRepo;
	
  

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    
	  User u = userRepo.findByUsername(username);
	  
	  if( u == null) 
		  throw new UsernameNotFoundException("User with emailId "+username+" doesn't exists");

    return new JwtUserDetails(u.getId(), u.getUsername(), u.getPassword(), u.getRole());
  
  }

}


