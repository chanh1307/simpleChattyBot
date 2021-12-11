package group.bestellungProject.controller;

import group.bestellungProject.model.Kunde;
import group.bestellungProject.model.Verwaltung;

public class KundenController {

	private KassenController kassenController;

	public KundenController(KassenController kassenController) {
		this.kassenController = kassenController;
	

	public Kunde sucheKunde(String suchString) {
		Verwaltung verwaltung = kassenController.getVerwaltung();

	}

	public void kundeHinzufuegen() {

	}

}
