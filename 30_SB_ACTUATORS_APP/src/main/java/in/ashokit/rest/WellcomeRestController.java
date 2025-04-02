package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to Jspider";
	}
}
