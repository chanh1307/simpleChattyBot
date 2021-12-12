package group.bestellungProject.controller;

import java.util.List;

import group.bestellungProject.model.Produkt;

public interface ProduktService {
	List<Produkt> getAllProdukt();
    Produkt produktHinzufuegen(Produkt p);
	Produkt produktAktualiesieren(Produkt p);
	Produkt getProduktById(int id);
	void deleteProduktById(int id);
	
	
	
}
