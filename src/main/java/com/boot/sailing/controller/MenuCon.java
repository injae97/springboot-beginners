package com.boot.sailing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.sailing.service.MenuSvc;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
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
	
    /*
     * [INSERT] - 메뉴 등록 1 
     * 화면 이동이기 때문에 @GetMapping 사용
     * localhost:8080/menu_ins로 들어오면 /menu/menu_ins.html 화면을 보여줌
     */
	@GetMapping("/menu_ins")
	public String doInsert() {
		return "/menu/menu_ins";
	}
	
	/* [INSERT] - 메뉴 등록 2 */
	@PostMapping("/menu_ins")
	public String doInsertPost(
			@RequestParam("coffee") String strCoffee, 
			@RequestParam("kind") String strKind, 
			@RequestParam("price") String strPrice )	
	{
        log.info("==========================================================");
        log.info(strCoffee);
		int intI = menuSvc.doInsert(strCoffee, strKind, strPrice);
		return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
	}
	
	/* [DELETE] - 메뉴 삭제 */
	@GetMapping("/menu_del")
	public String doDelete(@RequestParam("no") String strNo) {
        log.info("==========================================================");
        log.info("strNo:" + strNo);
        
		int intI = menuSvc.doDelete(strNo);

		return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
	}
}