package com.example.DemoRest.DemoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restapi")
public class DController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello";
	}
	
}
