package group.bestellungProject.controller;

public class KassenController {

	private KundenController kundenController;

	private BestellungController bestellungController;

	private ProduktController prodktController;

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
		return prodktController;
	}

	public void setProdktController(ProduktController prodktController) {
		this.prodktController = prodktController;
	}
}
