package group.bestellungProject.controller;

import group.bestellungProject.model.Bestellung;

public class BestellungController {

	private KassenController kassenController;
	
	public BestellungController(KassenController kassenController) {
		this.kassenController= kassenController;
	}

	public Bestellung bestellt() {
		return null;
	}

}
