package com.example.RentalCars.service.impliments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.UserRepository;
import com.example.RentalCars.persistance.entities.User;
import com.example.RentalCars.persistance.entities.UserPrincipal;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
	
	@Autowired 
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);

		if(user == null) {
			throw new UsernameNotFoundException("Utilisateur n'existe pas ! ");
		}
		
		return new UserPrincipal(user);
		
	}

}
