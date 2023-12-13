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

import com.example.RentalCars.persistance.entities.Contrat;
import com.example.RentalCars.service.impliments.ContratService;
import com.example.RentalCars.service.impliments.ReservationService;

@Controller
public class ContratController {
	@Autowired
	private ContratService contratService;
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/contrat")
	public String getContrat(Model model) {
		
		List<Contrat> listContrat =contratService.getListContrat();	
		model.addAttribute("ListContrats", listContrat);
		model.addAttribute("ListReservations", reservationService.getListReservation());
		return "contrat";
	}

	@PostMapping("/contrat/addInfo")
	public String addInfo(Contrat contrat) {
		
		contratService.saveContrat(contrat);		
		return "redirect:/contrat";
	
	}
	
	@RequestMapping("contrat/findById")
	@ResponseBody
	public Optional<Contrat> findById(int id) {
	  return contratService.findById(id);	
	}
	
	@GetMapping("/contrat/update/{id}")
	public String findById(@PathVariable("id") Integer id,Model model) {
		
		Optional<Contrat> c = contratService.findById(id);
		Contrat cl=c.get();
		model.addAttribute("Contrat", cl);													
		return "ContratUpdate";

	}
	
	@GetMapping("/contrat/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		contratService.deleteContrat(id);		
		return "redirect:/contrat";
	
	}
	@GetMapping("/quantityCT")
	public int getQuantityOfContrat() {
		// TODO Auto-generated method stub
		return  contratService.getQuantityOfContrat();
	}
	
	
	

}
