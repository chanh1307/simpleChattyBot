package group.bestellungProject.controller;

import java.util.ArrayList;
import java.util.List;

import group.bestellungProject.model.Kunde;
import group.bestellungProject.model.Verwaltung;

public class KundenController {

	private KassenController kassenController;

	public KundenController(KassenController kassenController) {
		this.kassenController = kassenController;
	}

	public List<Kunde> sucheKunde(String suchString) {
		Verwaltung verwaltung = kassenController.getVerwaltung();
		List<Kunde> kundenListe = verwaltung.getKunden();
		List<Kunde> ergListe = new ArrayList();
		for (Kunde kunde : kundenListe) {
			if (kunde.getAdresse().contains(suchString)
					|| kunde.getKundenName().contains(suchString)
					|| kunde.getTelNr().contains(suchString)) {
				ergListe.add(kunde);
			}
		}
		return ergListe;
	}

	public void kundeHinzufuegen(Kunde kunde) {
		Verwaltung verwaltung = kassenController.getVerwaltung();
		List<Kunde> kundenListe = verwaltung.getKunden();
		kundenListe.add(kunde);
	}

}
