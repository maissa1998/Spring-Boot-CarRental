package com.example.RentalCars.persistance.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property ="id_cont")
public class Contrat  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cont;
	
	@OneToOne 
    @JoinColumn(name="id_reserv",insertable=false , updatable=false)
    private Reservation reservation;
    private Integer id_reserv;
	public Integer getId_cont() {
		return id_cont;
	}
	public void setId_cont(Integer id_cont) {
		this.id_cont = id_cont;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Integer getId_reserv() {
		return id_reserv;
	}
	public void setId_reserv(Integer id_reserv) {
		this.id_reserv = id_reserv;
	}
    
	
    
}
