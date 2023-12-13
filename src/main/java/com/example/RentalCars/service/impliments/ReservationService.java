package com.example.RentalCars.service.impliments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentalCars.persistance.dao.ReservationRepository;
import com.example.RentalCars.persistance.entities.Reservation;
import com.example.RentalCars.service.interfaces.IReservation;

@Service
public class ReservationService  implements IReservation{
	@Autowired
	private ReservationRepository reservationRepository;
	
	public List<Reservation> getListReservation() {
		// TODO Auto-generated method stub
		return  reservationRepository.findAll();
	}
	
	public void saveReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}
	
	public Optional<Reservation> findById(Integer id) {
		return reservationRepository.findById(id);
	}
	

	public void deleteReservation(Integer id) {
		// TODO Auto-generated method stub
		reservationRepository.deleteById(id);
	}
	@Override
	public int getQuantityOfReservation() {
		// TODO Auto-generated method stub
		return  reservationRepository.getQuantityOfReservation();
	}
}
