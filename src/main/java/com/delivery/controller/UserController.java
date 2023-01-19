package com.delivery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
	public String joinProc(@Valid Join join, BindingResult bindingResult, Model model) {
		
		/* 회원가입 Form 에서 입력한 데이터 출력(get 이용) 
		System.out.println("Username=" + join.getUsername() + ", " + "Password=" + join.getPassword() + ", " +
	                        "Email=" + join.getEmail() + ", " + "Nickname=" + join.getNickname() + ", " +  "Phone=" + join.getPhone()); */
		
		if (bindingResult.hasErrors()) {
			System.out.println("에러 발생");
		
			List<FieldError> list = bindingResult.getFieldErrors(); // 에러정보를 확인
			Map<String, String> errorMsg = new HashMap<>();
			
			for(int i=0; i<list.size(); i++) {
				String field = list.get(i).getField();
				String message = list.get(i).getDefaultMessage();
				
				System.out.println("필드 = " + field);
				System.out.println("메세지 = " + message);
				
				errorMsg.put(field, message); // 에러난 필드와 메세지를 Map에 담음
			}
			model.addAttribute("errorMsg" , errorMsg); // model 속성에 errorMsg 변수명으로 errorMsg 값을 넣어줌
			return "user/join";
		}			
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