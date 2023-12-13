package com.example.RentalCars.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.RentalCars.persistance.entities.Reservation;

public interface IReservation {
	 List<Reservation> getListReservation();
	 void saveReservation(Reservation reservation);
	 Optional<Reservation> findById(Integer id);
	 void deleteReservation(Integer id);
	 int getQuantityOfReservation();

}
