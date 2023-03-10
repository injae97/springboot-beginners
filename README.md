## ๐ก SpringBoot-Beginners Env
    - Framework: Spring boot
    - View: Thymeleaf
    - DBMS: MariaDB
    - Mapper: MyBatis
    - IDE: Spring Tool Suite
    
## ๐ก Spring Tool Suite Download 
https://github.com/spring-projects/sts4/wiki/Previous-Versions

    - ์ปจํธ๋กค + F > Spring Tools 4.13.1 > spring-tool-suite-4-4.13.1.RELEASE-e4.22.0-win32.win32.x86_64.zip
    
## ๐ก OpenJDK 1.8 Download
```java
- https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396
- Java Version: 8
- OPERATING SYSTEM: Windows
- ARCHITECTURE: x86 64-bit
- JAVA PACKAGE: JDK
* ๋งจ์์ .msi๋ก ๋ค์ด ํ ์คํ ์งํ ํ > cmd > java -version
```    

## ๐ก DB Download(MariaDB, Oracle)
    a. MariaDB 
        a. https://mariadb.org/download
            - OS์ ๋ง๊ฒ ์ค์น > MariaDB Server Version: 10.10.2 > Download
            - mariadb-10.10.2-winx64 ์คํ 
                * DB ID, PASSWORD : root > use UTF 8 as default server's character set ์ฒดํฌ > Next
                * Port: Mysql(3306) ๊ณผ ๋์ผ ํ๋ฏ๋ก 3307๋ก ์ค์  ํ > install
            
        b. HeidiSQL ์คํ
            a. HeidiSQL ์ค์ 
                - ์ธ์ ์ด๋ฆ: Springboot-Admin
                - ๋คํธ์ํฌ ์ ํ: MariaDB or MySQL(TCP/IP)
                - ํธ์คํธ๋ช / IP: 127.0.0.1
                - ์ฌ์ฉ์: root
                - ์ํธ: root
                - ํฌํธ: 3307

            b. ๋ฐ์ดํฐ๋ฒ ์ด์ค ์์ฑ
                - Springboot-Admin์ ์ค๋ฅธ์ชฝ ๋ง์ฐ์ค > ์๋ก ์์ฑ > ๋ฐ์ดํฐ๋ฒ ์ด์ค ์์ฑ 
                    - ์ด๋ฆ: boot
                    - ์กฐํฉ: utf8mb4_general_ci 
            
            c. ํด๋น ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ ๊ทผ ๊ถํ ์ค์ 
                - ์ฌ์ฉ์ ์ธ์ฆ ๋ฐ ๊ถํ ๊ด๋ฆฌ ํด๋ฆญ(์ฌ๋ ๋ชจ์) 
                    - ์ฌ์ฉ์ ๊ณ์  ์ถ๊ฐ > ์ฌ์ฉ์ ์ด๋ฆ, ์ํธ: boot, ํธ์คํธ์์: localhost
                    - ๊ฐ์ฒด ์ถ๊ฐ: ์๊น ๋ง๋ค์ด ๋์ ๋ฐ์ดํฐ๋ฒ ์ด์ค: boot > ์ ๊ทผ ํ์ฉ ๊ถํ ์ฒดํฌ > ์ ์ฅ > ๋ซ๊ธฐ 
                    
            d. ์์ฑํ ๊ณ์ ์ผ๋ก ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ ์
                - ์ธ์ ์ด๋ฆ: Springboot-boot
                - ๋คํธ์ํฌ ์ ํ: MariaDB or MySQL(TCP/IP)
                - ํธ์คํธ๋ช / IP: 127.0.0.1
                - ์ฌ์ฉ์: boot
                - ์ํธ: boot
                - ํฌํธ: 3307
                * ๋ฐ์ดํฐ๋ฒ ์ด์ค: boot
    
    b. Oracle DB
        a. https://www.oracle.com/kr/database/technologies/xe-downloads.html
            - OS์ ๋ง๊ฒ ์ค์น > setup.exe > DB PWD Setting
            * DB ID : SYS, SYSTEM ๊ณ ์ 
            
        b. DBeaver ์ค์น
            - Database : xe

## ๐ก How to add dependency in springboot?
    - https://start.spring.io/
        a. Project(Gradle, Maven ์ค ์ ํ), Language(Java), Spring Boot Version 2.7.8 ์ ํ 
        b. ์ด์  ์ฌ๊ธฐ์ dependency ํ  ๊ฒ์ ADD DEPENDNECIES ํด๋ฆญ ํ ์๋ ฅ(e.g MyBatis Framework)
            - EXPLORE > build.gradle > dependencies - implementation์ ์๋ implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0' 
 
## ๐ก SpringBoot-Beginners Project Start !!!        
    a. ํ๋ก์ ํธ ์์ฑ 
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
                  
                  
    b. application.properties ์ค์ 
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
    
    
    c.  ์๋ฐ๋จ - ํจํค์ง ์์ฑ(Controller, Service, Vo, dao)
        - /Sailing/src/main/java/com/boot/sailing/controller        
        - /Sailing/src/main/java/com/boot/sailing/service          
        - /Sailing/src/main/java/com/boot/sailing/vo                         
        - /Sailing/src/main/java/com/boot/sailing/dao(interface)
        * ๊ฐ Html ํ์ผ๋ง๋ค controller ์์ฑ(HomeCon, MemberCon, MenuCon, OrderCon - class)  


    d.  ํ๋ฉด๋จ - templates ๋ด์ ํจํค์ง ์์ฑ(home, member, menu, order)
        - /src/main/resources/templates/home   
        - /src/main/resources/templates/member         
        - /src/main/resources/templates/menu                    
        - /src/main/resources/templates/order
        * ํ๋ฉด๋จ ํ์ผ๋ค์ ํด๋๊ฐ ์๋ ํจํค์ง์ ๋ฃ์ด์ผํจ(ํด๋๋ก ์์ฑํด์ ๋ฃ์ ์ ํธ์ถ ๋ถ๊ฐ)  
        * ๊ฐ ํจํค์ง ์์ html ์์ฑ(home.html, member.html, menu.html, order.html)
        
## ๐ก How to set @Log4j2 in STS Using Gradle?
    a. dependency ์ถ๊ฐ
        - /Sailing/build.gradle
            implementation('org.slf4j:jcl-over-slf4j')
            implementation('ch.qos.logback:logback-classic')
    
    b. logback-spring.xml ์์ฑ
        - /src/main/resources/logback-spring.xml    
            <?xml version="1.0" encoding="UTF-8"?>
            <configuration>
                <appender name="console" class="ch.qos.logback.core.ConsoleAppender">
                    <encoder>
                        <Pattern>[%d{yyyy-MM-dd HH:mm:ss}:%-3relative] [%thread] %-5level %logger{36} - %msg%n</Pattern>
                    </encoder>
                </appender>

                <!-- Logback ์ 5๋จ๊ณ์ ๋ก๊ทธ ๋ ๋ฒจ์ ๊ฐ์ง๋ค.
                    ์ฌ๊ฐ๋ ์์ค์ off > Error > Warn > Info > Debug > Trace ์ด๋ค.
                -->
                
                <!-- name์ package ์ด๋ฆ -->
                <logger name="com.boot.sailing" level="DEBUG"/>
                <root level="INFO">
                    <appender-ref ref="console"/>
                </root>
            </configuration>
    
    c. Project and External Dependencies 
        - ํ๋ก์ ํธ ๋ด์ Project and External Dependencies > lombok-1.18.24jar > Run As > Java Application > Proceed > Install / Update > Finish > Restart
        * Project > Clean > Restart

## ๐ก How to set utf-8 in STS?
    - Project ํด๋ฆญ > Alt + Enter > Resource > Text file encoding(Other: UTF-8) > Apply and close 
  
