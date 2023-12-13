package com.example.RentalCars.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.RentalCars.persistance.entities.Client;
import com.example.RentalCars.service.impliments.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	
	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}


	@GetMapping("/client")
	public String getClient(Model model) {
		
		List<Client> listClient =clientService.getListClient();	
		model.addAttribute("Listclients", listClient);													
		return "client";
	}
	
	@PostMapping("/client/addInfo")
	public String addInfo(Client client) {
		
		clientService.saveClient(client);		
		return "redirect:/client";
	
	}
	
	@GetMapping("/client/update/{id}")
	public String findById(@PathVariable("id") Integer id,Model model) {
		
		Optional<Client> c = clientService.findById(id);
		Client cl=c.get();
		model.addAttribute("client", cl);													
		return "clientUpdate";

	}
	
	@GetMapping("/client/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		clientService.deleteClient(id);		
		return "redirect:/client";
	
	}
	@GetMapping("/quantity")
    int getQuantityClient() {
        return clientService.getQuantityOfClient();
    }

}
