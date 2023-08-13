package com.gabrielbaratella.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielbaratella.course.entities.Order;
import com.gabrielbaratella.course.entities.User;
import com.gabrielbaratella.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	public List<Order> findAll() {
		return orderRepo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = orderRepo.findById(id);
		return obj.get();
	}
}
