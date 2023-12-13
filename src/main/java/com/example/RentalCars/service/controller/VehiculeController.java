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

import com.example.RentalCars.persistance.entities.Marque;
import com.example.RentalCars.persistance.entities.Vehicule;
import com.example.RentalCars.service.impliments.MarqueService;
import com.example.RentalCars.service.impliments.VehiculeService;

@Controller
public class VehiculeController {
	
	@Autowired
	private VehiculeService vehiculeService;
	@Autowired
	private MarqueService marqueService;
	
	
	public VehiculeController(VehiculeService vehiculeService) {
		super();
		this.vehiculeService = vehiculeService;
		this.marqueService=marqueService;
	}


	@GetMapping("/vehicule")
	public String getVehicule(Model model) {
		
		List<Vehicule> listVehicule =vehiculeService.getListVehicule();	
		model.addAttribute("ListVehicules", listVehicule);
		List<Marque> ListMarque =marqueService.getListMarque();	
		model.addAttribute("ListMarque", ListMarque);

		return "vehicule";
	}
	
	@PostMapping("/vehicule/addInfo")
	public String addInfo(Vehicule vehicule) {
		
		vehiculeService.saveVehicule(vehicule);		
		return "redirect:/vehicule";
	
	}
	@RequestMapping("states/findById")
	@ResponseBody
	public Optional<Vehicule> findById(int id) {
	  return vehiculeService.findById(id);	
	}
	
	@GetMapping("/vehicule/update/{id}")
	public String findById(@PathVariable("id") Integer id,Model model) {
		
		Optional<Vehicule> c = vehiculeService.findById(id);
		Vehicule cl=c.get();
		model.addAttribute("vehicule", cl);
		List<Marque> ListMarque =marqueService.getListMarque();	
		model.addAttribute("ListMarque", ListMarque);		
		
		return "vehiculeUpdate";

	}
	
	@GetMapping("/vehicule/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		vehiculeService.deleteVehicule(id);		
		return "redirect:/vehicule";
	
	}
	@GetMapping("/quantityV")
	public int getQuantityOfVehicule() {
		// TODO Auto-generated method stub
		return  vehiculeService.getQuantityOfVehicule();
	}
	

	

}
