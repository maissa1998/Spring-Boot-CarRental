package com.example.RentalCars.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.RentalCars.persistance.entities.Reservation;
import com.example.RentalCars.service.impliments.ClientService;
import com.example.RentalCars.service.impliments.ReservationService;
import com.example.RentalCars.service.impliments.VehiculeService;

@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private VehiculeService vehiculeService;
	
	
	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}


	@GetMapping("/reservation")
	public String getReservation(Model model) {
		
		List<Reservation> listReservation =reservationService.getListReservation();	
		model.addAttribute("ListReservations", listReservation);
		model.addAttribute("Listclients", clientService.getListClient());													
		model.addAttribute("ListVehicules", vehiculeService.getListVehicule());	
		
		return "reservation";
	}

	@PostMapping("/reservation/addInfo")
	public String addInfo(Reservation reservation) {
		
		reservationService.saveReservation(reservation);		
		return "redirect:/reservation";
	
	}
	
	@RequestMapping("reservation/findById")
	@ResponseBody
	public Optional<Reservation> findById(int id) {
	  return reservationService.findById(id);	
	}
	
	@GetMapping("/reservation/update/{id}")
	public String findById(@PathVariable("id") Integer id,Model model) {
		
		Optional<Reservation> c = reservationService.findById(id);
		Reservation cl=c.get();
		model.addAttribute("Reservation", cl);													
		return "ReservationUpdate";

	}
	
	@GetMapping("/reservation/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		reservationService.deleteReservation(id);		
		return "redirect:/reservation";
	
	}
	@GetMapping("/quantityR")
	public int getQuantityOfReservation() {
		// TODO Auto-generated method stub
		return  reservationService.getQuantityOfReservation();
	}
	
	
}
