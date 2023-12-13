package com.example.RentalCars.persistance.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property ="id_vec")
public class Vehicule implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_vec;
	private String num_mat_vec;
	private String nom_vec;
	private Date date_achat_vec;
	private String klm_compteur_vec;
	private String couleur_vec;
	private String dispo_vec;
	private String prix_vec;
	
	@OneToMany(mappedBy="vehicule")
	private List<Reservation> reservations; 
	
	@ManyToOne
	@JoinColumn(name="id_mar", insertable=false , updatable=false)
	private Marque marque;
	
	private Integer id_mar; 
	
	public String getNom_vec() {
		return nom_vec;
	}

	public void setNom_vec(String nom_vec) {
		this.nom_vec = nom_vec;
	}

	public Integer getId_vec() {
		return id_vec;
	}

	public void setId_vec(Integer id_vec) {
		this.id_vec = id_vec;
	}

	public String getNum_mat_vec() {
		return num_mat_vec;
	}

	public void setNum_mat_vec(String num_mat_vec) {
		this.num_mat_vec = num_mat_vec;
	}

	public Date getDate_achat_vec() {
		return date_achat_vec;
	}

	public void setDate_achat_vec(Date date_achat_vec) {
		this.date_achat_vec = date_achat_vec;
	}

	public String getKlm_compteur_vec() {
		return klm_compteur_vec;
	}

	public void setKlm_compteur_vec(String klm_compteur_vec) {
		this.klm_compteur_vec = klm_compteur_vec;
	}

	public String getCouleur_vec() {
		return couleur_vec;
	}

	public void setCouleur_vec(String couleur_vec) {
		this.couleur_vec = couleur_vec;
	}

	public String getDispo_vec() {
		return dispo_vec;
	}

	public void setDispo_vec(String dispo_vec) {
		this.dispo_vec = dispo_vec;
	}

	public String getPrix_vec() {
		return prix_vec;
	}

	public void setPrix_vec(String prix_vec) {
		this.prix_vec = prix_vec;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Integer getId_mar() {
		return id_mar;
	}

	public void setId_mar(Integer id_mar) {
		this.id_mar = id_mar;
	}

	
}
