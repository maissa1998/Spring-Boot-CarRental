package com.example.RentalCars.service.impliments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.ContratRepository;
import com.example.RentalCars.persistance.entities.Contrat;
import com.example.RentalCars.service.interfaces.IContrat;

@Service
public class ContratService implements IContrat {
	@Autowired
	private ContratRepository contratRepository;
	
	public List<Contrat> getListContrat() {
		// TODO Auto-generated method stub
		return  contratRepository.findAll();
	}
	
	public void saveContrat(Contrat contrat) {
		contratRepository.save(contrat);
	}
	
	public Optional<Contrat> findById(Integer id) {
		return contratRepository.findById(id);
	}
	

	public void deleteContrat(Integer id) {
		// TODO Auto-generated method stub
		contratRepository.deleteById(id);
	}
	@Override
	public int getQuantityOfContrat() {
		// TODO Auto-generated method stub
		return  contratRepository.getQuantityOfContrat();
	}

}
