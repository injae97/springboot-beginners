## 💡 SpringBoot-Beginners Env
    - Framework: Spring boot
    - View: Thymeleaf
    - DBMS: MariaDB
    - Mapper: MyBatis
    - IDE: Spring Tool Suite
    
## 💡 Spring Tool Suite Download 
https://github.com/spring-projects/sts4/wiki/Previous-Versions

    - 컨트롤 + F > Spring Tools 4.13.1 > spring-tool-suite-4-4.13.1.RELEASE-e4.22.0-win32.win32.x86_64.zip
    
## 💡 OpenJDK 1.8 Download
```java
- https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396
- Java Version: 8
- OPERATING SYSTEM: Windows
- ARCHITECTURE: x86 64-bit
- JAVA PACKAGE: JDK
* 맨위에 .msi로 다운 후 실행 진행 후 > cmd > java -version
```    

## 💡 DB Download(MariaDB, Oracle)
    a. MariaDB 
        a. https://mariadb.org/download
            - OS에 맞게 설치 > MariaDB Server Version: 10.10.2 > Download
            - mariadb-10.10.2-winx64 실행 
                * DB ID, PASSWORD : root > use UTF 8 as default server's character set 체크 > Next
                * Port: Mysql(3306) 과 동일 하므로 3307로 설정 후 > install
            
        b. HeidiSQL 실행
            a. HeidiSQL 설정
                - 세션 이름: Springboot-Admin
                - 네트워크 유형: MariaDB or MySQL(TCP/IP)
                - 호스트명 / IP: 127.0.0.1
                - 사용자: root
                - 암호: root
                - 포트: 3307

            b. 데이터베이스 생성
                - Springboot-Admin에 오른쪽 마우스 > 새로 생성 > 데이터베이스 생성 
                    - 이름: boot
                    - 조합: utf8mb4_general_ci 
            
            c. 해당 데이터베이스 접근 권한 설정
                - 사용자 인증 및 권한 관리 클릭(사람 모양) 
                    - 사용자 계정 추가 > 사용자 이름, 암호: boot, 호스트에서: localhost
                    - 객체 추가: 아까 만들어 놓은 데이터베이스: boot > 접근 허용 권한 체크 > 저장 > 닫기 
                    
            d. 생성한 계정으로 데이터베이스 접속
                - 세션 이름: Springboot-boot
                - 네트워크 유형: MariaDB or MySQL(TCP/IP)
                - 호스트명 / IP: 127.0.0.1
                - 사용자: boot
                - 암호: boot
                - 포트: 3307
                * 데이터베이스: boot
    
    b. Oracle DB
        a. https://www.oracle.com/kr/database/technologies/xe-downloads.html
            - OS에 맞게 설치 > setup.exe > DB PWD Setting
            * DB ID : SYS, SYSTEM 고정
            
        b. DBeaver 설치
            - Database : xe

## 💡 How to add dependency in springboot?
    - https://start.spring.io/
        a. Project(Gradle, Maven 중 선택), Language(Java), Spring Boot Version 2.7.8 선택 
        b. 이제 여기서 dependency 할 것을 ADD DEPENDNECIES 클릭 후 입력(e.g MyBatis Framework)
            - EXPLORE > build.gradle > dependencies - implementation에 있는 implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0' 
 
## 💡 SpringBoot-Beginners Project Start !!!        
    a. 프로젝트 생성 
        - File > New > Spring Starter Project
            - Service URL: https://start.spring.io
            - Name: Sailing
            - Type: Gradle - Groovy 
            - Packaging: Jar
            - Java Version: 8
            - Language: Java
            - Group: com.boot
            - Artifact: Sailing
            - Version: 0.0.1-SNAPSHOT
            - Description: springboot-beginners
            - Package: com.boot.sailing
        
        - Dependencies
            - Spring Boot Version: 2.7.8
            - Available: Spring Web, Spring Boot DevTools, Lombok, MariaDB Driver, Thymeleaf > Finish
                  
                  
    b. application.properties 설정
        # port setting
        server.port = 8080

        # Thymeleaf
        spring.thymeleaf.prefix=classpath:/templates
        spring.thymeleaf.suffix=.html
        spring.thymeleaf.cache=false

        # devtools reload(html, jsp)
        spring.devtools.livereload.enabled=true
        spring.devtools.restart.enabled=false

        # MariaDB
        spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
        spring.datasource.url=jdbc:mariadb://localhost:3307/boot
        spring.datasource.username=boot
        spring.datasource.password=boot

        # Oracle
        #spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
        #spring.datasource.url=jdbc:oracle:thin:@localhost:1521
        #spring.datasource.username=SYSTEM
        #spring.datasource.password=PASSWORD
         
        # Mybatis
        #mybatis.mapper-locations=classpath:sqlmapper/*.xml
        #mybatis.configuration.map-underscore-to-camel-case=true
        #mybatis.type-aliases-package=com.spring.boot.dto
    
    
    c.  자바단 - 패키지 생성(Controller, Service, Vo, dao)
        - /Sailing/src/main/java/com/boot/sailing/controller        
        - /Sailing/src/main/java/com/boot/sailing/service          
        - /Sailing/src/main/java/com/boot/sailing/vo                         
        - /Sailing/src/main/java/com/boot/sailing/dao(interface)
        * 각 Html 파일마다 controller 생성(HomeCon, MemberCon, MenuCon, OrderCon - class)  


    d.  화면단 - templates 내에 패키지 생성(home, member, menu, order)
        - /src/main/resources/templates/home   
        - /src/main/resources/templates/member         
        - /src/main/resources/templates/menu                    
        - /src/main/resources/templates/order
        * 화면단 파일들은 폴더가 아닌 패키지에 넣어야함(폴더로 생성해서 넣을 시 호출 불가)  
        * 각 패키지 안에 html 생성(home.html, member.html, menu.html, order.html)
        
