package com.example.RentalCars.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.RentalCars.persistance.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    @Query(value = "select count(*) from reservation",nativeQuery = true)
    int getQuantityOfReservation();
}
