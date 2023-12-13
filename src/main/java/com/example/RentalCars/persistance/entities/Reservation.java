package com.example.RentalCars.persistance.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_reserv;

	private Date date_depart_reserv;
	
	private Date date_retour_reserv;
	private Integer prix_jour_reserv;
	private Integer nbr_jour_reserv;
	
	@ManyToOne
	@JoinColumn(name="idclient", insertable=false , updatable=false)
	private Client client;
	private Integer idclient;
	
	@ManyToOne
	@JoinColumn(name="idvehicule", insertable=false , updatable=false)
	private Vehicule vehicule;
	private Integer idvehicule;
	
    @OneToOne 
    @JoinColumn(name="idcontrat",insertable=false , updatable=false)
    private Contrat contrat;
    private Integer idcontrat;
	public Integer getId_reserv() {
		return id_reserv;
	}
	public void setId_reserv(Integer id_reserv) {
		this.id_reserv = id_reserv;
	}
	public Date getDate_depart_reserv() {
		return date_depart_reserv;
	}
	public void setDate_depart_reserv(Date date_depart_reserv) {
		this.date_depart_reserv = date_depart_reserv;
	}
	public Date getDate_retour_reserv() {
		return date_retour_reserv;
	}
	public void setDate_retour_reserv(Date date_retour_reserv) {
		this.date_retour_reserv = date_retour_reserv;
	}
	public Integer getPrix_jour_reserv() {
		return prix_jour_reserv;
	}
	public void setPrix_jour_reserv(Integer prix_jour_reserv) {
		this.prix_jour_reserv = prix_jour_reserv;
	}
	public Integer getNbr_jour_reserv() {
		return nbr_jour_reserv;
	}
	public void setNbr_jour_reserv(Integer nbr_jour_reserv) {
		this.nbr_jour_reserv = nbr_jour_reserv;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Integer getIdclient() {
		return idclient;
	}
	public void setIdclient(Integer idclient) {
		this.idclient = idclient;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Integer getIdvehicule() {
		return idvehicule;
	}
	public void setIdvehicule(Integer idvehicule) {
		this.idvehicule = idvehicule;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Integer getIdcontrat() {
		return idcontrat;
	}
	public void setIdcontrat(Integer idcontrat) {
		this.idcontrat = idcontrat;
	}
    
	
}
