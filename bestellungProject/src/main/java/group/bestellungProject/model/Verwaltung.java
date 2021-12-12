package group.bestellungProject.model;

import java.util.ArrayList;
import java.util.List;


public class Verwaltung {
	private List<Bestellung> bestellungen;
	private List<Kunde> kunden;
	private List<Produkt> produkte;
	
	public Verwaltung() {
		bestellungen = new ArrayList<Bestellung>();
		kunden = new ArrayList<Kunde>();
		produkte = new ArrayList<Produkt>();
	}
	
	public void addProdukt(Produkt produkt) {
		if (produkt == null) {
		//TODO exception;
		
		}else {
			produkte.add(produkt);
		}
	}
	public void addKunde(Kunde kunde) {
		if (kunde == null) {
		//TODO exception;
		
		}else {
			kunden.add(kunde);
		}
	}
	public void addBestellung(Bestellung bestellung) {
		if (bestellung == null) {
		//TODO exception;
		
		}else {
			bestellungen.add(bestellung);
		}
	}

	public List<Bestellung> getBestellungen() {
		return bestellungen;
	}

	public void setBestellungen(List<Bestellung> bestellungen) {
		this.bestellungen = bestellungen;
	}

	public List<Kunde> getKunden() {
		return kunden;
	}

	public void setKunden(List<Kunde> kunden) {
		this.kunden = kunden;
	}

	public List<Produkt> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<Produkt> produkte) {
		this.produkte = produkte;
	}
	
 
}
