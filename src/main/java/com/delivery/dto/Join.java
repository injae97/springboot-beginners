package com.delivery.dto;

import lombok.ToString;

@ToString
/* join.jsp 에서 회원가입 정보 입력칸 (form 태그 input 태그의 값들) name으로 준 값들 선언 */
public class Join {
	private String username;
    private String password;
    private String email;
    private String nickname;
    private String phone;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}     
}