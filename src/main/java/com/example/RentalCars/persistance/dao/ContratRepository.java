package com.example.RentalCars.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.RentalCars.persistance.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {
    @Query(value = "select count(*) from contrat",nativeQuery = true)
    int getQuantityOfContrat();

}
