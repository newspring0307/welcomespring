<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>

<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>주문조회</title>
<!-- 화면주소 -->

  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  <!-- Google web font "Open Sans" -->
  <link rel="stylesheet" href="../resources/css/bootstrap.min.css">                                      <!-- Bootstrap style -->
  <link rel="stylesheet" href="../resources/css/templatemo-style.css">    
  
  
   <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
          
          
<!--           <link rel="stylesheet" type="text/css" href="../resources/css/NewFile.css" media="all" /> -->
<!--           <link href="https://fonts.googleapis.com/css2?family=East+Sea+Dokdo&display=swap" rel="stylesheet">  -->
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
  
<link rel="stylesheet" type="text/css" href="//c.011st.com/css/mytmall/mytmall_v2.css">


</head>
<body><div id="_sub_ifmlayerDIV0" style="position: absolute; left: 0px; top: 0px; z-index: 10000; border-style: none; visibility: hidden;"></div><div id="_ifmlayerDIV0" style="position: absolute; left: 0px; top: 0px; z-index: 9999; border-style: none; visibility: hidden;"><iframe id="_ifmlayer0" name="_ifmlayer0" width="100%" height="100%" src="/html/blank.html" marginwidth="0" marginheight="0" frameborder="0" scrolling="no" style="border:none;border-width:0px" title="_ifmlayer0"></iframe></div>

<div id="wrapBody">
주문이 완료되었습니다.
<a href="getJumunList.do">주문내역 보기</a>
<a href="../cart/getCartList.do">장바구니로 돌아가기</a>
</div>
   
   

</body>
</html>