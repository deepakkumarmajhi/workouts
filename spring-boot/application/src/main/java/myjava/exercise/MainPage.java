package myjava.exercise;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainPage {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}