package group.bestellungProject.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import group.bestellungProject.model.Produkt;

@Repository
public interface ProduktRepository extends JpaRepository<Produkt, Integer> {
}
