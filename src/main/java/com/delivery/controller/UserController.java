package com.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.delivery.dto.Join;

@Controller
public class UserController {
    
	/* @GetMapping("test")일 경우 "test" 접근 시 해당 return 값의 jsp 화면 띄워줌 */
		
	/*
	 * 회원가입
	 */
	@GetMapping("/join")
	public String join() {
		return "user/join";
	}
	
	/*
	 * 회원가입 할 경우 데이터를 받을 코드를 작성
	 * <form> 태그의 method 타입이 post이기 때문에 컨트롤러에서도 Post로 받아야 함
	 * 파라미터 값들은 DTO에 생성
	 */
	@PostMapping("/join")
	public String joinProc(Join join) {
		System.out.println("Join:" + join);
		return "redirect:/login";
	}

	/*
	 * 로그인
	 */
	@GetMapping("/login")
    public String login() {
    	return "user/login";
    }
	
	/*
	 * 마이페이지 
	 */
	@GetMapping("/myPage")
    public String myPage() {
    	return "user/myPage";
    }
}