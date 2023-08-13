package com.gabrielbaratella.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielbaratella.course.entities.User;
import com.gabrielbaratella.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepo.findById(id);
		return obj.get();
	}
}