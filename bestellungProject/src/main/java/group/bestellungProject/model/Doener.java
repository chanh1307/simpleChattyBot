package group.bestellungProject.model;
public class Doener extends Produkt {

	private Fleisch fleischSorte;


	public Doener(int id, double preis, String artikelName, String beschreibung, Fleisch fleischSorte) {
		super(id, preis, artikelName, beschreibung);
		this.fleischSorte = fleischSorte;
	}

	public Fleisch getFleischSorte() {
		return fleischSorte;
	}

	public void setFleischSorte(Fleisch fleischSorte) {
		this.fleischSorte = fleischSorte;
	}
}
