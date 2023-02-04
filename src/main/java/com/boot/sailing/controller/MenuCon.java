package com.boot.sailing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.sailing.service.MenuSvc;

@Controller
public class MenuCon {
	
	// @Autowired를 통해 주입 받음
	@Autowired
	MenuSvc menuSvc;
	
	@GetMapping("/menu")
	public String doMenu(Model model) {

		// List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java에서 새로운 객체를 생성하여 doList 메소드 호출 
		List<Map<String, Object>> list = menuSvc.doList(); // MenuSvc에 @Service로 Bean을 등록한 것을 @Autowired를 통해 주입(Injection) 받아 사용

		model.addAttribute("list", list);
		model.addAttribute("hello", "========== MenuCon ==========");

		return "/menu/menu"; 
	}  
}