## ๐ก What is the flow of DB in Spring?
    * โ DB ํ๋ฆ โ
        - Controller> Service > DAO > Mapper > DB
            - Controller(๋๋ฌธ) > Service(Service์์ DAO ๊ฐ์ ๊ฐ์ ธ์ด) > DAO(DAO ๋ด์ฉ์ด Mybatis ํตํด Mapper) 
                * Controller ๋๋ฌธ ์ญํ ์ ํ๋ ค๋ฉด @Autowired๋ก Service ๊ฐ์ ๊ฐ์ ธ์์ผ ํ๋ค.
                
                
## ๐ก Version1(Map, List) & Version2(Vo, DTO)
    a. Version1(Version1 ๋๋ ํ ๋ฆฌ์ ๋ฐฑ์)
        - Map, List ์ฌ์ฉ
    
    b. Version2(ํ์ฌ ๊นํ๋ธ Version2๋ก ์ปค๋ฐ)
        - Vo ์ฌ์ฉ                
                
                
## ๐ก [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ 
```java
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ์ปคํผ ๋ฉ๋ด ํด๋ฆญ ์ ์ ์ฒด ์กฐํ

            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
              <td>Chk</td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td><a th:href="@{/menu_up(no=${prod.get('no')})}">์์ </a></td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>
       
       
b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
    
        // @Autowired๋ฅผ ํตํด ์ฃผ์ ๋ฐ์
        @Autowired
        MenuSvc menuSvc;
        
        /*
        * [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search)
        * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Map<String, Object>> list ์ฌ์ฉ
        */
        @GetMapping("/menu")
        public String doMenu(Model model) {

            // List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java์์ ์๋ก์ด ๊ฐ์ฒด๋ฅผ ์์ฑํ์ฌ doList ๋ฉ์๋ ํธ์ถ 
            List<Map<String, Object>> list = menuSvc.doList(); // MenuSvc์ @Service๋ก Bean์ ๋ฑ๋กํ ๊ฒ์ @Autowired๋ฅผ ํตํด ์ฃผ์(Injection) ๋ฐ์ ์ฌ์ฉ

            model.addAttribute("list", list);
            model.addAttribute("hello", "========== MenuCon ==========");

            return "/menu/menu"; 
        }  
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
        
        
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ  */
        public List<Map<String, Object>> doList() {

            List<Map<String, Object>> list = menuDao.doList();
            
            log.info(list);
            return list;    
        }
        
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java

        @Mapper
        public interface MenuDao {

            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ  */
            List<Map<String, Object>> doList();
            
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ -->
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doList -->
        <!-- resultType๋ Dao์ type: map -->
        <!-- List<Map<String, Object>> doList(); ์์ type์ map -->
        <select id="doList" resultType="map">
            SELECT no, coffee, kind, price,
                DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                FROM coffee_menu;
        </select>
```
    
## ๐ก [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 
```java
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ๋ฑ๋กํ๊ธฐ ๋ฒํผ ํด๋ฆญ ์ href์ ํ๋ฉด๋จ ๊ฒฝ๋ก๋ก ์์ 
            <!-- ๋ฉ๋ด ๋ฑ๋ก, href์ ํ๋ฉด๋จ ๊ฒฝ๋ก ์ง์ (/templates/menu/menu_ins.html) -->
            &nbsp;&nbsp;<button style="width: 80px;height: 30px;font-weight: bold; font-size: medium"><a href="/menu_ins">๋ฑ๋ก</a></button>
        
    b. /src/main/resources/templates/menu/menu_ins.html
        - ๋ฑ๋กํ๊ธฐ ์๋ ฅ form 
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/MenuCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->
            <form name="fm_menu_ins" autocomplete="on" action="/menu_ins" method="post">
              <fieldset>
        
                <legend> [์ปคํผ ๋ฉ๋ด ๋ฑ๋ก] </legend>
                <label>๋ฉ๋ด๋ช</label> <input type="text" id="coffee" name="coffee"></p>
                <label>์ข ๋ฅ </label><select name="kind">
                                    <option value="์ปคํผ">์ปคํผ</option>
                                    <option value="๋ผ์ปคํผ">๋ผ์ปคํผ</option>
                                    <option value="์์ด๋">์์ด๋</option>
                                  </select>
                                  </p>
                &nbsp;&nbsp;
                <label>๊ฐ ๊ฒฉ </label><input type="number" name="price"></p>
        
                <input type="submit" value="๋ฉ๋ด ๋ฑ๋ก" style="width: 100px;height: 30px;font-weight: bold; font-size: medium">
              </fieldset>
            </form>
    
    
b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
    
        /*
         * [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 1 
         * ํ๋ฉด ์ด๋์ด๊ธฐ ๋๋ฌธ์ @GetMapping ์ฌ์ฉ
         * localhost:8080/menu_ins๋ก ๋ค์ด์ค๋ฉด /menu/menu_ins.html ํ๋ฉด์ ๋ณด์ฌ์ค
         */
        @GetMapping("/menu_ins")
        public String doInsert() {
            return "/menu/menu_ins";
        }
        
        /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 2 */
        @PostMapping("/menu_ins")
        public String doInsertPost(
                @RequestParam("coffee") String strCoffee, 
                @RequestParam("kind") String strKind, 
                @RequestParam("price") String strPrice )    
        {
            log.info("==========================================================");
            log.info(strCoffee);
            int intI = menuSvc.doInsert(strCoffee, strKind, strPrice);
            return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
        }
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
        
        
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก */
        public int doInsert(String strCoffee, String strKind, String strPrice) {
            int intI = menuDao.doInsert(strCoffee, strKind, strPrice);
            return intI;
        }   
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java

        @Mapper
        public interface MenuDao {

            List<Map<String, Object>> doList();
            
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก */
            int doInsert(@Param("strCoffee") String coffee, @Param("strKind")  String kind, @Param("strPrice")  String price);
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [INSERT] - ๋ฉ๋ด ๋ฑ๋ก  -->
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doInsert -->
        <insert id="doInsert">
            INSERT INTO coffee_menu (coffee, kind, price)
            VALUES(#{strCoffee}, #{strKind}, CAST(#{strPrice} as INTEGER))
        </insert>
```
            
## ๐ก [DELETE] - ๋ฉ๋ด ์ญ์ 
```
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ์ญ์  ํด๋ฆญ ์ href์ /menu_del?no=1 ๋ฐ๊ฒ ์ค์ 
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
              <td>Chk</td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td>์์ </td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>


b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
    
        /* [DELETE] - ๋ฉ๋ด ์ญ์  */
        @GetMapping("/menu_del")
        public String doDelete(@RequestParam("no") String strNo) {
            log.info("==========================================================");
            log.info("strNo:" + strNo);
            
            int intI = menuSvc.doDelete(strNo);

            return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
        }            
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
     
     
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [DELETE] - ๋ฉ๋ด ์ญ์  */
        public int doDelete(String strNo) {
            int intI = menuDao.doDelete(strNo);
            return intI;
        }    
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java
    
        @Mapper
        public interface MenuDao {

            List<Map<String, Object>> doList();
            
            /* [DELETE] - ๋ฉ๋ด ์ญ์  */
            int doDelete(String strNo);
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [DELETE] - ๋ฉ๋ด ์ญ์   -->
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doDelete -->
        <delete id="doDelete">
            DELETE FROM coffee_menu where no = CAST(#{strNo} as INTEGER)
        </delete>
```
            
## ๐ก [SELECT] - ๋ฉ๋ด ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), โ UPDATE๋ฅผ ์ํ ์ฉ๋ โ
```java
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ์์  ํด๋ฆญ ์ href์ /menu_up?no=1 ๋ฐ๊ฒ ์ค์ 
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
              <td>Chk</td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td><a th:href="@{/menu_up(no=${prod.get('no')})}">์์ </a></td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>


b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
    
        /* [SELECT] - ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), UPDATE๋ฅผ ์ํ ์ฉ๋ */
        @GetMapping("/menu_up")
        public String doUpdate(Model model, @RequestParam("no") String strNo) {

            Map<String, Object> map = menuSvc.doListOne(strNo);
            
            model.addAttribute("map", map);

            return "/menu/menu_up"; 
        }         
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
        
        
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [SELECT] - ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), UPDATE๋ฅผ ์ํ ์ฉ๋ */
        public Map<String, Object> doListOne(String strNo) {
            Map<String, Object> map = menuDao.doListOne(strNo);

            return map;
        }    
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java
    
        @Mapper
        public interface MenuDao {

            /* [SELECT] - ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), UPDATE๋ฅผ ์ํ ์ฉ๋ */
            Map<String, Object> doListOne(String strNo);
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [SELECT] - ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), UPDATE๋ฅผ ์ํ ์ฉ๋ -->
        <!-- resultType๋ Dao์ type: map -->
        <!-- Map<String, Object> doListOne(String strNo); ์์ type์ map -->
        <select id="doListOne" resultType="map">
            SELECT no, coffee, kind, price,
                DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                FROM coffee_menu
                where no = CAST(#{strNo} as INTEGER)
        </select>
```

