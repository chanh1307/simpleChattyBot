package group.bestellungProject.controller;

import java.util.List;

import group.bestellungProject.model.Produkt;

public class ProduktController {

	private KassenController kassenController;
	

	public void produktErstellen() {

	}
	public List<Produkt> sucheProdukt(String suchString){
		return null;
	}


	public ProduktController(KassenController kassenController) {
		
		this.kassenController = kassenController;
	}
	

}
