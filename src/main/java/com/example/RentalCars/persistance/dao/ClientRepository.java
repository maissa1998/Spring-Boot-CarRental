package com.example.RentalCars.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.RentalCars.persistance.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
	@Query(value = "select count(*) from client",nativeQuery = true)
    int getQuantityOfClient();
}
