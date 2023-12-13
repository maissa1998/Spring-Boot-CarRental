package com.example.RentalCars.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.RentalCars.persistance.entities.Marque;
import com.example.RentalCars.persistance.entities.Vehicule;
import com.example.RentalCars.service.impliments.MarqueService;
import com.example.RentalCars.service.impliments.VehiculeService;

@Controller
public class MarqueController {
	
	@Autowired
	private MarqueService marqueService;
	
	
	public MarqueController(MarqueService marqueService) {
		super();
		this.marqueService = marqueService;
	}

	@GetMapping("/vehiculeMarque")
	public String getMarque(Model model) {
		
		List<Marque> listMarque =marqueService.getListMarque();	
		model.addAttribute("ListMarque", listMarque);
		
		return "vehiculeMarque";
	}
	
	@PostMapping("/vehiculeMarque/addInfo")
	public String addInfo(Marque marque) {
		
		marqueService.saveMarque(marque);		
		return "redirect:/vehiculeMarque";
	
	}
	
	@GetMapping("/vehiculeMarque/update/{id}")
	public String findById(@PathVariable("id") Integer id,Model model) {
		
		Optional<Marque> mar = marqueService.findById(id);
		Marque m=mar.get();
		model.addAttribute("marque", m);													
		return "marqueUpdate";

	}
	
	@GetMapping("/vehiculeMarque/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		marqueService.deleteMarque(id);		
		return "redirect:/vehiculeMarque";
	
	}
	
	@GetMapping("/quantityM")
    int getQuantityMarque() {
        return marqueService.getQuantityOfMarque();
    }
}
