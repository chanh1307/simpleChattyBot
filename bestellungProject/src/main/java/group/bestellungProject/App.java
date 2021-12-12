package group.bestellungProject;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import group.bestellungProject.controller.KassenController;
import group.bestellungProject.model.Bestellung;
import group.bestellungProject.model.Kunde;
import group.bestellungProject.model.Pizza;
import group.bestellungProject.model.Produkt;
import group.bestellungProject.model.Size;
import group.bestellungProject.model.ZArt;

@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
        System.out.println("App running!");
   	
        
    }
}
