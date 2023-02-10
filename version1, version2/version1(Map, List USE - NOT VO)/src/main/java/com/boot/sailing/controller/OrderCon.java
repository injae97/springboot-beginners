package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderCon {
	
	@GetMapping("/order")
	public String doOrder() {
		return "/order/order"; 
	}
}