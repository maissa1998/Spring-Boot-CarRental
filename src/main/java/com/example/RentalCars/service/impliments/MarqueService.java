package com.example.RentalCars.service.impliments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.MarqueRepository;
import com.example.RentalCars.persistance.entities.Marque;
import com.example.RentalCars.service.interfaces.IMarque;

@Service
public class MarqueService implements IMarque  {
	@Autowired
	private MarqueRepository marqueRepository;
	@Override
	public List<Marque> getListMarque() {
		// TODO Auto-generated method stub
		return  marqueRepository.findAll();
	}
	@Override
	public void saveMarque(Marque marque) {
		marqueRepository.save(marque);
	}
	@Override
	public Optional<Marque> findById(Integer id) {
		return marqueRepository.findById(id);
	}
	
	@Override
	public void deleteMarque(Integer id) {
		// TODO Auto-generated method stub
		marqueRepository.deleteById(id);
	}
	@Override
	public int getQuantityOfMarque() {
		// TODO Auto-generated method stub
		return  marqueRepository.getQuantityOfMarque();
	}
}
