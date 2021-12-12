package group.bestellungProject.controller;

import group.bestellungProject.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundenRepository extends JpaRepository<Kunde, Integer> {
}