## ๐ก [UPDATE] - ๋ฉ๋ด ์์  
```java
a. html 
    a. /src/main/resources/templates/menu/menu_up.html
        - ์์  > ๋ฉ๋ด ์์  ํด๋ฆญ ์ ์์  ๋๊ฒ๋ ํ๊ธฐ ์ํจ
        
            <!-- map์ผ๋ก ์ฌ์ฉํ๊ธฐ ๋๋ฌธ์ map.get('๋ณ์๋ช')์ผ๋ก ๊ฐ์ ๊ฐ์ ธ์ด  -->
            <form name="fm_menu_ins" autocomplete="on" action="/menu_up" method="post">
              <fieldset>
        
                <legend> [์ปคํผ ๋ฉ๋ด ๋ฑ๋ก] </legend>
                <label>๋ฉ๋ด๋ช</label> <input type="text" id="name" name="coffee" th:value="${map.get('coffee')}"></p>
                <label>์ข ๋ฅ </label><select name="kind">
                                    <option value="์ปคํผ" th:selected="${map.get('kind')} == '์ปคํผ'">์ปคํผ</option>
                                    <option value="๋ผ์ปคํผ" th:selected="${map.get('kind')} == '๋ผ์ปคํผ'">๋ผ์ปคํผ</option>
                                    <option value="์์ด๋" th:selected="${map.get('kind')} == '์์ด๋'">์์ด๋</option>
                                  </select>
                                  </p>
                &nbsp;&nbsp;
                <label>๊ฐ ๊ฒฉ </label><input type="number" name="price" th:value="${map.get('price')}"></p>
                <input type="hidden" name="coffee_id" th:value="${map.get('no')}">
        
                <input type="submit" value="๋ฉ๋ด ์์ " style="width: 100px;height: 30px;font-weight: bold; font-size: medium">
              </fieldset>
            </form>
            
            <input type="hidden" name="no" th:value="${map.get('no')}">


b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
    
        /* [UPDATE] - ๋ฉ๋ด ์์  */
        @PostMapping("/menu_up")
        public String doUpdatePost(
                @RequestParam("no") String strNo, 
                @RequestParam("coffee") String strCoffee, 
                @RequestParam("kind") String strKind, 
                @RequestParam("price") String strPrice )    
        {
            int intI = menuSvc.doUpdate(strNo, strCoffee, strKind, strPrice);
            return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
        }      
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
     
     
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [UPDATE] - ๋ฉ๋ด ์์  */
        public int doUpdate(String strNo, String strCoffee, String strKind, String strPrice) {
            int intI = menuDao.doUpdate(strNo, strCoffee, strKind, strPrice);
            return intI;
        }    
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java
    
        @Mapper
        public interface MenuDao {
            
            /* [UPDATE] - ๋ฉ๋ด ์์  */
            int doUpdate(@Param("strNo") String no, @Param("strCoffee") String coffee, @Param("strKind") String kind, @Param("strPrice") String price);
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [UPDATE] - ๋ฉ๋ด ์์   --> 
        <update id="doUpdate">
           Update coffee_menu
           Set
               coffee = #{strCoffee},
               kind = #{strKind},
               price = CAST(#{strPrice} as INTEGER)
           Where no = CAST(#{strNo} as INTEGER)
       </update>
```
           
## ๐ก [SELECT] - ๋ฉ๋ด ๊ฒ์ ์กฐ๊ฑด์ ์ํ ์กฐํ(Search)
```java
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ๊ฒ์ ์กฐ๊ฑด ์๋ ฅ ํ ์กฐํ ๋ฒํผ ํด๋ฆญ ์ ํด๋น ๊ฐ๋ง ๋์ค๊ฒ ํ๊ธฐ ์ํจ
        
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/MenuCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->    
            <form name="fm_menu" autocomplete="on" action="/menu_search" method="post">
              <fieldset>

                <legend> [๊ฒ์์กฐ๊ฑด] </legend>
                <label>๋ฑ๋ก๊ธฐ๊ฐ</label><input type="date" id="start_date" name="start_date" min="2020-01-01" max="2023-12-31">
                <input type="date" id="end_date" name="end_date" min="2020-01-01" max="2023-12-31">
                &nbsp;&nbsp;
                <label>๋ฉ๋ด๋ช</label> <input type="text" id="coffee" name="coffee">
                &nbsp;&nbsp;
                <label>์ข๋ฅ</label> <select id="kind" name="kind">
                <option value="ALL">์ ์ฒด</option>
                <option value="์ปคํผ">์ปคํผ</option>
                <option value="๋ผ์ปคํผ">๋ผ์ปคํผ</option>
                <option value="์์ด๋">์์ด๋</option>
              </select>
              </fieldset>
            </form>    
    
    b. /src/main/resources/templates/menu/menu.html
        - start_date, end_date ์๊ฐ ์ค์ ์ ์ํ javascript ์ฌ์ฉ
        * ๊ผญ </form> ํ๊ทธ ์๋์ ์ฌ์ฉํด์ผ ์ค์  ๋จ
        
            <script>
                /* ํ์ฌ ์๊ฐ ๋ ์ง์ ์ ์ฉ์ํค๊ธฐ */
                const now = new Date();    // ํ์ฌ ๋ ์ง ๋ฐ ์๊ฐ
                const time7 = new Date(now.setDate(now.getDate() - 100));    // ๊ธฐ๊ฐ ์ค์ 
                document.getElementById("start_date").value= time7.toISOString().slice(0,10);
                document.getElementById("end_date").value= new Date().toISOString().slice(0,10);
            </script>
        
    
    c. /src/main/resources/templates/menu/menu.html
        - MenuCon์์ model.addAttribute("list", list); ๋ก ๋ฐ์ดํฐ๋ฅผ ๋๊ฒจ์ค ๊ฐ์ ๋ฟ๋ ค์ค
        
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
              <td>Chk</td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td><a th:href="@{/menu_up(no=${prod.get('no')})}">์์ </a></td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>


b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
    
        /*
         * [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search)
         * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Map<String, Object>> list ์ฌ์ฉ
         * Model model๋ก menu.html์ ์๋ <tr th:each="prod : ${list}">์ ๋ฟ๋ ค์ฃผ๊ธฐ ์ํด list๋ก ๋๊ฒจ์ค
         */
        @PostMapping("/menu_search")
        public String doSearch(
                @RequestParam("start_date") String strStartDate, 
                @RequestParam("end_date") String strEndDate, 
                @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee,  /* null์ด ์ฌ์ ์๋ ๊ฒฝ์ฐ์ defaultValue = "ALL"๋ฅผ ๋ฃ์ด์ฃผ๋ฉด ์ข๋ค. */
                @RequestParam("kind") String strKind,
                Model model)    
        {
            log.info("==========================================================");
            log.info("start_date:" + strStartDate);
            List<Map<String, Object>> list = menuSvc.doSearch(strStartDate, strEndDate, strCoffee, strKind);
            model.addAttribute("list", list);
            return "/menu/menu"; 
        }
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
        
        
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search) */
        public List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) {
            
            List<Map<String, Object>> list = menuDao.doSearch(strStartDate, strEndDate, strCoffee, strKind);
            return list;
        }
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java
    
        @Mapper
        public interface MenuDao {
            
            /* [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search) */
            List<Map<String, Object>> doSearch(@Param("strStartDate") String start_date, @Param("strEndDate") String end_date, @Param("strCoffee") String coffee, @Param("strKind") String kind);

        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [SELECT] - ๋ฉ๋ด ๊ฒ์ ์กฐ๊ฑด์ ์ํ ์กฐํ(Search) -->
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doSearch -->
        <!-- List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) ์์ type์ map -->
        <!--  WHERE 1=1์ TRUE ๊ฐ์ ์ผ๋จ ๋๊ฒจ์ค(AND) -->
        <!--
        a.  <![CDATA[   ]]> : xml ํ์ฑ์ ๊ด์ฌํ์ง ์๋๋ก ์ฒ๋ฆฌ(์ด๊ณ  ๋ซ์์ฃผ๋ฉด ๋จ)
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
            AND reg_day &lt; DATE_ADD(DATE_FORMAT(#{strEndDate},'%Y%m%d'),INTERVAL +1 DAY) # +1์ผ ํ ์ด์ ๋ 2023-06-18 ๊น์ง ๋์์ผ ํ๊ธฐ ๋๋ฌธ
            <!-- MenuCon.java > @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee์์ defaultValue๋ฅผ null ๋์  ์ ์ด์ค -->
            <if test="strCoffee != 'ALL'">
                AND coffee LIKE CONCAT(#{strCoffee}, '%')
            </if>
            <if test="strKind != 'ALL'">
                AND kind = #{strKind}
            </if>
        </select>
```

