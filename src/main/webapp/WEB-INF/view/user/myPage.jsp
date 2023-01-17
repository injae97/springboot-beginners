<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- link.jsp file을 현재 파일에 import  -->
<%@ include file="/WEB-INF/view/include/link.jsp" %>
<%@ include file="/WEB-INF/view/include/header.jsp" %>

<!-- css file 적용 -->
<link rel="stylesheet" href="/css/layout/nav.css">
<link rel="stylesheet" href="/css/user/myPage.css">
 
	<div class="wrap"> 
 
	    <section class="title">
	        <h1>my 배민</h1> 
	    </section>
			
	    <!-- 콘텐츠 -->
	    <main>
	    	<div class="container">
	    	
	    	    <!-- SPRING_SECURITY_CONTEXT는 스프링 시큐리티로 로그인을 하면 생성되는 세션 :  로그인 여부를 확인하기위해 사용 -->
		    	<div class="grid_box">
		    		<div class="login_box">
	    				 <c:if test="${empty SPRING_SECURITY_CONTEXT }">
	                         <a href="/login"><span>로그인을 해주세요</span></a>
	                    </c:if>
	                    
	                    
	                    <c:if test="${!empty SPRING_SECURITY_CONTEXT }">
                            <c:set var="nickname" value="${SPRING_SECURITY_CONTEXT.authentication.principal.user.nickname }" />
	                        <a href="/user/myInfo"><span class="nickname" data-nickname=${nickname } >${nickname }</span></a>
							<button type="button" class="logout">로그아웃</button>
	                    </c:if>
		    		</div>
		    		
		    		
		    		<div>
		    			<a href="/user/point" onclick="return loginCheck();">
	                       	<span class="img_box">
	                       		<img src="/img/icon11.png" alt="포인트">
	                       	</span>
	                       	<span>포인트</span>
	                  	</a>
		    		</div>
		    		
		    		
		    		<div>
		    			<a class="updating" href="/myPage/coupon" onclick="return false;">
	               		  	<span class="img_box">
	                			<img src="/img/icon22.png" alt="쿠폰함">
	               			</span>
	               			<span>쿠폰함</span>
	              		</a>
		    		</div>
		    		
		    		
		    		<div>
		    			<a class="updating" href="/myPage/gift" onclick="return false;">
	                 		<span class="img_box">
	                 			<img src="/img/icon33.png" alt="선물함">
	                 		</span>
	                        <span>선물함</span>
						</a>
		    		</div>
		    		
		    		
		    		<div>
						<a href="/likes/store">
							<span class="img_box">
								<img src="/img/icon44.png" alt="찜한가게">
							</span>
							<span>찜한가게</span>
						</a>
		    		</div>
		    		
		    		
		    		<div>
						<a href="/orderList">
							<span class="img_box">
								<img src="/img/icon55.png" alt="주문내역">
							</span>
							<span>주문내역</span>
						</a>
		    		</div>
		    		
		    		
		    		<div>
						<a href="/user/myReview" onclick="return loginCheck()" >
							<span class="img_box">
								<img src="/img/icon66.png" alt="리뷰관리">
							</span>
							<span>리뷰관리</span>
						</a>
		    		</div>
		    		
		    	</div>
	    		
	    	</div>
	    </main>
	    
    </div>
    <!-- 콘텐츠 -->
 
    <!-- 하단 메뉴 -->
	<%@ include file="/WEB-INF/view/include/nav.jsp" %>
    <!-- 하단 메뉴 -->
 
    <!-- 푸터 -->
    <%@ include file="/WEB-INF/view/include/footer.jsp" %>
    <!-- 푸터 -->
 
    <script type="text/javascript">

        $(".updating").click(function () {
            swal("업데이트 준비 중 입니다");
        })
 
        $(".logout").click(function () {
            location.href = "/logout";
        })
        
        /* 포인트나 리뷰 작성시 로그인 체크여부 */
        function loginCheck(){
        	const nickname = $(".nickname").data("nickname"); // 닉네임 값 가져옴
        	if(!nickname) {
        		swal("로그인 후 이용 가능합니다"); // swal : 알림창
	        	return false;
        	}
        	return true;
        	
        }
    </script>
</body>
</html>