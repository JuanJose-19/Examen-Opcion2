package com.ufps.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

	@GetMapping({"/","/login",""})
	public String index() {
		
		return "login";
	}
}
