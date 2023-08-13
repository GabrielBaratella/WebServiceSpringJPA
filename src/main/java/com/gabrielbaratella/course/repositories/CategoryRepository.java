package com.gabrielbaratella.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielbaratella.course.entities.Category;
import com.gabrielbaratella.course.entities.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}