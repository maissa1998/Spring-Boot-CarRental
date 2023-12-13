package com.example.RentalCars.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.RentalCars.persistance.entities.Contrat ;

public interface IContrat {
	 List<Contrat > getListContrat ();
	 void saveContrat (Contrat  contrat );
	 Optional<Contrat > findById(Integer id);
	 void deleteContrat (Integer id);
	 int getQuantityOfContrat();
	 
}
