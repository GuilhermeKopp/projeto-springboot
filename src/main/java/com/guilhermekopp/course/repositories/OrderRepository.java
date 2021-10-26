package com.guilhermekopp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermekopp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
