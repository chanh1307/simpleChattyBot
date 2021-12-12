package group.bestellungProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value ="/api/test")
	public String test() {
		return "Tested! API work!";
	}
}
