package com.example.RentalCars.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RentalCars.persistance.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	User findByUsername(String username);

}
