package com.guilhermekopp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermekopp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
