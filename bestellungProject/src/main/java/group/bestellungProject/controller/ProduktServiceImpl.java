package group.bestellungProject.controller;

import java.util.List;

import org.springframework.stereotype.Service;

import group.bestellungProject.model.Kunde;
import group.bestellungProject.model.Produkt;

@Service
public class ProduktServiceImpl implements ProduktService {
	private ProduktRepository produktRepo;
	
	public ProduktServiceImpl(ProduktRepository produktRepo) {
		super();
		this.produktRepo = produktRepo;
	}

	@Override
	public List<Produkt> getAllProdukt() {
		return produktRepo.findAll();
	}

	

	@Override
	public Produkt produktHinzufuegen(Produkt p) {
		  return produktRepo.save(p);
		
	}

	@Override
	public Produkt produktAktualiesieren(Produkt p) {
		return produktRepo.save(p);
	}

	@Override
    public Produkt getProduktById(int id) {
        return produktRepo.findById(id).get();
    }

    @Override
    public void deleteProduktById(int id) {
        produktRepo.deleteById(id);
    }

}
