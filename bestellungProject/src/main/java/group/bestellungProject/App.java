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

//@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {
       // SpringApplication.run(App.class, args);
    	System.out.println("System started");
    	KassenController kc= new KassenController();
    	Kunde testKunde = new Kunde(1, "Huyen", "a", "00");
    	
    	Pizza pizza= new Pizza(1, 5.5, "Hawai", "ananas", Size.M);
    	List<Produkt> list = new ArrayList<Produkt>();
    	list.add(pizza);
    	Bestellung bestellung = new Bestellung(1, testKunde,list, ZArt.BAR );
    	kc.getKundenController().kundeHinzufuegen(testKunde);
    	kc.getProdktController().produktErstellen(1, 5.5, "Hawai", "ananas");
    	System.out.println(kc.getVerwaltung().getProdukte().get(0).getBeschreibung());
    	System.out.println(kc.getKundenController().sucheKunde("Hu").get(0).getKundenName());
    	
        
    }
}
