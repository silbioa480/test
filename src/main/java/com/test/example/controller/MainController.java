package com.test.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping({"","/"})
	public String main() {
		return "main";
	}
	
	@GetMapping("treatment")
	public String treatment() {
		return "treatment";
	}
}
