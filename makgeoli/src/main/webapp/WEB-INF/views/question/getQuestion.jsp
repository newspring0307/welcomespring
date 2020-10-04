
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Classic - Responsive Bootstrap 4.0 Template</title>
<!--
Classic Template
http://www.templatemo.com/tm-488-classic
-->
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="../resources/css/templatemo-style.css">  
   <link rel="stylesheet" type="text/css" href="../resources/css/question.css" media="all" />                                 <!-- Templatemo style -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
          <link rel="stylesheet" type="text/css" href="../resources/css/NewFile.css" media="all" />
</head>

    <body>
 
        <div class="tm-header">
            <div class="container-fluid">
                <div class="tm-header-inner">
                    <a href="#" class="navbar-brand tm-site-name">카테고리</a>
                    
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
	                            	<a href="logIn/logOut.do" class="nav-link">${id}님, 환영합니다.</a>                  
                                </li> 
                                </c:if>
                                <li class="nav-item">
                                    <a href="cart.jsp" class="nav-link">장바구니</a>
                                </li>
                                <li class="nav-item">
                                    <a href="jumun.jsp" class="nav-link">주문조회</a>
                                </li>
                                <li class="nav-item">
                                    <a href="notice.jsp" class="nav-link">고객센터</a>
                                </li>
                            </ul>                        
                        </div>
                        
                    </nav>  

                </div>                                  
            </div>            
        </div>

<!--         <div class="tm-home-img-container"> -->
<!--              <img src="img/hanok.jpg" alt="Image" class="hidden-lg-up img-fluid">  -->
<!--         </div> -->

<div class="my_container">
    <div class="my_wrapper fnq">
        <div class="CustomerCenter_title pc">
            <span>고객센터</span>
        </div>
        
        <div class="CustomerCenter_FAQ pc">
            <span>1:1 문의</span>
      </div>
   	
   <center>	
		<hr>
		<form action="updateQuestion.do" method="post">
			<input name="seq" type="hidden" value="${question.seq}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="lightgray" width="70">제목</td>
					<td align="left" bgcolor="white"><input name="title" type="text"
						value="${question.title }" /></td>
				</tr>
				<tr>
					<td bgcolor="lightgray">작성자</td>
					<td align="left" bgcolor="white">${question.id }</td>
				</tr>
				<tr>
					<td bgcolor="lightgray">내용</td>
					<td align="left" bgcolor="white"><textarea name="content" cols="40" rows="10">${question.content }</textarea></td>
				</tr>
				<tr>
					<td bgcolor="lightgray">등록일</td>
					<td align="left" bgcolor="white">${question.regDate }</td>
				</tr>
				<tr>
					<td colspan="2" align="center" bgcolor="white">
					<input type="submit" style="background-color: #e2e2e2;" value="글 수정" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertQuestion.do">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteQuestion.do?seq=${question.seq }">글삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="questionList.do">글목록</a>
   
   
     
   </div>
</div>
       
        </section>
 
        <footer class="tm-footer">
<!--             <div class="container-fluid"> -->
<!--                 <div class="row">                   -->
            
<!--                     <div class="clearfix hidden-lg-up"></div> -->
<!--                     <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 col-xl-3"> -->
<!--                         <div class="tm-footer-content-box"> -->
<!--                             <p class="tm-margin-b-20">      -->
<!--                             <div class="info"> -->
<!--                          ㈜ 막걸리<br> -->
<!--                          대표 : 개발자<br> -->
<!--                          주소 : 서울시 금천구 가산동<br> -->
<!--                          사업자등록번호 620-81-58222<br> -->
<!--                          대표전화 : 050-555-5555<br> -->
<!--                          이메일 : kosmo@kosmo.com<br> -->
<!--                          평일 10:00 ~ 18:00 주말/공휴일 휴무 -->
<!--                       </div> -->
                  
<!--                         </div> -->
<!--                       </div>   -->
<!--                     </div> -->


<!--                 </div> -->

<!--                 <div class="row"> -->
<!--                     <div class="col-xs-12 tm-copyright-col"> -->
<!--                         <p class="tm-copyright-text">Copyright 2016 Your Company Name</p> -->
<!--                     </div> -->
<!--                 </div> -->
        </footer>

        <!-- load JS files -->
        <script src="../resources/js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="../resources/https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h --> 
        <script src="../resources/js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
       
</body>
</html>