package group.bestellungProject.controller;

import java.util.ArrayList;
import java.util.List;

import group.bestellungProject.model.Produkt;
import group.bestellungProject.model.Verwaltung;

public class ProduktController {

	private KassenController kassenController;
	

	public void produktErstellen(int artikelNr, double preis, String artikelName, String beschreibung) {
			if(artikelName == null ) {
				throw new NullPointerException("invalid param");
			}else {
				Produkt produkt = new Produkt(artikelNr, preis, artikelName, beschreibung);
				kassenController.getVerwaltung().getProdukte().add(produkt);
			}
	}
	public List<Produkt> sucheProdukt(String suchString){
		if(suchString == null   ) {
			throw new NullPointerException("invalid Param");
		}else {
			List<Produkt> suchErgebnis = new ArrayList<Produkt>();
			Verwaltung verwaltung = kassenController.getVerwaltung(); 
			for(Produkt produkt : verwaltung.getProdukte()){
				if(produkt.getArtikelName().contains(suchString)||(Integer.toString(produkt.getArtikelNr())).contains(suchString)||produkt.getBeschreibung().contains(suchString)) {
					suchErgebnis.add(produkt);
				}
			}
			return suchErgebnis;
		}
		
	}


	public ProduktController(KassenController kassenController) {
		
		this.kassenController = kassenController;
	}
	

}
