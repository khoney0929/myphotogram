# 🎯 Java & Spring Boot, MariaDB로 SNS웹사이트 구현하기
----
### 📌 MVC패턴을 활용하여구현
- Spring Boot를 이용하여 만든 웹사이트 입니다.
- MariaDB와 연동하여 영속성을 보장하였습니다.
- 기본적인 CRUD를 구현하였으며, 추가로 기능구현을 할 예정입니다.
- ----
### 📌 기술 스택
- Java, SpringBoot, Spring Data JPA, Spring Security
- HTML, css, Thymeleaf, javascript
- MariaDB
- ----
### 📌 JDK 버전 및 Dependency 목록
![image](https://user-images.githubusercontent.com/120121817/233933207-1f2ec8c6-8089-4fc1-a3a7-a865736c4a9a.png)
----
### ⚙ 구현한 기능
### 1. 초기 화면
- Spring Security를 활용하여 초기 화면은 localhost:8080만 입력해도 로그인 화면이 나오도록 설정하였습니다.
![image](https://user-images.githubusercontent.com/120121817/233936893-140296d1-f35a-4233-afb8-2a3df272004f.png)
![image](https://user-images.githubusercontent.com/120121817/233936573-90f2b790-ef4a-4bfd-afe6-f21552af4dad.png)
### 2. 회원가입 기능 및 가입유저 Maria DB에 저장(비밀번호 암호화)
- 가입하기 버튼을 눌러 회원가입을 진행하는 모습입니다.
![image](https://user-images.githubusercontent.com/120121817/233938411-39734b1a-e35f-46d1-be3f-dc57d6d84078.png)
![image](https://user-images.githubusercontent.com/120121817/233938579-8e32bf7c-0909-4c14-aa68-380ac7e3edb9.png)
---
- 가입한 사용자의 비밀번호를 암호화 하여 보안성을 높였습니다.
![image](https://user-images.githubusercontent.com/120121817/233939382-20e478c8-ab5c-4a85-bf95-3b8018695fc5.png)
![image](https://user-images.githubusercontent.com/120121817/233939127-b0424082-c50a-445a-89c8-458a19ddca52.png)
### 3. 로그인 기능
- 로그인화면에서 로그인을 시도할 때, 시큐리티에서 검증을 함.(UserDetailsService인터페이스를 구현한 PrincipalDetailsService클래스를 만들어서 loadUserByUsername매서드를 사용해 username이 있는지 검색합니다.
![image](https://user-images.githubusercontent.com/120121817/234082018-ccd27145-6001-4201-9724-4f3556b17ff5.png)
- DB에서 찾은username값을 담아 PrincipalDetails에 보냅니다. 보내진 값을 바탕으로 UserDetails가 인증여부를 결정합니다.
![image](https://user-images.githubusercontent.com/120121817/234084121-22aa3ed1-93ed-4587-b2fa-a19ba46d4800.png)
### 4. 로그인이 된 화면
- 로그인이 성공하면 기본 home 화면이 나오고 네비바를 통해 원하는 곳으로 이동할 수 있습니다.
![image](https://user-images.githubusercontent.com/120121817/234114961-9a76b8e5-49ea-40ca-a45c-25c776d6e045.png)
![image](https://user-images.githubusercontent.com/120121817/234125613-e5b906ae-4870-49bb-883a-7fa6244c049b.png)
![image](https://user-images.githubusercontent.com/120121817/234115433-a66c1e13-3395-4b22-9198-2987734e9b11.png)
### 5. 회원정보 보기
- DB에 있는 값을 매핑하여 해당 화면에 값을 띄웠습니다.

![image](https://user-images.githubusercontent.com/120121817/234120804-64a77901-5500-478d-9508-b984b7058b4b.png)
![image](https://user-images.githubusercontent.com/120121817/234125505-d48e8dd7-365a-4a97-84fd-396ca98b5adb.png)

---
### 🔨 추후 구현할 목록
- 회원정보 변경추가
- 프로필 사진변경
- 사진등록 기능
- 구독하기 기능
