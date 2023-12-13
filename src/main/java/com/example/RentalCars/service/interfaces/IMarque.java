package com.example.RentalCars.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.RentalCars.persistance.entities.Marque;

public interface IMarque {
	 List<Marque> getListMarque();
	 void saveMarque(Marque marque);
	 Optional<Marque> findById(Integer id);
	 void deleteMarque(Integer id);
	 int getQuantityOfMarque();
}
