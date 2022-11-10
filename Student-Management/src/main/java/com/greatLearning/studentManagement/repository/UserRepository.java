package com.greatLearning.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.studentManagement.entity.User;



public interface UserRepository extends JpaRepository<User, Integer>{

	
	public User findByUsername(String username);
}
