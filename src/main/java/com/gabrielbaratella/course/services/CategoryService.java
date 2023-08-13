package com.gabrielbaratella.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielbaratella.course.entities.Category;
import com.gabrielbaratella.course.entities.User;
import com.gabrielbaratella.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository CategoryRepo;
	
	public List<Category> findAll() {
		return CategoryRepo.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = CategoryRepo.findById(id);
		return obj.get();
	}
}
