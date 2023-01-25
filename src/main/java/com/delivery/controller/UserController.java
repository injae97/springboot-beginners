package com.delivery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.delivery.dto.Join;
import com.delivery.service.UserService;

@Controller
public class UserController {
    
	/* @GetMapping("test")일 경우 "test" 접근 시 해당 return 값의 jsp 화면 띄워줌 */
	
	/* userService를 주입 */
	@Autowired
    private UserService userService;	
	
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
			List<FieldError> list = bindingResult.getFieldErrors(); // 에러정보를 확인
			Map<String, String> errorMsg = new HashMap<>();
			
			for(int i = 0; i < list.size(); i++) {
				String field = list.get(i).getField();
				String message = list.get(i).getDefaultMessage();
				errorMsg.put(field, message); // 에러난 필드와 메세지를 Map에 담음
			}
			model.addAttribute("errorMsg" , errorMsg); // model에 errorMsg 변수명으로 errorMsg 값을 넣어줌
			return "user/join";
		}		
		userService.join(join);
		return "redirect:/login";
	}
	
	/* join.js 에 있는 ajax로 호출 */
	@ResponseBody
	@GetMapping("/overlapCheck")
	public int overlapCheck(String value, String valueType) {
		// value = 중복체크할 값(입력한 값들), valueType = username, nickname
		
		System.out.println(value);
		System.out.println(valueType);
		
		int count = userService.overlapCheck(value, valueType);
		
		System.out.println(count);
		return count;
	}
	
	/*
	 * 회원가입
	 */
	@GetMapping("/join")
	public String join() {
		return "user/join";
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