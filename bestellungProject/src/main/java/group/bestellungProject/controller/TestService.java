package group.bestellungProject.controller;

import group.bestellungProject.model.Kunde;

import java.util.List;

public interface TestService {
    List<Kunde> getAllKunde();
    Kunde addKunde(Kunde kunde);
    Kunde updateKunde(Kunde kunde);
    Kunde getKundeById(int id);
    void deleteKundeById(int id);
}
