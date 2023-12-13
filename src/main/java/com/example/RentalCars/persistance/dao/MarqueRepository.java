package com.example.RentalCars.persistance.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.RentalCars.persistance.entities.Marque;

@Repository
public interface MarqueRepository extends JpaRepository<Marque,Integer> {
	
    @Query(value = "select * from marque where id= :id",nativeQuery = true)
    Marque getMarquetByIdMarque(@Param("id") Long id);
    @Query(value = "select count(*) from marque",nativeQuery = true)
    int getQuantityOfMarque();

}
