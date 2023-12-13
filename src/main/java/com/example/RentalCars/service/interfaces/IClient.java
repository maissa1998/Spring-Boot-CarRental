package com.example.RentalCars.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.RentalCars.persistance.entities.Client;

public interface IClient {
	 List<Client> getListClient();
	 void saveClient(Client client);
	 Optional<Client> findById(Integer id);
	 void deleteClient(Integer id);
	 int getQuantityOfClient();

}
