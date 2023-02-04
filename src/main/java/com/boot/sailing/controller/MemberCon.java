package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberCon {
    
	@GetMapping("/member")
	public String doMember() {
		return "/member/member"; 
	}
}