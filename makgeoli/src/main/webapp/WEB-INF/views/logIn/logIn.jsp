<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>로그인</title>
<!--
Classic Template
http://www.templatemo.com/tm-488-classic
-->
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="../resources/css/templatemo-style.css">  
        <script src="../resources/js/jquery-1.11.3.min.js"></script>                                  <!-- Templatemo style -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
          
          
          <link rel="stylesheet" type="text/css" href="../resources/css/NewFile.css" media="all" />
          <link href="https://fonts.googleapis.com/css2?family=East+Sea+Dokdo&display=swap" rel="stylesheet"> 
    <script type="text/javascript">
    
    


    
    
//         // 필수 입력정보인 아이디, 비밀번호가 입력되었는지 확인하는 함수
//          alert("자스실행");
//             if(!document.userInfo.id.value){
//                 alert("아이디를 입력하세요.");
//                 return false;
//             }
            
//             if(!document.userInfo.pw.value){
//                 alert("비밀번호를 입력하세요.");
//                 return false;
//             }
          
//          	if(session.getAttribute("id")== null) {
//          		  alert("아이디 또는 비밀번호가 틀렸습니다."); 
//          	} 
         
        
        
        
    </script>





</head>

    <body>
 

        <div class="tm-header">
            <div class="container-fluid">
                <div class="tm-header-inner">
                    <a href="../index.jsp" class="navbar-brand tm-site-name">카테고리</a>
                    
                    <!-- navbar -->
                    <nav class="navbar tm-main-nav">

                        <button class="navbar-toggler hidden-md-up" type="button" data-toggle="collapse" data-target="#tmNavbar">
                            &#9776;
                        </button>
                        
                        <div class="collapse navbar-toggleable-sm" id="tmNavbar">
                            <ul class="nav navbar-nav">
                                 
                               <c:if test="${id == null}"> 
                               <li class="nav-item">                                                               
                                       <a href="logIn/logIn.do" class="nav-link">로그인</a>                                                                                                                                                     
                                </li>
                                 </c:if>              
                                                          
                                <c:if test="${id != null}">                                 
                               <li class="nav-item">   
                                  <a href="logIn/logOut.do" class="nav-link">${id}님, 환영합니다. 로그아웃</a>                  
                                </li> 
                                </c:if>
                                <li class="nav-item">
                                    <a href="../cart/cart.do" class="nav-link">장바구니</a>
                                </li>
                                <li class="nav-item">
                                    <a href="../jumun/jumun.do" class="nav-link">주문조회</a>
                                </li>
                                <li class="nav-item">
                                    <a href="../center/center.do" class="nav-link">고객센터</a>
                                </li>
                            </ul>                        
                        </div>
                        
                    </nav>  

                </div>                                  
            </div>            
        </div>


        <section class="tm-section">
          <div class="padding-container">
    <form method="POST" action="logInCheck.do" id="login-submit"name="userInfo" >
        <div class="login-box">
            <center>
            <h1>로그인하기</h1></br>  
            <label for="id"></label><input type="text" value="firstTest" id="id" name="id"size=30 placeholder="아이디를 입력해주세요"></br>
            <label for="password1"></label><input type="password" value="0307" id="password1" name="pw" size=30 placeholder="비밀번호"></br>
            <button type="submit" name="button" class="submit-btn">로그인</button></br>
            <div class="loginNot">
                <span>아직 막걸리 회원이 아니세요?</br>지금 바로 가입하시고</br>다양한 혜택을 누리세요!</span>
                 </form>
                <form >
                <div class="box-flex">
                    <a href="../signUp/signUp.do"><b>회원가입</b></a>
                    
                </div>
            </div>
            </center>
        </div>
	</form>
</div>    
        </section>
 
 
        <footer class="tm-footer">
            <div class="container-fluid">
                <div class="row">                  
				
                    <div class="clearfix hidden-lg-up"></div>
                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3">
                        <div class="tm-footer-content-box">
                            <p class="tm-margin-b-20">     
                            <div class="info">
							    ㈜ 막걸리<br>
							    대표 : 개발자<br>
							    주소 : 서울시 금천구 가산동<br>
							    사업자등록번호 620-81-58222<br>
							    대표전화 : 050-555-5555<br>
							    이메일 : kosmo@kosmo.com<br>
							    평일 10:00 ~ 18:00 주말/공휴일 휴무
							 </div>
						
                        </div>
                      </div>  
                    </div>


                </div>

                <div class="row">
                    <div class="col-xs-12 tm-copyright-col">
                        <p class="tm-copyright-text">Copyright 2016 Your Company Name</p>
                    </div>
                </div>
        </footer>

        <!-- load JS files -->
        <script src="../resources/js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h --> 
        <script src="../resources/js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
       
</body>
</html>