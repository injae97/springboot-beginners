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
                <logger name="com.boot.sailing" level="DEBUG"/>
                <root level="INFO">
                    <appender-ref ref="console"/>
                </root>
            </configuration>
    
    c. Project and External Dependencies 
        - 프로젝트 내에 Project and External Dependencies > lombok-1.18.24jar > Run As > Java Application > Proceed > Install / Update > Finish > Restart
        * Project > Clean > Restart

## 💡 How to set utf-8 in STS?
    - Project 클릭 > Alt + Enter > Resource > Text file encoding(Other: UTF-8) > Apply and close 
    
## 💡 [SELECT] - 메뉴 전체 조회 
    * ★ DB 흐름 ★
         - Controller> Service > DAO > Mapper > DB
            - Controller(대문) > Service(Service에서 DAO 값을 가져옴) > DAO(DAO 내용이 Mybatis 통해 Mapper) 
                * Controller 대문 역할을 하려면 @Autowired로 Service 값을 가져와야 한다.

    a. html 
        a. /src/main/resources/templates/menu/menu.html
            - 커피 메뉴 클릭 시 전체 조회

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
                  <td><a th:href="@{/menu_up(no=${prod.get('no')})}">수정</a></td>
                  <td><a th:href="@{/menu_del(no=${prod.get('no')})}">삭제</a></td>
                </tr>
                        
    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            // @Autowired를 통해 주입 받음
            @Autowired
            MenuSvc menuSvc;
            
            /*
            * [SELECT] - 검색 기능(Search)
            * 해당 검색 결과만 받기 위하여 List<Map<String, Object>> list 사용
            */
            @GetMapping("/menu")
            public String doMenu(Model model) {

                // List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java에서 새로운 객체를 생성하여 doList 메소드 호출 
                List<Map<String, Object>> list = menuSvc.doList(); // MenuSvc에 @Service로 Bean을 등록한 것을 @Autowired를 통해 주입(Injection) 받아 사용

                model.addAttribute("list", list);
                model.addAttribute("hello", "========== MenuCon ==========");

                return "/menu/menu"; 
            }  
            
        * 이제 Controller > Service로 접근해야 하니 여기서는 menuSvc.doInsert()로 설정한다.
            
    c. Serivce
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            /* [SELECT] - 메뉴 전체 조회  */
            public List<Map<String, Object>> doList() {

                List<Map<String, Object>> list = menuDao.doList();
                
                log.info(list);
                return list;    
            }
            
        
        * 이제 Service > Dao로 접근해야 하니 여기서는 menuDao.doInsert()로 설정한다.
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java

            @Mapper
            public interface MenuDao {

                /* [SELECT] - 메뉴 전체 조회  */
                List<Map<String, Object>> doList();
                
            }
        
        * 이제 Dao > Mapper로 접근하면 된다
    
    e. Mapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [SELECT] - 메뉴 전체 조회 -->
            <!-- id는 Dao의 메소드 이름: doList -->
            <!-- resultType는 Dao의 type: map -->
            <!-- List<Map<String, Object>> doList(); 에서 type은 map -->
            <select id="doList" resultType="map">
                SELECT no, coffee, kind, price,
                    DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                    DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                    FROM coffee_menu;
            </select>
    
