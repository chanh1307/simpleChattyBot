package group.bestellungProject.controller;

import group.bestellungProject.model.Kunde;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
}
