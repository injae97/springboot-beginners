package com.delivery.controller;

/* auto import : Ctrl + Shift + M */
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
 
	/*
	 * @GetMapping 으로 "/" 접근 시 home.jsp 화면 띄워줌
	 */
	@GetMapping("/")
	public String test() {
		return "home";
	}
	
	/*
	 * 다음 - 우편번호 API
	 * postcode-API.jsp 에서 ajax로 호출되어 아래 매서드 진행
	 */	
	@ResponseBody
	@PostMapping("/postcode-ajax")
	public void addressModify(String address1, String address2, HttpServletResponse response, HttpSession session)
			throws UnsupportedEncodingException {
        
		System.out.println("address1 =" + address1);  // address1 = 우편번호
		System.out.println("address2 =" + address2);  // address2 = 주소
 
		// 넘어온 우편번호와 주소를 json형태로 변환  e.g : {"address1" : "13473","address2" : "경기 성남시 분당구 경부고속도로 409"}
		String address = "{\"address1\" : \"" + address1 + "\",\"address2\" : \"" + address2 + "\"}"; 
		
		// 쿠키 생성 - 한글 데이터 저장 
		// address (JSON) 값을 cookie에 저장 후 화면단(home.jsp)에서 value="${BMaddress.address1(address2)}"에 저장 
		Cookie cookie = new Cookie("BMaddress", URLEncoder.encode(address, "UTF-8")); 		

		// 쿠키 유효시간을 일주일로 지정
		int age = 3600 * 24 * 7;
		cookie.setMaxAge(age);
		response.addCookie(cookie);
 	
		Map<String, String> HashMap = new HashMap<>();
		HashMap.put("address1", address1);
		HashMap.put("address2", address2);
		session.setMaxInactiveInterval(3600 * 3); // 세션별로 유효시간을 지정 (초 단위 - 3600 * 3 = 3시간)
		session.setAttribute("BMaddress", HashMap); // setAttribute 메소드는 이름, 값 쌍으로 세션에 정보를 저장
	}
}