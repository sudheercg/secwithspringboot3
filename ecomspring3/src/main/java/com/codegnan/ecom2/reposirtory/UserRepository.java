package com.codegnan.ecom2.reposirtory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.ecom2.entities.Role;
import com.codegnan.ecom2.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
	Optional<User> findByEmail(String email);
	
	User findByRole(Role role);


}
