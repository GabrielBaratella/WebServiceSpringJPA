package com.gabrielbaratella.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielbaratella.course.entities.Product;
import com.gabrielbaratella.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findAll() {
		return productRepo.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = productRepo.findById(id);
		return obj.get();
	}
}
