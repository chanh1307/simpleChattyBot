package group.bestellungProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produkte")
public class Produkt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="preis")
	private double preis;
	@Column(name="produktName", nullable = false)
	private String produktName;
	@Column(name="beschreibung")
	private String beschreibung;
	public Produkt() {
		
	}
	public Produkt(int id,double preis, String produktName, String beschreibung) {
		this.id = id;
		this.preis = preis;
		this.produktName = produktName;
		this.beschreibung = beschreibung;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getproduktName() {
		return produktName;
	}

	public void setproduktName(String produktName) {
		this.produktName = produktName;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
