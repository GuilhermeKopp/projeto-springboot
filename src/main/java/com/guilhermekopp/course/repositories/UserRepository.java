package com.guilhermekopp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermekopp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
