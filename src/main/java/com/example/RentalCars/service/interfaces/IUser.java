package com.example.RentalCars.service.interfaces;

import java.util.List;

import com.example.RentalCars.persistance.entities.User;

public interface IUser {
	 List<User> findAll();
	 User findById(int id);
	 void delete(int id);
	 void save(User user);

}
