package com.boot.sailing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.sailing.service.MenuSvc;
import com.boot.sailing.vo.Coffee_menu;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MenuCon {
	
	// @Autowired를 통해 주입 받음
	@Autowired
	MenuSvc menuSvc;
	
	/*
	 * [SELECT] - 메뉴 전체 조회 	
	 * 해당 검색 결과만 받기 위하여 List<Coffee_menu> Vo 사용
	 */
	@GetMapping("/menu")
	public String doMenu(Model model) {

		List<Coffee_menu> list = menuSvc.doList(); // Vo 사용
		
		model.addAttribute("list", list);
		model.addAttribute("hello", "========== MenuCon VO 사용 ==========");
		
		System.out.println("@@@@@@@@@list@@@@@@@@@@" + list);
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

	/* [INSERT] - 메뉴 등록 2 - Vo 사용(ModelAttribute에 필요한 coffee, kind, price 들어감) */
	@PostMapping("/menu_ins")
	public String doInsertPost(@ModelAttribute Coffee_menu coffeeMenu)	
	{
		log.info("==========================coffeeMenu================================");
		log.info(coffeeMenu);
		int intI = menuSvc.doInsert(coffeeMenu);
		return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
	}
	
	/* [DELETE] - 메뉴 삭제 */
	@GetMapping("/menu_del")
	public String doDelete(@RequestParam("no") String strNo) {
        log.info("==========================================================");
        log.info("strNo:" + strNo);
        
		int intI = menuSvc.doDelete(strNo);

		return "redirect:/menu"; 
	}
	
	
	/* [SELECT] - 수정 클릭 시 해당 데이터 값 호출(doListOne), UPDATE를 위한 용도 */
	@GetMapping("/menu_up")
	public String doUpdate(Model model, @RequestParam("no") String strNo) {

		Map<String, Object> map = menuSvc.doListOne(strNo);
		
		model.addAttribute("map", map);

		return "/menu/menu_up"; 
	}
	
	/* [UPDATE] - 메뉴 수정 - Vo 사용 */
	@PostMapping("/menu_up")
	public String doUpdatePost(Coffee_menu coffeeMenu)	
	{
		int intI = menuSvc.doUpdate(coffeeMenu);
		return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
	}
	
	
	/*
	 * [SELECT] - 검색 기능(Search)
	 * 해당 검색 결과만 받기 위하여 List<Map<String, Object>> list 사용
	 * Model model로 menu.html에 있는 <tr th:each="prod : ${list}">을 뿌려주기 위해 list로 넘겨줌
	 */
	@PostMapping("/menu_search")
	public String doSearch(
			@RequestParam("start_date") String strStartDate, 
			@RequestParam("end_date") String strEndDate, 
			@RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee,  /* null이 올수 있는 경우에 defaultValue = "ALL"를 넣어주면 좋다. */
			@RequestParam("kind") String strKind,
			Model model)	
	{
		log.info("==========================================================");
		log.info("start_date:" + strStartDate);
		List<Coffee_menu> list = menuSvc.doSearch(strStartDate, strEndDate, strCoffee, strKind);
		model.addAttribute("list", list);
		return "/menu/menu"; 
	}
	
	
	
	/*
	 * ★★★ [문제] - for loop 안에서 사용 했기 때문에 효율적이지 못함 ★★★
	 * [UPDATE] - 다중 가격 데이터 수정
     * [INSERT] - 수정한 가격 데이터 등록
	 * menu.html 에서 <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td> 의 name값을 @RequestParam 적음
	 * menu.html 에서 <input type="hidden" name="hidden_price">의 name값을 @RequestParam 적음

	@PostMapping("/menu_updatePrice")
	public String doUpdatePrice(@RequestParam("chkCoffeeNo") List<String> chkList, @RequestParam("hidden_price") String strPrice) {
		
		if(chkList != null) {
			// for(변수 선언(type 변수명) : 배열)
			for(String strNo : chkList) {
				
				int int1 = menuSvc.doUpdatePrice(strNo, strPrice); // [UPDATE] - 다중 가격 데이터 수정
				int int2 = menuSvc.doInsertLog(strNo, strPrice); // [INSERT] - 수정한 가격 데이터 등록
			}
		}
			
		return "redirect:/menu";
	}
	*/
	
	
	/*
	 * 한번에 하나만 효율적으로 사용 
	 * [UPDATE] - 다중 가격 데이터 수정(원 쿼리 - 1번에 처리하는 것을 뜻함)
     * [INSERT] - 수정한 가격 데이터 등록(원 쿼리 - 1번에 처리하는 것을 뜻함)
	 * menu.html 에서 <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td> 의 name값을 @RequestParam 적음
	 * menu.html 에서 <input type="hidden" name="hidden_price">의 name값을 @RequestParam 적음
	 */
	@PostMapping("/menu_updatePrice")
	public String doUpdatePrice(@RequestParam("chkCoffeeNo") List<String> chkList, @RequestParam("hidden_price") String strPrice) {
		
		int int1 = menuSvc.doUpdatePriceOne(chkList, strPrice);
		int int2 = menuSvc.doInsertLogOne(chkList, strPrice);
	
		return "redirect:/menu";
	}
}