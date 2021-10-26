package com.guilhermekopp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermekopp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
