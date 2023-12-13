package com.example.RentalCars.service.impliments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.UserRepository;
import com.example.RentalCars.persistance.entities.User;
import com.example.RentalCars.service.interfaces.IUser;

import java.util.List;

@Service

public class UserService implements IUser{
	//@Autowired private BCryptPasswordEncoder encoder;

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public void delete(int id) {
		userRepository.deleteById(id);
	}

	public void save(User user) {
		userRepository.save(user);
	}


}
