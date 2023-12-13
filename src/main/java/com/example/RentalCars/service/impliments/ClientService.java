package com.example.RentalCars.service.impliments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.ClientRepository;
import com.example.RentalCars.persistance.entities.Client;
import com.example.RentalCars.service.interfaces.IClient;

@Service
public class ClientService implements IClient {
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getListClient() {
		// TODO Auto-generated method stub
		return  clientRepository.findAll();
	}
	
	public void saveClient(Client client) {
		clientRepository.save(client);
	}
	
	public Optional<Client> findById(Integer id) {
		return clientRepository.findById(id);
	}
	

	public void deleteClient(Integer id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}
	@Override
	public int getQuantityOfClient() {
		// TODO Auto-generated method stub
		return  clientRepository.getQuantityOfClient();
	}
}
