package group.bestellungProject.controller;

import group.bestellungProject.model.Verwaltung;

public class KassenController {

	private KundenController kundenController;

	private BestellungController bestellungController;

	private ProduktController produktController;
	
	private Verwaltung verwaltung;
	public KassenController () {
		verwaltung = new Verwaltung();
		kundenController = new KundenController(this);
		bestellungController = new BestellungController(this);
		produktController = new ProduktController(this);
		
		
		
	}
	public Verwaltung getVerwaltung() {
		return verwaltung;
	}

	public void setVerwaltung(Verwaltung verwaltung) {
		this.verwaltung = verwaltung;
	}

	public KundenController getKundenController() {
		return kundenController;
	}

	public void setKundenController(KundenController kundenController) {
		this.kundenController = kundenController;
	}

	public BestellungController getBestellungController() {
		return bestellungController;
	}

	public void setBestellungController(BestellungController bestellungController) {
		this.bestellungController = bestellungController;
	}

	public ProduktController getProdktController() {
		return produktController;
	}

	public void setProdktController(ProduktController prodktController) {
		this.produktController = prodktController;
	}
}
