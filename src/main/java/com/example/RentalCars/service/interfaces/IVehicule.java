package com.example.RentalCars.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.RentalCars.persistance.entities.Vehicule;

public interface IVehicule {
	 List<Vehicule> getListVehicule();
	 void saveVehicule(Vehicule vehicule);
	 Optional<Vehicule> findById(Integer id);
	 void deleteVehicule(Integer id);
	 int getQuantityOfVehicule();
}
