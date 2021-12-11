package group.bestellungProject.model;
public class Produkt {

	private int artikelNr;

	private double preis;

	private String artikelName;

	private String beschreibung;

	public Produkt(int artikelNr, double preis, String artikelName, String beschreibung) {
		this.artikelNr = artikelNr;
		this.preis = preis;
		this.artikelName = artikelName;
		this.beschreibung = beschreibung;
	}

	public int getArtikelNr() {
		return artikelNr;
	}

	public void setArtikelNr(int artikelNr) {
		this.artikelNr = artikelNr;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getArtikelName() {
		return artikelName;
	}

	public void setArtikelName(String artikelName) {
		this.artikelName = artikelName;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