## ๐ก [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ (์ฒดํฌ๋ฐ์ค), [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก
```java
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ์ฒดํฌ ๋ฐ์ค ๊ธฐ๋ฅ ๋ถ์ฌ ํ ๋ค์ค ๋ฐ์ดํฐ ์ฒ๋ฆฌ๋ฅผ ํ๊ธฐ ์ํจ
        
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
                <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td>
    
    b. /src/main/resources/templates/menu/menu.html
        - form tag๋ก table๋ฅผ ๊ฐ์ธ์ค(action์ ๊ฐ์ ๋ถ์ฌํ์ฌ ์ปจํธ๋กค๋ฌ์์ ํ์ํ๊ธฐ ์ํจ)
        
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/MenuCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->   
            <form name="formTable" id="IdFormTable" method="post" action="/ "> 
            <table class="table">
            <thead>                 
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
              <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td><a th:href="@{/menu_up(no=${prod.get('no')})}">์์ </a></td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>
              
            </tbody>
            </table>
            </form> 
            

b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
        /*
         * [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ 
         * [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก
         * menu.html ์์ <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td> ์ name๊ฐ์ @RequestParam ์ ์
         * menu.html ์์ <input type="hidden" name="hidden_price">์ name๊ฐ์ @RequestParam ์ ์
         */
        @PostMapping("/menu_updatePrice")
        public String doUpdatePrice(@RequestParam("chkCoffeeNo") List<String> chkList, @RequestParam("hidden_price") String strPrice) {
            
            if(chkList != null) {
                // for(๋ณ์ ์ ์ธ(type ๋ณ์๋ช) : ๋ฐฐ์ด)
                for(String strNo : chkList) {
                    
                    int int1 = menuSvc.doUpdatePrice(strNo, strPrice); // [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ 
                    int int2 = menuSvc.doInsertLog(strNo, strPrice); // [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก
                }
            }
                
            return "redirect:/menu";
        }
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
        
        
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์  */
        public int doUpdatePrice(String strNo, String strPrice) {
            int int1 = menuDao.doUpdatePrice(strNo, strPrice);
            return int1;
        }

        /* [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก */
        public int doInsertLog(String strNo, String strPrice) {
            int int2 = menuDao.doInsertLog(strNo, strPrice);
            return int2;
        }
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java
    
        @Mapper
        public interface MenuDao {
            
            /* [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์  */
            int doUpdatePrice(@Param("strNo") String no, @Param("strPrice") String price);
            
            /* [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก */
            int doInsertLog(@Param("strNo") String no, @Param("strPrice") String price);
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์  --> 
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doSearch -->
        <update id="doUpdatePrice">
              Update coffee_menu
              SET
                price = CAST(#{strPrice} as INTEGER)
              Where no = CAST(#{strNo} as INTEGER)
        </update>
       
        
        <!-- [INSERT] - ๊ฐ๊ฒฉ ๋ก๊ทธ ๋ฐ์ดํฐ ๋ฑ๋ก --> 
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doInsertLog -->
        <insert id="doInsertLog">
            INSERT INTO log (coffee_no, price)
            VALUES (#{strNo}, CAST(#{strPrice} as INTEGER))
        </insert>
```

## ๐ก ์ ์ฟผ๋ฆฌ(ํ ๋ฒ์ ์ฒ๋ฆฌ) - [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ (์ฒดํฌ๋ฐ์ค), [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก
```java
a. html 
    a. /src/main/resources/templates/menu/menu.html
        - ์ฒดํฌ ๋ฐ์ค ๊ธฐ๋ฅ ๋ถ์ฌ ํ ๋ค์ค ๋ฐ์ดํฐ ์ฒ๋ฆฌ๋ฅผ ํ๊ธฐ ์ํจ
        
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
                <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td>
    
    b. /src/main/resources/templates/menu/menu.html
        - form tag๋ก table๋ฅผ ๊ฐ์ธ์ค(action์ ๊ฐ์ ๋ถ์ฌํ์ฌ ์ปจํธ๋กค๋ฌ์์ ํ์ํ๊ธฐ ์ํจ)
        
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/MenuCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->   
            <form name="formTable" id="IdFormTable" method="post" action="/ "> 
            <table class="table">
            <thead>                 
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
              <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td><a th:href="@{/menu_up(no=${prod.get('no')})}">์์ </a></td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>
              
            </tbody>
            </table>
            </form> 
            

b. Controller
    - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
        /*
         * ํ๋ฒ์ ํ๋๋ง ํจ์จ์ ์ผ๋ก ์ฌ์ฉ 
         * [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ (์ ์ฟผ๋ฆฌ - 1๋ฒ์ ์ฒ๋ฆฌํ๋ ๊ฒ์ ๋ปํจ)
         * [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก(์ ์ฟผ๋ฆฌ - 1๋ฒ์ ์ฒ๋ฆฌํ๋ ๊ฒ์ ๋ปํจ)
         * menu.html ์์ <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td> ์ name๊ฐ์ @RequestParam ์ ์
         * menu.html ์์ <input type="hidden" name="hidden_price">์ name๊ฐ์ @RequestParam ์ ์
         */
        @PostMapping("/menu_updatePrice")
        public String doUpdatePrice(@RequestParam("chkCoffeeNo") List<String> chkList, @RequestParam("hidden_price") String strPrice) {
            
            int int1 = menuSvc.doUpdatePriceOne(chkList, strPrice);
            int int2 = menuSvc.doInsertLogOne(chkList, strPrice);
        
            return "redirect:/menu";
        }
        
    * ์ด์  Controller > Service๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuSvc.doInsert()๋ก ์ค์ ํ๋ค.
        
        
c. Serivce
    - /src/main/java/com/boot/sailing/service/MenuSvc.java
    
        /* [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ (์ ์ฟผ๋ฆฌ - 1๋ฒ์ ์ฒ๋ฆฌํ๋ ๊ฒ์ ๋ปํจ) */
        public int doUpdatePriceOne(List<String> chkList, String strPrice) {
            int int1 = menuDao.doUpdatePriceOne(chkList, strPrice);         
            return int1;
        }
        
        /* [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก(์ ์ฟผ๋ฆฌ - 1๋ฒ์ ์ฒ๋ฆฌํ๋ ๊ฒ์ ๋ปํจ) */
        public int doInsertLogOne(List<String> chkList, String strPrice) {
            int int2 = menuDao.doInsertLogOne(chkList, strPrice);     
            return int2;
        }
    
    * ์ด์  Service > Dao๋ก ์ ๊ทผํด์ผ ํ๋ ์ฌ๊ธฐ์๋ menuDao.doInsert()๋ก ์ค์ ํ๋ค.
    
    
d. Dao
    - /src/main/java/com/boot/sailing/dao/MenuDao.java
    
        @Mapper
        public interface MenuDao {
            
            /* [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ (์ ์ฟผ๋ฆฌ - doUpdatePriceOne) */
            int doUpdatePriceOne(@Param("chkList") List<String> chkCoffeeNo, @Param("strPrice") String price);

            /* [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก(์ ์ฟผ๋ฆฌ - doInsertLogOne) */
            int doInsertLogOne(@Param("chkList") List<String> chkCoffeeNo, @Param("strPrice") String price);
        }
    
    * ์ด์  Dao > Mapper๋ก ์ ๊ทผํ๋ฉด ๋๋ค


e. Mapper
    - /src/main/resources/sqlmapper/CoffeeMenu.xml
    
        <!-- [UPDATE] - ๋ค์ค ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ์์ (์ ์ฟผ๋ฆฌ - 1๋ฒ์ ์ฒ๋ฆฌํ๋ ๊ฒ์ ๋ปํจ) -->
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doUpdatePriceOne -->
        <update id="doUpdatePriceOne">
              Update coffee_menu
              SET
                  price = CAST(#{strPrice} as INTEGER)
              <!-- collection์     int doUpdatePriceOne(List<String> chkList, String strPrice); ์์์ chkList๋ฅผ ๋ปํจ -->
              <!-- open="ID in -> open="no in -->
              <where>
                  <foreach item="item" index="index" collection="chkList" open="no in (" separator="," close=")" nullable="true">
                       #{item}
                  </foreach>
              </where>
        </update>
       
        
        <!-- [INSERT] - ์์ ํ ๊ฐ๊ฒฉ ๋ฐ์ดํฐ ๋ฑ๋ก(์ ์ฟผ๋ฆฌ - 1๋ฒ์ ์ฒ๋ฆฌํ๋ ๊ฒ์ ๋ปํจ) -->
        <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doInsertLogOne -->
        <insert id="doInsertLogOne">
            INSERT INTO log (coffee_no, price)
            <foreach item="item" index="index" collection="chkList" separator=" UNION ALL " nullable="true">
                 SELECT #{item}, CAST(#{strPrice} as INTEGER) FROM DUAL
            </foreach>
        </insert>
```
    
