package group.bestellungProject.model;

import javax.persistence.*;

@Entity
@Table(name = "kunden")
public class Kunde {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="kundenName", nullable = false)
	private String kundenName;
	@Column(name="adresse")
	private String adresse;
	@Column(name="telNr")
	private String telNr;

	public Kunde(){

	}
	public Kunde(int id, String kundenName, String adresse, String telNr) {
		this.id = id;
		this.kundenName = kundenName;
		this.adresse = adresse;
		this.telNr = telNr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKundenName() {
		return kundenName;
	}

	public void setKundenName(String kundenName) {
		this.kundenName = kundenName;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelNr() {
		return telNr;
	}

	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}
}
