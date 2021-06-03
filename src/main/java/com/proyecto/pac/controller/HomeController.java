package com.proyecto.pac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/home"})
	public String index() {
		return "home";
	}
	
	
	@GetMapping({"/ubicanos"})
	public String ubicanos() {
		return "ubicanos";
	}
}