## 💡 [INSERT] - 메뉴 등록 
    * ★ DB 흐름 ★
         - Controller> Service > DAO > Mapper > DB
            - Controller(대문) > Service(Service에서 DAO 값을 가져옴) > DAO(DAO 내용이 Mybatis 통해 Mapper) 
                * Controller 대문 역할을 하려면 @Autowired로 Service 값을 가져와야 한다.

    a. html 
        a. /src/main/resources/templates/menu/menu.html
            - 등록하기 버튼 클릭 시 href에 화면단 경로로 수정
                <!-- 메뉴 등록, href에 화면단 경로 지정(/templates/menu/menu_ins.html) -->
                &nbsp;&nbsp;<button style="width: 80px;height: 30px;font-weight: bold; font-size: medium"><a href="/menu_ins">등록</a></button>
            
        b. /src/main/resources/templates/menu/menu_ins.html
            - 등록하기 입력 form 
                <!-- Post 방식으로 받으며 action에 Controller Mapping 값으로 설정(/src/main/java/com/boot/sailing/controller/MenuCon.java) -->
                <!-- name들은 데이터베이스에서 지정한 컬럼 값 그대로 사용해야 함 -->
                <form name="fm_menu_ins" autocomplete="on" action="/menu_ins" method="post">
                  <fieldset>
            
                    <legend> [커피 메뉴 등록] </legend>
                    <label>메뉴명</label> <input type="text" id="coffee" name="coffee"></p>
                    <label>종 류 </label><select name="kind">
                                        <option value="커피">커피</option>
                                        <option value="논커피">논커피</option>
                                        <option value="에이드">에이드</option>
                                      </select>
                                      </p>
                    &nbsp;&nbsp;
                    <label>가 격 </label><input type="number" name="price"></p>
            
                    <input type="submit" value="메뉴 등록" style="width: 100px;height: 30px;font-weight: bold; font-size: medium">
                  </fieldset>
                </form>
        
    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            /*
             * [INSERT] - 메뉴 등록 1 
             * 화면 이동이기 때문에 @GetMapping 사용
             * localhost:8080/menu_ins로 들어오면 /menu/menu_ins.html 화면을 보여줌
             */
            @GetMapping("/menu_ins")
            public String doInsert() {
                return "/menu/menu_ins";
            }
            
            /* [INSERT] - 메뉴 등록 2 */
            @PostMapping("/menu_ins")
            public String doInsertPost(
                    @RequestParam("coffee") String strCoffee, 
                    @RequestParam("kind") String strKind, 
                    @RequestParam("price") String strPrice )    
            {
                log.info("==========================================================");
                log.info(strCoffee);
                int intI = menuSvc.doInsert(strCoffee, strKind, strPrice);
                return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
            }
            
        * 이제 Controller > Service로 접근해야 하니 여기서는 menuSvc.doInsert()로 설정한다.
            
    c. Serivce
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            /* [INSERT] - 메뉴 등록 */
            public int doInsert(String strCoffee, String strKind, String strPrice) {
                int intI = menuDao.doInsert(strCoffee, strKind, strPrice);
                return intI;
            }   
        
        * 이제 Service > Dao로 접근해야 하니 여기서는 menuDao.doInsert()로 설정한다.
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java

            @Mapper
            public interface MenuDao {

                List<Map<String, Object>> doList();
                
                /* [INSERT] - 메뉴 등록 */
                int doInsert(@Param("strCoffee") String coffee, @Param("strKind")  String kind, @Param("strPrice")  String price);
            }
        
        * 이제 Dao > Mapper로 접근하면 된다
    
    e. Mapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [INSERT] - 메뉴 등록  -->
            <!-- id는 Dao의 메소드 이름: doInsert -->
            <insert id="doInsert">
                INSERT INTO coffee_menu (coffee, kind, price)
                VALUES(#{strCoffee}, #{strKind}, CAST(#{strPrice} as INTEGER))
            </insert>
            
## 💡 [DELETE] - 메뉴 삭제
    * ★ DB 흐름 ★
         - Controller> Service > DAO > Mapper > DB
            - Controller(대문) > Service(Service에서 DAO 값을 가져옴) > DAO(DAO 내용이 Mybatis 통해 Mapper) 
                * Controller 대문 역할을 하려면 @Autowired로 Service 값을 가져와야 한다.

    a. html 
        a. /src/main/resources/templates/menu/menu.html
            - 삭제 클릭 시 href에 /menu_del?no=1 받게 설정
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
                  <td><a th:href="@{/menu_del(no=${prod.get('no')})}">삭제</a></td>
                </tr>

    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            /* [DELETE] - 메뉴 삭제 */
            @GetMapping("/menu_del")
            public String doDelete(@RequestParam("no") String strNo) {
                log.info("==========================================================");
                log.info("strNo:" + strNo);
                
                int intI = menuSvc.doDelete(strNo);

                return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
            }            
            
        * 이제 Controller > Service로 접근해야 하니 여기서는 menuSvc.doInsert()로 설정한다.
            
    c. Serivce
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            /* [DELETE] - 메뉴 삭제 */
            public int doDelete(String strNo) {
                int intI = menuDao.doDelete(strNo);
                return intI;
            }    
        
        * 이제 Service > Dao로 접근해야 하니 여기서는 menuDao.doInsert()로 설정한다.
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            @Mapper
            public interface MenuDao {

                List<Map<String, Object>> doList();
                
                /* [DELETE] - 메뉴 삭제 */
                int doDelete(String strNo);
            }
        
        * 이제 Dao > Mapper로 접근하면 된다
    
    e. Mapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [DELETE] - 메뉴 삭제  -->
            <!-- id는 Dao의 메소드 이름: doDelete -->
            <delete id="doDelete">
                DELETE FROM coffee_menu where no = CAST(#{strNo} as INTEGER)
            </delete>
            
## 💡 [SELECT] - 메뉴 수정 클릭 시 해당 데이터 값 호출(doListOne), ★ UPDATE를 위한 용도 ★
    * ★ DB 흐름 ★
         - Controller> Service > DAO > Mapper > DB
            - Controller(대문) > Service(Service에서 DAO 값을 가져옴) > DAO(DAO 내용이 Mybatis 통해 Mapper) 
                * Controller 대문 역할을 하려면 @Autowired로 Service 값을 가져와야 한다.

    a. html 
        a. /src/main/resources/templates/menu/menu.html
            - 수정 클릭 시 href에 /menu_up?no=1 받게 설정
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
                  <td><a th:href="@{/menu_up(no=${prod.get('no')})}">수정</a></td>
                  <td><a th:href="@{/menu_del(no=${prod.get('no')})}">삭제</a></td>
                </tr>

    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            /* [SELECT] - 수정 클릭 시 해당 데이터 값 호출(doListOne), UPDATE를 위한 용도 */
            @GetMapping("/menu_up")
            public String doUpdate(Model model, @RequestParam("no") String strNo) {

                Map<String, Object> map = menuSvc.doListOne(strNo);
                
                model.addAttribute("map", map);

                return "/menu/menu_up"; 
            }         
            
        * 이제 Controller > Service로 접근해야 하니 여기서는 menuSvc.doInsert()로 설정한다.
            
    c. Serivce
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            /* [SELECT] - 수정 클릭 시 해당 데이터 값 호출(doListOne), UPDATE를 위한 용도 */
            public Map<String, Object> doListOne(String strNo) {
                Map<String, Object> map = menuDao.doListOne(strNo);

                return map;
            }    
        
        * 이제 Service > Dao로 접근해야 하니 여기서는 menuDao.doInsert()로 설정한다.
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            @Mapper
            public interface MenuDao {

                /* [SELECT] - 수정 클릭 시 해당 데이터 값 호출(doListOne), UPDATE를 위한 용도 */
                Map<String, Object> doListOne(String strNo);
            }
        
        * 이제 Dao > Mapper로 접근하면 된다
    
    e. Mapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [SELECT] - 수정 클릭 시 해당 데이터 값 호출(doListOne), UPDATE를 위한 용도 -->
            <!-- resultType는 Dao의 type: map -->
            <!-- Map<String, Object> doListOne(String strNo); 에서 type은 map -->
            <select id="doListOne" resultType="map">
                SELECT no, coffee, kind, price,
                    DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                    DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                    FROM coffee_menu
                    where no = CAST(#{strNo} as INTEGER)
            </select>


## 💡 [UPDATE] - 메뉴 수정 
    * ★ DB 흐름 ★
         - Controller> Service > DAO > Mapper > DB
            - Controller(대문) > Service(Service에서 DAO 값을 가져옴) > DAO(DAO 내용이 Mybatis 통해 Mapper) 
                * Controller 대문 역할을 하려면 @Autowired로 Service 값을 가져와야 한다.

    a. html 
        a. /src/main/resources/templates/menu/menu_up.html
            - 수정 > 메뉴 수정 클릭 시 수정 되게끔 하기 위함
            
                <!-- map으로 사용했기 때문에 map.get('변수명')으로 값을 가져옴  -->
                <form name="fm_menu_ins" autocomplete="on" action="/menu_up" method="post">
                  <fieldset>
            
                    <legend> [커피 메뉴 등록] </legend>
                    <label>메뉴명</label> <input type="text" id="name" name="coffee" th:value="${map.get('coffee')}"></p>
                    <label>종 류 </label><select name="kind">
                                        <option value="커피" th:selected="${map.get('kind')} == '커피'">커피</option>
                                        <option value="논커피" th:selected="${map.get('kind')} == '논커피'">논커피</option>
                                        <option value="에이드" th:selected="${map.get('kind')} == '에이드'">에이드</option>
                                      </select>
                                      </p>
                    &nbsp;&nbsp;
                    <label>가 격 </label><input type="number" name="price" th:value="${map.get('price')}"></p>
                    <input type="hidden" name="coffee_id" th:value="${map.get('no')}">
            
                    <input type="submit" value="메뉴 수정" style="width: 100px;height: 30px;font-weight: bold; font-size: medium">
                  </fieldset>
                </form>
                
                <input type="hidden" name="no" th:value="${map.get('no')}">

    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            /* [UPDATE] - 메뉴 수정 */
            @PostMapping("/menu_up")
            public String doUpdatePost(
                    @RequestParam("no") String strNo, 
                    @RequestParam("coffee") String strCoffee, 
                    @RequestParam("kind") String strKind, 
                    @RequestParam("price") String strPrice )    
            {
                int intI = menuSvc.doUpdate(strNo, strCoffee, strKind, strPrice);
                return "redirect:/menu"; // return은 @RequestMapping이 적용되지 않는다.
            }      
            
        * 이제 Controller > Service로 접근해야 하니 여기서는 menuSvc.doInsert()로 설정한다.
            
    c. Serivce
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            /* [UPDATE] - 메뉴 수정 */
            public int doUpdate(String strNo, String strCoffee, String strKind, String strPrice) {
                int intI = menuDao.doUpdate(strNo, strCoffee, strKind, strPrice);
                return intI;
            }    
        
        * 이제 Service > Dao로 접근해야 하니 여기서는 menuDao.doInsert()로 설정한다.
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            @Mapper
            public interface MenuDao {
                
                /* [UPDATE] - 메뉴 수정 */
                int doUpdate(@Param("strNo") String no, @Param("strCoffee") String coffee, @Param("strKind") String kind, @Param("strPrice") String price);
            }
        
        * 이제 Dao > Mapper로 접근하면 된다
    
    e. Mapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [UPDATE] - 메뉴 수정  --> 
            <update id="doUpdate">
               Update coffee_menu
               Set
                   coffee = #{strCoffee},
                   kind = #{strKind},
                   price = CAST(#{strPrice} as INTEGER)
               Where no = CAST(#{strNo} as INTEGER)
           </update>
           


## 💡 [SELECT] - 메뉴 검색 후 조회(Search)
    * ★ DB 흐름 ★
         - Controller> Service > DAO > Mapper > DB
            - Controller(대문) > Service(Service에서 DAO 값을 가져옴) > DAO(DAO 내용이 Mybatis 통해 Mapper) 
                * Controller 대문 역할을 하려면 @Autowired로 Service 값을 가져와야 한다.

    a. html 
        a. /src/main/resources/templates/menu/menu.html
            - 검색 조건 입력 후 조회 버튼 클릭 시 해당 값만 나오게 하기 위함
            
                <!-- Post 방식으로 받으며 action에 Controller Mapping 값으로 설정(/src/main/java/com/boot/sailing/controller/MenuCon.java) -->
                <!-- name들은 데이터베이스에서 지정한 컬럼 값 그대로 사용해야 함 -->    
                <form name="fm_menu" autocomplete="on" action="/menu_search" method="post">
                  <fieldset>

                    <legend> [검색조건] </legend>
                    <label>등록기간</label><input type="date" id="start_date" name="start_date" min="2020-01-01" max="2023-12-31">
                    <input type="date" id="end_date" name="end_date" min="2020-01-01" max="2023-12-31">
                    &nbsp;&nbsp;
                    <label>메뉴명</label> <input type="text" id="coffee" name="coffee">
                    &nbsp;&nbsp;
                    <label>종류</label> <select id="kind" name="kind">
                    <option value="ALL">전체</option>
                    <option value="커피">커피</option>
                    <option value="논커피">논커피</option>
                    <option value="에이드">에이드</option>
                  </select>
                  </fieldset>
                </form>    
        
        b. /src/main/resources/templates/menu/menu.html
            - start_date, end_date 시간 설정을 위한 javascript 사용
            * 꼭 </form> 태그 아래에 사용해야 설정 됨
            
                <script>
                    /* 현재 시간 날짜에 적용시키기 */
                    const now = new Date();    // 현재 날짜 및 시간
                    const time7 = new Date(now.setDate(now.getDate() - 100));    // 기간 설정
                    document.getElementById("start_date").value= time7.toISOString().slice(0,10);
                    document.getElementById("end_date").value= new Date().toISOString().slice(0,10);

                    function onModify(){
                        let _price = prompt("가격을 입력하세요");

                        if(_price == undefined){
                            return;
                        } else if(_price ==""){
                            alert("가격을 입력하세요");
                            onModify();
                        } else if(_price != ""){
                            let _frm = document.formTable;
                            _frm.hidden_price.value = _price;
                            _frm.submit();
                        }
                    }
                </script>
            
        
        c. /src/main/resources/templates/menu/menu.html
            - MenuCon에서 model.addAttribute("list", list); 로 데이터를 넘겨준 값을 뿌려줌
            
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
                  <td><a th:href="@{/menu_up(no=${prod.get('no')})}">수정</a></td>
                  <td><a th:href="@{/menu_del(no=${prod.get('no')})}">삭제</a></td>
                </tr>

    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
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
                List<Map<String, Object>> list = menuSvc.doSearch(strStartDate, strEndDate, strCoffee, strKind);
                model.addAttribute("list", list);
                return "/menu/menu"; 
            }
            
        * 이제 Controller > Service로 접근해야 하니 여기서는 menuSvc.doInsert()로 설정한다.
            
    c. Serivce
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            /* [SELECT] - 검색 기능(Search) */
            public List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) {
                
                List<Map<String, Object>> list = menuDao.doSearch(strStartDate, strEndDate, strCoffee, strKind);
                return list;
            }
        
        * 이제 Service > Dao로 접근해야 하니 여기서는 menuDao.doInsert()로 설정한다.
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            @Mapper
            public interface MenuDao {
                
                /* [SELECT] - 검색 기능(Search) */
                List<Map<String, Object>> doSearch(@Param("strStartDate") String start_date, @Param("strEndDate") String end_date, @Param("strCoffee") String coffee, @Param("strKind") String kind);

            }
        
        * 이제 Dao > Mapper로 접근하면 된다
    
    e. Mapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [SELECT] - 메뉴 검색 조건에 의한 조회(Search) -->
            <!-- id는 Dao의 메소드 이름: doSearch -->
            <!-- List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) 에서 type은 map -->
            <!--  WHERE 1=1은 TRUE 값을 일단 넘겨줌(AND) -->
            <!--
            a.  <![CDATA[   ]]> : xml 파싱에 관여하지 않도록 처리(열고 닫아주면 됨)
            b.  <   : &lt;
            c.  >   : &gt;
            -->
            <select id="doSearch" resultType="map">
                SELECT NO, coffee, kind, price,
                        DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                        DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                FROM coffee_menu
                WHERE 1=1
                AND reg_day >= DATE_FORMAT(#{strStartDate},'%Y%m%d')
                AND reg_day &lt; DATE_ADD(DATE_FORMAT(#{strEndDate},'%Y%m%d'),INTERVAL +1 DAY) # +1일 한 이유는 2023-06-18 까지 나와야 하기 때문
                <!-- MenuCon.java > @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee에서 defaultValue를 null 대신 적어줌 -->
                <if test="strCoffee != 'ALL'">
                    AND coffee LIKE CONCAT(#{strCoffee}, '%')
                </if>
                <if test="strKind != 'ALL'">
                    AND kind = #{strKind}
                </if>
            </select>