## ๐ก Map, List -> VO (doList(์กฐํ) - Map / Vo๋ก ์ ๋ฆฌ)
     
    a. Vo class ์์ฑ
        - /src/main/java/com/boot/sailing/vo/Coffee_menu.java

            @Data
            public class Coffee_menu {

                private String no;
                private String coffee;
                private String kind;
                private String price;
                private String reg_day;
                private String mod_day;
            }
    
    
    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            /*
             * [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Map ์ฌ์ฉ
             * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Map<String, Object>>
             */
            @GetMapping("/menu")
            public String doMenu(Model model) {

                List<Map<String, Object>> list = menuSvc.doList(); // List ์ฌ์ฉ

                model.addAttribute("list", list);
                model.addAttribute("hello", "========== MenuCon ==========");

                return "/menu/menu"; 
            }  
            
            
            /*
             * [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ     - Vo ์ฌ์ฉ
             * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Coffee_menu>
             */
            @GetMapping("/menu")
            public String doMenu(Model model) {

                List<Coffee_menu> list = menuSvc.doList(); // Vo ์ฌ์ฉ
                model.addAttribute("list", list);
                model.addAttribute("hello", "========== MenuCon ==========");
                
                return "/menu/menu"; 
            }  
    
    
    c. Service 
        - /src/main/java/com/boot/sailing/service/MenuSvc.java    
        
            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Map ์ฌ์ฉ */
            public List<Map<String, Object>> doList() {

                List<Map<String, Object>> list = menuDao.doList();
                
                log.info(list);
                return list;    
            }
        
        
            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Vo ์ฌ์ฉ */
            public List<Coffee_menu> doList() {

                List<Coffee_menu> list = menuDao.doList();
                
                log.info(list);
                return list;    
            }
            
            
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Map ์ฌ์ฉ */
            List<Map<String, Object>> doList();
        
        
            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Vo ์ฌ์ฉ */
            List<Coffee_menu> doList();
            
            
    e. Mapper 
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ -->
            <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doList -->
            <!-- resultType๋ Dao์ type: Map -->
            <!-- List<Map<String, Object>> doList(); ์์ type์ map -->
            <select id="doList" resultType="map">
                SELECT no, coffee, kind, price,
                    DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                    DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                    FROM coffee_menu;
            </select>
             
             
            <!-- [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ -->
            <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doList -->
            <!-- resultType๋ Dao์ type: Vo -->
            <!-- List<Coffee_menu> doList(); ์์ type์ Vo -->
            <select id="doList" resultType="com.boot.sailing.vo.Coffee_menu">
                SELECT no, coffee, kind, price,
                    DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                    DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                    FROM coffee_menu;
            </select>
            
            
    f. View 
        - /Sailing/src/main/resources/templates/menu/menu.html
        
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop Map ์ฌ์ฉ -->      
            <tr th:each="prod : ${list}">
              <td><input type="checkBox" name="chkCoffeeNo" th:value="${prod.get('no')}"></td>
              <td th:text="${prod.get('no')}">์ปคํผNo</th>
              <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
              <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
              <td><a th:href="@{/menu_up(no=${prod.get('no')})}">์์ </a></td>
              <td><a th:href="@{/menu_del(no=${prod.get('no')})}">์ญ์ </a></td>
            </tr>
            
            
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop Vo ์ฌ์ฉ -->      
            <tr th:each="prod : ${list}">
              <td><input type="checkbox" name="chkCoffeeNo" th:value="${prod.getNo()}"></td>
              <td th:text="${prod.getNo()}">์ปคํผNo</th>
              <td th:text="${prod.getCoffee()}">๋ฉ๋ด๋ช</td>
              <td th:text="${prod.getKind()}">์ข๋ฅ</td>
              <td th:text="${#numbers.formatInteger(prod.getPrice(),0,'COMMA')}">๊ฐ๊ฒฉ</td>
              <td th:text="${prod.getReg_day()}">๋ฑ๋ก์ผ</td>
              <td th:text="${prod.getMod_day()}">์์ ์ผ</td>
              <td><a th:href="@{menu_up(no=${prod.getNo()})}">์์ </a></td>
              <td><a th:href="@{menu_del(no=${prod.getNo()})}">์ญ์ </a></td>
            </tr>
            
            * ๋งค์ฐ์ค์ : ๋ง์ฝ ์ ๋๋ก Getter๋ฅผ ๊ฐ์ ธ์๋๋ฐ ์๋ฌ๊ฐ ๋ฐ์ํ๋ค๋ฉด mybatis map-underscore-to-camel-case์ด true ํ์ธ(true -> false๋ก ๋ณ๊ฒฝ)
            

## ๐ก Map, List -> VO (doSearch(๊ฒ์) - Map / Vo๋ก ์ ๋ฆฌ)
     
    a. Vo class ์์ฑ
        - /src/main/java/com/boot/sailing/vo/Coffee_menu.java

            @Data
            public class Coffee_menu {

                private String no;
                private String coffee;
                private String kind;
                private String price;
                private String reg_day;
                private String mod_day;
            }
    
    
    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java

            /*
             * [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search) - Map ์ฌ์ฉ
             * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Map<String, Object>> list ์ฌ์ฉ
             * Model model๋ก menu.html์ ์๋ <tr th:each="prod : ${list}">์ ๋ฟ๋ ค์ฃผ๊ธฐ ์ํด list๋ก ๋๊ฒจ์ค
             */
            @PostMapping("/menu_search")
            public String doSearch(
                    @RequestParam("start_date") String strStartDate, 
                    @RequestParam("end_date") String strEndDate, 
                    @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee,  /* null์ด ์ฌ์ ์๋ ๊ฒฝ์ฐ์ defaultValue = "ALL"๋ฅผ ๋ฃ์ด์ฃผ๋ฉด ์ข๋ค. */
                    @RequestParam("kind") String strKind,
                    Model model)    
            {
                log.info("==========================================================");
                log.info("start_date:" + strStartDate);
                List<Map<String, Object>> list = menuSvc.doSearch(strStartDate, strEndDate, strCoffee, strKind);
                model.addAttribute("list", list);
                return "/menu/menu"; 
            }
        
        
            /*
             * [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search) - Vo ์ฌ์ฉ
             * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Coffee_menu> 
             * Model model๋ก menu.html์ ์๋ <tr th:each="prod : ${list}">์ ๋ฟ๋ ค์ฃผ๊ธฐ ์ํด list๋ก ๋๊ฒจ์ค
             */
            @PostMapping("/menu_search")
            public String doSearch(
                    @RequestParam("start_date") String strStartDate, 
                    @RequestParam("end_date") String strEndDate, 
                    @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee,  /* null์ด ์ฌ์ ์๋ ๊ฒฝ์ฐ์ defaultValue = "ALL"๋ฅผ ๋ฃ์ด์ฃผ๋ฉด ์ข๋ค. */
                    @RequestParam("kind") String strKind,
                    Model model)    
            {
                log.info("==========================================================");
                log.info("start_date:" + strStartDate);
                List<Coffee_menu> list = menuSvc.doSearch(strStartDate, strEndDate, strCoffee, strKind);
                model.addAttribute("list", list);
                return "/menu/menu"; 
            }
        
        
    c. Service 
        - /src/main/java/com/boot/sailing/service/MenuSvc.java    
        
            /* [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search) - Map ์ฌ์ฉ */
            public List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) {
                
                List<Map<String, Object>> list = menuDao.doSearch(strStartDate, strEndDate, strCoffee, strKind);
                return list;
            }
        
        
            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Vo ์ฌ์ฉ */
            public List<Coffee_menu> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) {
                
                List<Coffee_menu> list = menuDao.doSearch(strStartDate, strEndDate, strCoffee, strKind);
                return list;
            }
        
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            /* [SELECT] - ๊ฒ์ ๊ธฐ๋ฅ(Search) - Map ์ฌ์ฉ */
            List<Map<String, Object>> doSearch(@Param("strStartDate") String start_date, @Param("strEndDate") String end_date, @Param("strCoffee") String coffee, @Param("strKind") String kind);
            
        
            /* [SELECT] - ๋ฉ๋ด ์ ์ฒด ์กฐํ - Vo ์ฌ์ฉ */
            List<Coffee_menu> doSearch(@Param("strStartDate") String start_date, @Param("strEndDate") String end_date, @Param("strCoffee") String coffee, @Param("strKind") String kind);
            
            
    e. Mapper 
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [SELECT] - ๋ฉ๋ด ๊ฒ์ ์กฐ๊ฑด์ ์ํ ์กฐํ(Search) - Map ์ฌ์ฉ -->
            <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doSearch -->
            <!-- List<Map<String, Object>> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) -->
            <select id="doSearch" resultType="map">
                SELECT NO, coffee, kind, price,
                        DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                        DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                FROM coffee_menu
                WHERE 1=1
                AND reg_day >= DATE_FORMAT(#{strStartDate},'%Y%m%d')
                AND reg_day &lt; DATE_ADD(DATE_FORMAT(#{strEndDate},'%Y%m%d'),INTERVAL +1 DAY) # +1์ผ ํ ์ด์ ๋ 2023-06-18 ๊น์ง ๋์์ผ ํ๊ธฐ ๋๋ฌธ
                <!-- MenuCon.java > @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee์์ defaultValue๋ฅผ null ๋์  ์ ์ด์ค -->
                <if test="strCoffee != 'ALL'">
                    AND coffee LIKE CONCAT(#{strCoffee}, '%')
                </if>
                <if test="strKind != 'ALL'">
                    AND kind = #{strKind}
                </if>
            </select>
             
             
            <!-- [SELECT] - ๋ฉ๋ด ๊ฒ์ ์กฐ๊ฑด์ ์ํ ์กฐํ(Search) - Vo ์ฌ์ฉ -->
            <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doSearch -->
            <!-- List<Coffee_menu> doSearch(String strStartDate, String strEndDate, String strCoffee, String strKind) -->
            <select id="doSearch" resultType="com.boot.sailing.vo.Coffee_menu">
                SELECT NO, coffee, kind, price,
                        DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                        DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                FROM coffee_menu
                WHERE 1=1
                AND reg_day >= DATE_FORMAT(#{strStartDate},'%Y%m%d')
                AND reg_day &lt; DATE_ADD(DATE_FORMAT(#{strEndDate},'%Y%m%d'),INTERVAL +1 DAY) # +1์ผ ํ ์ด์ ๋ 2023-06-18 ๊น์ง ๋์์ผ ํ๊ธฐ ๋๋ฌธ
                <!-- MenuCon.java > @RequestParam(value = "coffee", defaultValue = "ALL") String strCoffee์์ defaultValue๋ฅผ null ๋์  ์ ์ด์ค -->
                <if test="strCoffee != 'ALL'">
                    AND coffee LIKE CONCAT(#{strCoffee}, '%')
                </if>
                <if test="strKind != 'ALL'">
                    AND kind = #{strKind}
                </if>
            </select>
            
            
## ๐ก Map, List -> VO (menu_ins(๋ฑ๋ก) - Map / Vo๋ก ์ ๋ฆฌ)
     
    a. Vo class ์์ฑ
        - /src/main/java/com/boot/sailing/vo/Coffee_menu.java

            @Data
            public class Coffee_menu {

                private String no;
                private String coffee;
                private String kind;
                private String price;
                private String reg_day;
                private String mod_day;
            }
    
    
    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java

            /*
             * [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 1 
             * ํ๋ฉด ์ด๋์ด๊ธฐ ๋๋ฌธ์ @GetMapping ์ฌ์ฉ
             * localhost:8080/menu_ins๋ก ๋ค์ด์ค๋ฉด /menu/menu_ins.html ํ๋ฉด์ ๋ณด์ฌ์ค
             */
            @GetMapping("/menu_ins")
            public String doInsert() {
                return "/menu/menu_ins";
            }
            
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 2 - Map ์ฌ์ฉ(@RequestParam์ ํตํด ๊ฐ ํ์ํ ๋ถ๋ถ์ ์ ์ธํด์ค์ผ ํจ) */
            @PostMapping("/menu_ins")
            public String doInsertPost(
                    @RequestParam("coffee") String strCoffee, 
                    @RequestParam("kind") String strKind, 
                    @RequestParam("price") String strPrice )    
            {
                log.info("==========================================================");
                log.info(strCoffee);
                int intI = menuSvc.doInsert(strCoffee, strKind, strPrice);
                return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
            }
        
        
            /*
             * [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 1 
             * ํ๋ฉด ์ด๋์ด๊ธฐ ๋๋ฌธ์ @GetMapping ์ฌ์ฉ
             * localhost:8080/menu_ins๋ก ๋ค์ด์ค๋ฉด /menu/menu_ins.html ํ๋ฉด์ ๋ณด์ฌ์ค
             */
            @GetMapping("/menu_ins")
            public String doInsert() {
                return "/menu/menu_ins";
            }
        
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก 2 - Vo ์ฌ์ฉ(ModelAttribute์ ํ์ํ coffee, kind, price ๋ค์ด๊ฐ) */
            @PostMapping("/menu_ins")
            public String doInsertPost(@ModelAttribute Coffee_menu coffeeMenu)    
            {
                log.info("==========================coffeeMenu================================");
                log.info(coffeeMenu);
                int intI = menuSvc.doInsert(coffeeMenu);
                return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
            }
        
        
    c. Service 
        - /src/main/java/com/boot/sailing/service/MenuSvc.java    
        
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก - Map ์ฌ์ฉ */
            public int doInsert(String strCoffee, String strKind, String strPrice) {
                int intI = menuDao.doInsert(strCoffee, strKind, strPrice);
                return intI;
            }
        
        
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก - Vo ์ฌ์ฉ */
            public int doInsert(Coffee_menu coffeeMenu) {
                int intI = menuDao.doInsert(coffeeMenu);
                return intI;
            }
        
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก - Map ์ฌ์ฉ */
            int doInsert(@Param("strCoffee") String coffee, @Param("strKind")  String kind, @Param("strPrice")  String price);
        
        
            /* [INSERT] - ๋ฉ๋ด ๋ฑ๋ก - Vo ์ฌ์ฉ */
            int doInsert(Coffee_menu coffeeMenu);
            
            
    e. Mapper 
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [INSERT] - ๋ฉ๋ด ๋ฑ๋ก(Map ์ฌ์ฉ - @RequestParam์ ์ ์ธํ ๊ฐ๋ค์ ๋ฃ์ด์ค์ผ ํจ) -->
            <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doInsert -->
            <insert id="doInsert">
                INSERT INTO coffee_menu (coffee, kind, price)
                VALUES(#{strCoffee}, #{strKind}, CAST(#{strPrice} as INTEGER))
            </insert>
             
             
            <!-- [INSERT] - ๋ฉ๋ด ๋ฑ๋ก(Vo ์ฌ์ฉ - Vo์ ๋ฃ์ ๊ฐ์ฒด๋ค ๊ทธ๋๋ก ์ฌ์ฉ) -->
            <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doInsert -->
            <insert id="doInsert">
                INSERT INTO coffee_menu (coffee, kind, price)
                VALUES(#{coffee}, #{kind}, CAST(#{price} as INTEGER))
            </insert>             
            
        
## ๐ก Map, List -> VO (menu_up(์์ ) - Map / Vo๋ก ์ ๋ฆฌ)
     
    a. Vo class ์์ฑ
        - /src/main/java/com/boot/sailing/vo/Coffee_menu.java

            @Data
            public class Coffee_menu {

                private String no;
                private String coffee;
                private String kind;
                private String price;
                private String reg_day;
                private String mod_day;
            }
    
    
    b. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java

            /* [SELECT] - ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), UPDATE๋ฅผ ์ํ ์ฉ๋ */
            @GetMapping("/menu_up")
            public String doUpdate(Model model, @RequestParam("no") String strNo) {

                Map<String, Object> map = menuSvc.doListOne(strNo);
                
                model.addAttribute("map", map);

                return "/menu/menu_up"; 
            }
            
            /* [UPDATE] - ๋ฉ๋ด ์์  - Map ์ฌ์ฉ*/
            @PostMapping("/menu_up")
            public String doUpdatePost(
                    @RequestParam("no") String strNo, 
                    @RequestParam("coffee") String strCoffee, 
                    @RequestParam("kind") String strKind, 
                    @RequestParam("price") String strPrice )    
            {
                int intI = menuSvc.doUpdate(strNo, strCoffee, strKind, strPrice);
                return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
            }
            
            
            /* [SELECT] - ์์  ํด๋ฆญ ์ ํด๋น ๋ฐ์ดํฐ ๊ฐ ํธ์ถ(doListOne), UPDATE๋ฅผ ์ํ ์ฉ๋ */
            @GetMapping("/menu_up")
            public String doUpdate(Model model, @RequestParam("no") String strNo) {

                Map<String, Object> map = menuSvc.doListOne(strNo);
                
                model.addAttribute("map", map);

                return "/menu/menu_up"; 
            }
            
            /* [UPDATE] - ๋ฉ๋ด ์์  - Vo ์ฌ์ฉ */
            @PostMapping("/menu_up")
            public String doUpdatePost(Coffee_menu coffeeMenu)    
            {
                int intI = menuSvc.doUpdate(coffeeMenu);
                return "redirect:/menu"; // return์ @RequestMapping์ด ์ ์ฉ๋์ง ์๋๋ค.
            }


    c. Service 
        - /src/main/java/com/boot/sailing/service/MenuSvc.java    
        
            /* [UPDATE] - ๋ฉ๋ด ์์  - Map ์ฌ์ฉ */
            public int doUpdate(String strNo, String strCoffee, String strKind, String strPrice) {
                int intI = menuDao.doUpdate(strNo, strCoffee, strKind, strPrice);
                return intI;
            }
        
        
            /* [UPDATE] - ๋ฉ๋ด ์์  - Vo ์ฌ์ฉ */
            public int doUpdate(Coffee_menu coffeeMenu) {
                int intI = menuDao.doUpdate(coffeeMenu);
                return intI;
            }
        
        
    d. Dao
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            /* [UPDATE] - ๋ฉ๋ด ์์  - Map ์ฌ์ฉ*/
            int doUpdate(@Param("strNo") String no, @Param("strCoffee") String coffee, @Param("strKind") String kind, @Param("strPrice") String price);
        
        
            /* [UPDATE] - ๋ฉ๋ด ์์  - Vo ์ฌ์ฉ */
            int doUpdate(Coffee_menu coffeeMenu);
            
            
    e. Mapper 
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <!-- [UPDATE] - ๋ฉ๋ด ์์ (Map ์ฌ์ฉ - @RequestParam์ ์ ์ธํ ๊ฐ๋ค์ ๋ฃ์ด์ค์ผ ํจ)  --> 
            <update id="doUpdate">
               Update coffee_menu
               Set
                   coffee = #{strCoffee},
                   kind = #{strKind},
                   price = CAST(#{strPrice} as INTEGER)
               Where no = CAST(#{strNo} as INTEGER)
           </update>
             
             
            <!-- [UPDATE] - ๋ฉ๋ด ์์ (Vo ์ฌ์ฉ - Vo์ ๋ฃ์ ๊ฐ์ฒด๋ค ๊ทธ๋๋ก ์ฌ์ฉ) --> 
            <update id="doUpdate">
               Update coffee_menu
               Set
                   coffee = #{coffee},
                   kind = #{kind},
                   price = CAST(#{price} as INTEGER)
               Where no = CAST(#{no} as INTEGER)
           </update> 
           
           

## ๐ก [SELECT] - ์ฃผ๋ฌธ๋ด์ญ ์ ์ฒด ์กฐํ(Vo ์ฌ์ฉ)

    a. html 
        - /src/main/resources/templates/menu/order.html
        - ์ฃผ๋ฌธ๋ด์ญ ํด๋ฆญ ์ ์ ์ฒด ์กฐํ
            
            <!-- ์๋ณธ -->
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/OrderCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->
            <form name="fm_member" autocomplete="on">
            <fieldset>
                <legend> [๊ฒ์์กฐ๊ฑด] </legend>
                <label>๋ฑ๋ก๊ธฐ๊ฐ</label><input type="date" id="start_date" name="start_date" min="2020-01-01" max="2023-12-31">
                - <input type="date" id="end_date" name="end_date" min="2020-01-01" max="2023-12-31">
                &nbsp;&nbsp;
                <label>๊ณ ๊ฐ๋ช</label> <input type="text" id="name" name="name">


                &nbsp;&nbsp;<input type="submit" value="์กฐํ" style="width: 80px;height: 30px;font-weight: bold; font-size: medium">

            </fieldset>

            </form>
        
        
            <!-- ์์ ๋ณธ -->    
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/OrderCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->    
            <form name="fm_order" autocomplete="on" action="/order_search" method="post">
                <fieldset>
                    <legend> [๊ฒ์์กฐ๊ฑด] </legend>
                    <label>๋ฑ๋ก๊ธฐ๊ฐ</label><input type="date" id="start_date" name="start_date" min="2020-01-01" max="2023-12-31">
                    - <input type="date" id="end_date" name="end_date" min="2020-01-01" max="2023-12-31">
                    &nbsp;&nbsp;
                    <label>๋ฉ๋ด๋ช</label> <input type="text" id="menu" name="menu">
                    &nbsp;&nbsp;
                    <label>๊ณ ๊ฐ๋ช</label> <input type="text" id="name" name="name">

                </select>

                    &nbsp;&nbsp;<input type="submit" value="์กฐํ" style="width: 80px;height: 30px;font-weight: bold; font-size: medium">

                    <!-- <a href="javascript:loadDocArray()">test</a> -->
                    <!--        <label>CheckBox : </label><span id="idCheckBox"></span>-->
              </fieldset>

            </form>
        
            <script>
                  /* ํ์ฌ ์๊ฐ ๋ ์ง์ ์ ์ฉ์ํค๊ธฐ */
                  const now = new Date();    // ํ์ฌ ๋ ์ง ๋ฐ ์๊ฐ
                  const time7 = new Date(now.setDate(now.getDate() - 100));    // ๊ธฐ๊ฐ ์ค์ 
                  document.getElementById("start_date").value= time7.toISOString().slice(0,10);
                  document.getElementById("end_date").value= new Date().toISOString().slice(0,10);
                
                  /* ๊ฐ๊ฒฉ ์์  */
                  function onModify(){
                    let _price = prompt("๊ฐ๊ฒฉ์ ์๋ ฅํ์ธ์");
                
                    /* ์ทจ์๋ฅผ ๋๋ฅด๋ฉด ๊ฐ์ด undefined ์ด๋ฏ๋ก ์ข๋ฃ */
                    if(_price == undefined) {
                        return;
                    } 
                    /* ๊ฐ๊ฒฉ์ ์๋ ฅ ์ํ๋ฉด ๋ค์์๋ ฅํ๋ผ๊ณ  ์ฌํธ์ถ */
                    else if(_price =="") {
                        alert("๊ฐ๊ฒฉ์ ์๋ ฅํ์ธ์");
                        onModify();
                    } 
                    /* ๊ฐ๊ฒฉ์ ์๋ ฅ ํ๋ค๋ฉด ์ ์ฅ */
                    else if(_price != "") {
                        let _frm = document.formTable; // ๋ง๋ค์ด ๋์ form tag์ name ๊ฐ!
                       _frm.hidden_price.value = _price; // hidden tag์ ๊ฐ์ ๋ฃ์ด์ค
                       _frm.submit();
                    }
                  }
            </script>
        
        
        
        
            <!-- ์๋ณธ -->
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/OrderCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->      
            <table class="table">
                <thead>
                <tr class="tr_td">
                    <th>Chk</th>
                    <th>์ฃผ๋ฌธ๋ฒํธ</th>
                    <th>์ปคํผNo</th>
                    <th>๋ฉ๋ด๋ช</th>
                    <th>๊ณ ๊ฐID</th>
                    <th>๊ณ ๊ฐ๋ช</th>
                    <th>์ฃผ๋ฌธ์ผ์</th>
                </tr>
                </thead>
            
        
            <!-- ์์ ๋ณธ -->    
            <!-- Post ๋ฐฉ์์ผ๋ก ๋ฐ์ผ๋ฉฐ action์ Controller Mapping ๊ฐ์ผ๋ก ์ค์ (/src/main/java/com/boot/sailing/controller/OrderCon.java) -->
            <!-- name๋ค์ ๋ฐ์ดํฐ๋ฒ ์ด์ค์์ ์ง์ ํ ์ปฌ๋ผ ๊ฐ ๊ทธ๋๋ก ์ฌ์ฉํด์ผ ํจ -->      
            <form name="formTable" id="IdFormTable" method="post" action="/order_updatePrice">
            <table class="table">
                <thead>
                <tr class="tr_td">
                    <th>Chk</th>
                    <th>์ฃผ๋ฌธ๋ฒํธ</th>
                    <th>์ปคํผNo</th>
                    <th>๋ฉ๋ด๋ช</th>
                    <th>๊ณ ๊ฐID</th>
                    <th>๊ณ ๊ฐ๋ช</th>
                    <th>์ฃผ๋ฌธ์ผ์</th>
                </tr>
                </thead>
        
        
                <tbody id="t_body">
                <!--- ๋ฐ์ดํ ์ถ๋ ฅ ๋ถ๋ถ -->
        
                <!-- OrderCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
                <!-- Thymeleaf - for loop -->      
                    <tr th:each="prod : ${list}">
                        <td><input type="checkbox" name="chkCoffeeNo" th:value="${prod.getNo()}"></td>
                        <th>์ฃผ๋ฌธ๋ฒํธ</th>
                        <td th:text="${prod.getNo()}">์ปคํผNo</th>
                        <td th:text="${prod.getCoffee()}">๋ฉ๋ด๋ช</td>
                        <td th:text="${prod.getCust_id()}">๊ณ ๊ฐID</td>
                        <td th:text="${prod.getName()}">๊ณ ๊ฐ๋ช</td>
                        <td th:text="${prod.getReg_day()}">์ฃผ๋ฌธ์ผ์</td>
                    </tr>
                    </tbody>
                </table>
              </form>
              
    
    b. Vo ์์ฑ
        - /src/main/java/com/boot/sailing/vo/Order_details.java
        
            @Data
            public class Order_details {
                
                private String no;
                private String coffee_no;
                private String coffee;
                private String price;
                private String cust_id;
                private String name;
                private String reg_day;
                
            }
            
            * ๋ฐ์ดํฐ๋ฒ ์ด์ค ํ์ด๋ธ ์์ฑ ์ ์ฌ์ฉํ ์ปฌ๋ผ๋ค ์ ์ธํด์ฃผ๋ฉด ๋๋ค
    
    
    c. Controller
        - /src/main/java/com/boot/sailing/controller/OrderCon.java
        
            @Controller
            public class OrderCon {
                
                @Autowired
                OrderSvc orderSvc;
                
                /*
                 * [SELECT] - ์ฃผ๋ฌธ ๋ด์ญ ์ ์ฒด ์กฐํ     
                 * ํด๋น ๊ฒ์ ๊ฒฐ๊ณผ๋ง ๋ฐ๊ธฐ ์ํ์ฌ List<Order_details> - Vo ์ฌ์ฉ
                 */
                @GetMapping("/order")
                public String doOrder(Model model) {

                    List<Order_details> list = orderSvc.doList();
                    model.addAttribute("list", list);
                    model.addAttribute("hello", "========== OrderCon - VO ์ฌ์ฉ ==========");
                    return "/order/order"; 
                }  
            }
    
    
    d. Service 
        - /src/main/java/com/boot/sailing/service/OrderSvc.java
        
            @Service 
            @Log4j2
            public class OrderSvc {
                
                @Autowired
                OrderDao orderDao;
                
                /* [SELECT] - ์ฃผ๋ฌธ ๋ด์ญ ์ ์ฒด ์กฐํ(Vo ์ฌ์ฉ)  */
                public List<Order_details> doList() {
                    List<Order_details> list = orderDao.doList();
                    
                    log.info(list);
                    return list;
                }
            }
            
            
    e. Dao
        - /src/main/java/com/boot/sailing/dao/OrderDao.java
        
            @Mapper
            public interface OrderDao {

                /* [SELECT] - ์ฃผ๋ฌธ ๋ด์ญ ์ ์ฒด ์กฐํ(Vo ์ฌ์ฉ)  */
                 List<Order_details> doList();
            }
            
            * class๊ฐ ์๋ interface๋ก Dao๋ฅผ ์์ฑํด์ผ ํ๋ค.
            
    
    f. Mapper
        - /src/main/resources/sqlmapper/OrderDetails.xml
        
            <?xml version="1.0" encoding="UTF-8" ?>
            <!DOCTYPE mapper
              PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
              "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
              
            <!-- namespace = Dao ์์น -->  
            <mapper namespace="com.boot.sailing.dao.OrderDao">

                <!-- [SELECT] - ์ฃผ๋ฌธ ๋ด์ญ ์ ์ฒด ์กฐํ -->
                <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doList -->
                <!-- List<Order_detail> doList(); ์์ type์ Vo -->
                <select id="doList" resultType="com.boot.sailing.vo.Order_details">
                    SELECT NO, coffee_no, coffee, price, cust_id, NAME,
                    DATE_FORMAT(reg_day,'%Y.%m.%d') AS reg_day
                    FROM order_list
                </select>

            </mapper>