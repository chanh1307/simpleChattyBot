package group.bestellungProject.model;
import java.util.List;
import javax.persistence.*;

public class Bestellung {

	private int bestellungNr;
	
//	@OneToMany(targetEntity = Produkt.class, cascade = CascadeType.ALL) // doc them ve cascade
//	@JoinColumn(name = "liste_produkte", referencedColumnName = "bestellungNr")
	private List<Produkt> produkte;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "bestell_kunden", referencedColumnName = "bestellungNr")
	private Kunde kunde;
	
//	@Column(name = "summe")
	private double summe;
	
//	@Column(name = "zahlung_art")
	private ZArt zahlungArt;
	
	public Bestellung(int bestellungNr, Kunde kunde, List<Produkt> produkte, ZArt zahlungArt) {
		
		
	}

	

	public Bestellung(int bestellungNr, List<Produkt> produkte, Kunde kunde, double summe, ZArt zahlungArt) {
		this.bestellungNr = bestellungNr;
		this.produkte = produkte;
		this.kunde = kunde;
		this.summe = summe;
		this.zahlungArt = zahlungArt;
	}

	public Bestellung() {
	}

	public int getBestellungNr() {
		return bestellungNr;
	}

	public void setBestellungNr(int bestellungNr) {
		this.bestellungNr = bestellungNr;
	}

	public List<Produkt> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<Produkt> produkte) {
		this.produkte = produkte;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public double getSumme() {
		return summe;
	}

	public void setSumme(double summe) {
		this.summe = summe;
	}

	public ZArt getZahlungArt() {
		return zahlungArt;
	}

	public void setZahlungArt(ZArt zahlungArt) {
		this.zahlungArt = zahlungArt;
	}
}
