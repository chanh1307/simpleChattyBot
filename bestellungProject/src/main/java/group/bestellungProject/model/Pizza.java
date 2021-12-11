package group.bestellungProject.model;
public class Pizza extends Produkt {

	private Size size;

	public Pizza(int artikelNr, double preis, String artikelName, String beschreibung, Size size) {
		super(artikelNr, preis, artikelName, beschreibung);
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

}
