<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- link.jsp file을 현재 파일에 import  -->
<%@ include file="/WEB-INF/view/include/link.jsp" %>
 
<!-- css file 적용 -->
<link rel="stylesheet" href="/css/user/login.css">
<body>
	<main>
		<div class="login_box">
        	<a href="/"><img src="/img/bamin2.png" alt="이미지" class="bm_img"></a>
        	
        	    <!-- form 태그는 input 태그의 값을 서버로 name으로 준 값들 전달 -->
				<form action="/join" method="post" >
					<div class="input_aera">
		            	<input type="text" name="username" class="username" maxlength="20"  placeholder="아이디를 입력해 주세요" >
						<span class="msg_box">${errorMsg.username }</span>
	            	</div>          
		               
					<div class="input_aera">
						<input type="password" class="password1" name="password" maxlength="20"  placeholder="비밀번호를 입력해 주세요">
					</div>
	               
					<div class="input_aera">
						<input type="password" class="password2" maxlength="20"  placeholder="비밀번호를 한번더 입력해 주세요">
			            <span class="msg_box">${errorMsg.password }</span>
	               	</div>
		               
	               	<div class="input_aera">
	               		<input type="text" name="email" class="email"  placeholder="이메일을 입력해 주세요" >
		                <span class="msg_box">${errorMsg.email }</span>
               		</div>
		               
					<div class="input_aera">
						<input type="text" class="nickname" name="nickname" maxlength="20"  placeholder="사용하실 닉네임을 입력해 주세요">
	               		<span class="msg_box">${errorMsg.nickname }</span>
					</div>
		               
					<div class="input_aera">
						<input type=number name="phone" value="" class="phone" placeholder="'-' 없이 입력해 주세요" maxlength="11" >
	                    <span class="msg_box">${errorMsg.phone }</span>
	                </div>
	                
	               <input type="submit" value="회원가입" class="login_btn" >
			</form>
        </div>
 
    </main>
</body>
</html>
