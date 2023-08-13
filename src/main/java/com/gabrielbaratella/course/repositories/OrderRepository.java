package com.gabrielbaratella.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielbaratella.course.entities.Order;
import com.gabrielbaratella.course.entities.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
