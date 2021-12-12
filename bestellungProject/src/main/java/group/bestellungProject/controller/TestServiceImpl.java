package group.bestellungProject.controller;
import group.bestellungProject.model.Kunde;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TestServiceImpl implements TestService{

    private KundenRepository kundenRepository;

    public TestServiceImpl(KundenRepository kundenRepository) {
        super();
        this.kundenRepository = kundenRepository;
    }

    @Override
    public List<Kunde> getAllKunde() {
        return kundenRepository.findAll();
    }

    @Override
    public Kunde addKunde(Kunde kunde) {
        return kundenRepository.save(kunde);
    }

    @Override
    public Kunde updateKunde(Kunde kunde) {
        return kundenRepository.save(kunde);
    }

    @Override
    public Kunde getKundeById(int id) {
        return kundenRepository.findById(id).get();
    }

    @Override
    public void deleteKundeById(int id) {
        kundenRepository.deleteById(id);
    }

    @Override
    public List<Kunde> searchByKeyword(String keyword) {
        List<Kunde> kunden = kundenRepository.findAll();
        List<Kunde> ergListe = new ArrayList<>();
        for (Kunde kunde : kunden) {
            if ((kunde.getAdresse().contains(keyword)) || (kunde.getKundenName().contains(keyword)) || (kunde.getTelNr().contains(keyword))){
                ergListe.add(kunde);
            }
        }
        return ergListe;
    }




}
