package group.bestellungProject.controller;

import group.bestellungProject.model.Kunde;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	private TestService testService;

	public TestController(TestService testService){
		super();
		this.testService = testService;
	}

	@GetMapping("/kunden")
	public String listKunden(Model model) {
		model.addAttribute("kunden",testService.getAllKunde());
		return "kunden";
	}

	@GetMapping("/kunden/neu")
	public String addKunden(Model model) {
		Kunde kunde = new Kunde();
		model.addAttribute("kunde", kunde);
		return "create_kunde";
	}

	@PostMapping("/kunden")
	public String saveKunden(@ModelAttribute("kunde")Kunde kunde) {
		testService.addKunde(kunde);
		return "redirect:/kunden";
	}

	@GetMapping("kunden/edit/{id}")
	public String editKundenForm(@PathVariable int id, Model model) {
		model.addAttribute("kunde", testService.getKundeById(id));
		return "edit_kunde";
	}

	@PostMapping("kunden/{id}")
	public String updateKunden(@PathVariable int id, @ModelAttribute("kunde")Kunde kunde, Model model) {
		Kunde existKunde = testService.getKundeById(id);
		existKunde.setId(id);
		existKunde.setKundenName(kunde.getKundenName());
		existKunde.setAdresse(kunde.getAdresse());
		existKunde.setTelNr(kunde.getTelNr());
		testService.updateKunde(existKunde);
		return "redirect:/kunden";
	}

	@GetMapping("/kunden/{id}")
	public String deleteKunden(@PathVariable int id){
		testService.deleteKundeById(id);
		return "redirect:/kunden";
	}

}
