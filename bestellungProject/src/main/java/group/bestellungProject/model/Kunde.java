package group.bestellungProject.model;
public class Kunde {

	private int id;

	private String kundenName;

	private String adresse;

	private int telNr;

	public Kunde(int id, String kundenName, String adresse, int telNr) {
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

	public int getTelNr() {
		return telNr;
	}

	public void setTelNr(int telNr) {
		this.telNr = telNr;
	}
}
