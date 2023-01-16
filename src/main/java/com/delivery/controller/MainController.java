package com.delivery.controller;

/* auto import : Ctrl + Shift + M */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
 
	@GetMapping("/")
	public String test() {
		System.out.println("test");
		return "home";
	}
}