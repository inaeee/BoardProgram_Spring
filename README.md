# BoardProgram_Spring

#### 📢 Spring Framework, BootStrap를 사용하여 게시판을 개발하였다.
🖥️ 개발환경 : Java, Spring Framework, bootstrap, jQuery, MyBatis       

📜 Spring ? 
> Java 플랫폼을 위한 오픈소스 애플리케이션 프레임워크로 엔터프라이즈급 애플리케이션을 개발하기 위한 모든 기능을 종합적으로 제공한다.
> IOC (Inversion of Control) 제어의 역전: 기존 사용자가 모든 작업을 제어하는 것을 특별한 객체에 모든 것을 위임하여
> 객체의 생성부터 생명주기 등 모든 객체에 대한 제어권이 넘어간 것이다.

> DL (Dependency Lookup) 의존성 검색 : 컨테이너에서는 객체들을 관리하기 위해 별도의 저장소에 빈을 저장하는데
> 컨테이너에서 제공하는 API를 이용하여 사용하고자 하는 빈을 검색하는 방법.
> DI (Dependency Injection) 의존성 주입 : 객체가 서로 의존하는 관계가 되게 의존성을 주입하는 것.
> 객체지향프로그램에서 의존성이란 하나의 객체가 어떠한 다른 객체를 사용하고 있음을 의미한다. 
> 각 클래스 사이에 필요로 하는 의존관계를 빈 설정 정보를 바탕으로 컨테이너가 자동으로 연결해주는 것.       

📜 bootstrap ?
> 부트스트랩은 웹사이트를 쉽게 만들 수 있게 도와주는 CSS, JS Framework이다.
하나의 코드로 휴대폰, 태블릿, 데스크탑까지 다양한 기기에서 작동하게 만들 수 있으며,
다양한 기능을 제공하여 사용자가 쉽게 웹사이트를 제작 및 유지, 보수할 수 있도록 도와준다.

<br>

1. BoardApplication.java : MyBatis의 sqlSessionFactory를 반환, spring boot가 실행할 때 DataSource 객체를 이 메서드 실행 시 주입해서 결과를 만들고 그 결과를 스트랭 내 빈으로 사용한다.
2. JspTest.java : 테스트 용으로 생성한 jsp 파일과 db 연동이 잘 되었는지 테스트 진행 (/views/test.jsp)
3. ServletInitializer.java 
```
Spring Boot 웹 애플리케이션을 배포할 때는 주로 embedded tomcat이 내장된 jar파일을 이용한다.
하지만 war파일로 배포를 진행해야하는경우 SpringBootServletInitializer를 상속받아야한다.
Spring 웹 애플리케이션을 외부 Tomcat에서 동작하도록 하기 위해서는 web.xml에 애플리케이션 컨텍스트를 등록해야 한다.
이는, Apache Tomecat이 구동될 때 /WEB-INF 디렉토리에 존재하는 web.xml을 읽어 웹 애플리케이션을 구성하기 때문이다.
```
4. /tags/header.tag, layout.tag, navbar.tag : 부트스트랩 적용 및 레이아웃 설정, 네비게이션 바 화면 적용
5. /views/bootstrap.jsp : 부트스트랩 테마 적용 및 jQuery 적용
6. /views/commentS.jsp : 댓글 목록, 등록, 수정, 삭제 기능, ajax 통신
7. /views/detail.jsp : 글 상세 조회 및 댓글 확인
8. /views/insert.jsp : 글 작성 및 등록
9. /views/list.jsp : 글 목록 조회
10. /views/update.jsp : 글 수정
