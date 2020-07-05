package myjava.exercise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateLeapYear {

	@RequestMapping("/leapYear")
	public String index(@RequestParam int year) {
		return "Is leap year"+year;
	}

}