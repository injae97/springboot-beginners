## 💡 Delivery (CRUD)
- Spring boot + JSP + Oracle + Spring Tool Suite (IDE)

## 💡 Spring Tool Suite Download 
https://github.com/spring-projects/sts4/wiki/Previous-Versions

    - 컨트롤 + F > Spring Tools 4.13.1 > spring-tool-suite-4-4.13.1.RELEASE-e4.22.0-win32.win32.x86_64.zip
		
## 💡 Spring Tool Suite Project Create
    - File -> New -> Spring Starter Project
	    - Service URL : https://start.spring.io
		- Name : dev-delivery 
		- Type : Maven 
		- Packaging : War
		- Java Version : 8
		- Language : Java
		- Group : com.delivery
		- Artifact : delivery
		- Version : 0.0.1-SNAPSHOT
		- Description : dev-delivery-repo
		- Package : com.delivery
		
	- Dependencies
	    - Spring Boot Version : 2.7.7
	    - Available : Spring Boot DevTools, Lombok, Spring Web > Finish
		
## 💡 HOW TO RUN PROJECT WITH SHORTCUT KEYS?		
    - Ctrl + Alt + Shift + B (start)
    - Ctrl + Alt + Shift + R (restart)
		
## 💡 HOW TO AUTO IMPORT WITH SHORTCUT KEYS?
    - Ctrl + Shift + M 
	
## 💡 Dev-Delivery Guide
    a. MainController Class Create
	    - com.delivery(package)안에 com.delivery.controller 생성
		    - com.delivery.controller에 MainController Class 생성 (MainController.java)
			
	b. How to use jsp on Spring Tool Suite ?
	    - pom.xml 
		<!-- JSP Template Engine -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
 
		<!-- JSTL -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>

	c. JSP Controller Setting
        - /com/delivery/controller/MainController.java > @Controller 붙여줘야 jsp file 불러옴
						
	d. JSP FILE CREATE 
        - /dev-delivery/src/main/webapp/WEB-INF/view/home.jsp 
		
## 💡 HOW TO SOLVE SOURCE CODE NON-RECOGNITION ON JSP FILE?
    - Help > Eclipse Marketplace > eclipse web search
	    > eclipse enterprise java and web developer tools 3.24 Download > Restart