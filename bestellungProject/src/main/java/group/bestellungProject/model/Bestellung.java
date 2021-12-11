package group.bestellungProject.model;
import java.util.List;

public class Bestellung {

	private int bestellungNr;

	private List<Produkt> produkte;

	private Kunde kunde;

	private double summe;

	private ZArt zahlungArt;

}
