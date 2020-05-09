package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.customer.entities.User;

@CrossOrigin("http://localhost:4200")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
  public User findByUsername(String username);

}
