package com.example.RentalCars.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.RentalCars.persistance.entities.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Integer> {
    @Query(value = "select count(*) from vehicule",nativeQuery = true)
    int getQuantityOfVehicule();
}
