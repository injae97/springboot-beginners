package com.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
	/*
	 * @GetMapping 으로 "myPage" 접근 시 user/myPage.jsp 화면 띄워줌
	 */
	@GetMapping("/myPage")
    public String myPage() {
    	return "user/myPage";
    }
    
	@GetMapping("/login")
    public String login() {
    	return "user/login";
    }
}