## 💡 How to set @Log4j2 in STS Using Gradle?
    a. dependency 추가
        - /Sailing/build.gradle
            implementation('org.slf4j:jcl-over-slf4j')
            implementation('ch.qos.logback:logback-classic')
    
    b. logback-spring.xml 생성
        - /src/main/resources/logback-spring.xml    
			<?xml version="1.0" encoding="UTF-8"?>
			<configuration>
				<appender name="console" class="ch.qos.logback.core.ConsoleAppender">
					<encoder>
						<Pattern>[%d{yyyy-MM-dd HH:mm:ss}:%-3relative] [%thread] %-5level %logger{36} - %msg%n</Pattern>
					</encoder>
				</appender>

				<!-- Logback 은 5단계의 로그 레벨을 가진다.
					심각도 수준은 off > Error > Warn > Info > Debug > Trace 이다.
				-->
				
				<!-- name은 package 이름 -->
				<logger name="com.boot.sailing" level="Info"/>
				<root level="Debug">
					<appender-ref ref="console"/>
				</root>
			</configuration>
    
    c. Project and External Dependencies 
        - 프로젝트 내에 Project and External Dependencies > lombok-1.18.24jar > Run As > Java Application > Proceed > Install / Update > Finish > Restart
        * Project > Clean > Restart

## 💡 How to set utf-8 in STS?
    - Project 클릭 > Alt + Enter > Resource > Text file encoding(Other: UTF-8) > Apply and close 
    
## 💡 화면 연결 흐름(View - html)    
    - 클라이언트(Chrome) > request > Controller(안내소) > View(.html) > response > 클라이언트(Chrome)
    
    a. Controller 설정 
        - Sailing/src/main/java/com/boot/sailing/controller/HomeCon.java
  
            @Controller
            public class HomeCon {

                // URL에서 localhost/home로 들어오면
                @GetMapping("/home")
                public String doHome() {
                    return "/home/home"; // template > home > home.html 화면을 보여줌
                }
            }
        
    b. html 설정
        - /Sailing/src/main/resources/templates/home/home.html
            - <a href="/home/home.html">Home</a> 👉 <a href="/home">Home</a> 변경
                    
