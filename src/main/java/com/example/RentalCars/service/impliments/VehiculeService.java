package com.example.RentalCars.service.impliments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.VehiculeRepository;
import com.example.RentalCars.persistance.entities.Vehicule;
import com.example.RentalCars.service.interfaces.IVehicule;

@Service
public class VehiculeService implements IVehicule {
	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	public List<Vehicule> getListVehicule() {
		// TODO Auto-generated method stub
		return  vehiculeRepository.findAll();
	}
	
	public void saveVehicule(Vehicule vehicule) {
		vehiculeRepository.save(vehicule);
	}
	
	public Optional<Vehicule> findById(Integer id) {
		return vehiculeRepository.findById(id);
	}
	

	public void deleteVehicule(Integer id) {
		// TODO Auto-generated method stub
		vehiculeRepository.deleteById(id);
	}
	@Override
	public int getQuantityOfVehicule() {
		// TODO Auto-generated method stub
		return  vehiculeRepository.getQuantityOfVehicule();
	}

}
