package group.bestellungProject.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import group.bestellungProject.model.Kunde;
import group.bestellungProject.model.Produkt;
import group.bestellungProject.model.Verwaltung;


@Controller
public class ProduktController {

	private ProduktService produktService;

	public ProduktController(ProduktService produktService){
		super();
		this.produktService = produktService;
	}
	
	
	//retrieve
	@GetMapping("/produkt")
	public String listProdukt(Model model) {
		model.addAttribute("produkt",produktService.getAllProdukt());
		return "produkt";
	}
	
	
	//create
	@GetMapping("/produkt/neu")
	public String addProdukt(Model model) {
		Produkt p = new Produkt();
		model.addAttribute("produkt", p);
		return "create_produkt";
	}

	@PostMapping("/produkt")
	public String saveProdukt(@ModelAttribute("produkt")Produkt produkt) {
		produktService.produktHinzufuegen(produkt);
		return "redirect:/produkt";
	}

	//update
	@GetMapping("produkt/update/{id}")
	public String editProduktForm(@PathVariable int id, Model model) {
		model.addAttribute("produkt", produktService.getProduktById(id));
		return "edit_produkt";
	}

	@PostMapping("produkt/{id}")
	public String updateProdukt(@PathVariable int id, @ModelAttribute("produkt")Produkt produkt, Model model) {
		Produkt p = produktService.getProduktById(id);
		p.setid(id);
		p.setproduktName(produkt.getproduktName());
		p.setPreis(produkt.getPreis());
		p.setBeschreibung(produkt.getBeschreibung());
		produktService.produktAktualiesieren(p);
		return "redirect:/produkt";
	}
    
	//delete
	@GetMapping("/produkt/{id}")
	public String deleteProdukt(@PathVariable int id){
		produktService.deleteProduktById(id);
		return "redirect:/produkt";
	}


}