## 💡 데이터 연결 흐름(Backend 👉 View(Thymeleaf)에 데이터 주기)    
    - 클라이언트(Chrome) > request > Controller(안내소) > Data, Model > View(Thymeleaf) > 
        response > 클라이언트(Chrome)

    a. MenuCon.java
        @GetMapping("/menu")
            public String doHome(Model model) {

            // Data Create - List, Map
            List<Map<String, Object>> list = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();

            map.put("no", "1");
            map.put("coffee", "아이스아메리카노");
            map.put("kind", "커피");
            map.put("price", "5,000");
            map.put("reg_day", "2020.10.29");
            map.put("mod_day", "2021.10.29");
            list.add(map);

            // Data 전송 - Model
            model.addAttribute("list", list);
            model.addAttribute("hello", "========== MenuCon ==========");

            return "/menu/menu"; 
        }    
    
    b. Thymeleaf - Menu.html
        * <html lang="ko"  xmlns:th="http://www.thymeleaf.org">
            
        a. variable import 
            - <h3>[ Coffee menu Management <span style="font-size:30px;">&#9749;</span> ] <th:block th:text="${hello}"></th:block>  </h3>

        b. for loop
            <!--MenuCon에 list에 넣은 값을 호출 -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
                <td>Chk</td>
                <td th:text="${prod.get('no')}">커피No</th>
                <td th:text="${prod.get('coffee')}">메뉴명</td>
                <td th:text="${prod.get('kind')}">종류</td>
                <td th:text="${prod.get('price')}">가격</td>
                <td th:text="${prod.get('reg_day')}">등록일</td>
                <td th:text="${prod.get('mod_day')}">수정일</td>
                <td>수정</td>
                <td>삭제</td>
            </tr>
            
## 💡 데이터 연결 흐름 - DI/Ioc(Controller > Service)    
    - 클라이언트(Chrome) > request > Controller(안내소) > Service(로그인 처리, 실제 업무처리) > Controller(안내소)
    
    a. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            @Autowired
            MenuSvc menuSvc;
            
            @GetMapping("/menu")
            public String doMenu(Model model) {

                // List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java에서 새로운 객체를 생성하여 doList 메소드 호출 
                List<Map<String, Object>> list = menuSvc.doList(); // MenuSvc에 @Service로 Bean을 등록한 것을 주입(Injection)을 통해 사용

                model.addAttribute("list", list);
                model.addAttribute("hello", "========== MenuCon ==========");

                return "/menu/menu"; 
            }  
            
    * Controller에서 만들었던 업무 로직을 Service로 뺌
    
    b. Service
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            package com.boot.sailing.service;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;

            import org.springframework.stereotype.Service;

            import lombok.extern.log4j.Log4j2;

            @Service 
            @Log4j2
            public class MenuSvc {
                
                public MenuSvc() {
                    log.info("================ MenuSvc , 생성자 ===================");
                }
                
                // Data Create - List, Map
                public List<Map<String, Object>> doList() {
                    List<Map<String, Object>> list = new ArrayList<>();
                    Map<String, Object> map = new HashMap<>();

                    map.put("no", "1");
                    map.put("coffee", "아이스아메");
                    map.put("kind", "커피");
                    map.put("price", "5,000");
                    map.put("reg_day", "2020.10.29");
                    map.put("mod_day", "2021.10.29");
                    list.add(map);

                    Map<String, Object> map2 = new HashMap<>();

                    map2.put("no", "2");
                    map2.put("coffee", "카푸치노");
                    map2.put("kind", "커피");
                    map2.put("price", "6,000");
                    map2.put("reg_day", "2020.10.29");
                    map2.put("mod_day", "2021.10.29");
                    list.add(map2);
                    
                    Map<String, Object> map3 = new HashMap<>();

                    map3.put("no", "3");
                    map3.put("coffee", "카푸치노");
                    map3.put("kind", "커피");
                    map3.put("price", "6,000");
                    map3.put("reg_day", "2020.10.29");
                    map3.put("mod_day", "2021.10.29");
                    list.add(map3);
                    
                    log.info(list);

                    return list;
                }
            }
            
                            
## 💡 데이터베이스 DB 연동(Controller > Service > Dao > DBMS(MariaDB))
    - 클라이언트(Chrome) > request > Controller(안내소) > Service(로그인 처리, 실제 업무처리) >  Dao(Data 처리) > DBMS(MyBatis - MariaDB)
    
    a. Service
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            @Autowired
            MenuDao menuDao;
            
            public List<Map<String, Object>> doList() {

                List<Map<String, Object>> list = menuDao.doList();
                
                log.info(list);
                return list;    
            }
    
    b. Dao    
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            package com.boot.sailing.dao;

            import java.util.List;
            import java.util.Map;

            import org.apache.ibatis.annotations.Mapper;

            @Mapper
            public interface MenuDao {

                List<Map<String, Object>> doList();
            }
    
    c. sqlmapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <?xml version="1.0" encoding="UTF-8" ?>
            <!DOCTYPE mapper
              PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
              "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
              
            <!-- namespace = Dao 위치 -->  
            <mapper namespace="com.boot.sailing.dao.MenuDao">

                <!-- 메뉴 조회 -->
                <!-- id는 Dao의 메소드 이름: doList -->
                <!-- resultType는 Dao의 type: map -->
                <!-- List<Map<String, Object>> doList(); 에서 type은 map -->
                <select id="doList" resultType="map">
                    SELECT no, coffee, kind, price,
                        DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                        DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                        FROM coffee_menu;
                </select>
              
            </mapper>
            
    * application.yml
        - /src/main/resources/application.yml
        
            # Configuration mybatis
            mybatis:
              mapper-locations: sqlmapper/**/*.xml
              configuration: 
                map-underscore-to-camel-case: true
                
    * build.gradle
        - implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.3.0'