<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" /> -->
<title>장바구니</title>


<!--
Classic Template
http://www.templatemo.com/tm-488-classic
-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="../resources/css/templatemo-style.css">                                   <!-- Templatemo style -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
          
          
<!--           <link rel="stylesheet" type="text/css" href="../resources/css/NewFile.css" media="all" /> -->
<!--           <link href="https://fonts.googleapis.com/css2?family=East+Sea+Dokdo&display=swap" rel="stylesheet">  -->
<title>상품 상세정보</title>

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
	                            	<a href="logIn/logOut.do" class="nav-link">${id}님, 환영합니다.</a>                  
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

<center>

<table border="1">
<tr>
	<th>상품번호</th>
	<th>상품이미지</th>
	<th>상품명</th>
	<th>가격</th>
</tr>
<c:forEach  items="${productList}" var="product">
<tr>
<td>
	${product.productId}
</td>
<td>
<a href="productDetail.do?productId=${product.productId }">
<!-- 	<img> -->
</a>	
</td>
<td>
<a href="productDetail.do?productId=${product.productId }">${product.productName}</a>
</td>
<td>
<fmt:formatNumber value="${product.productPrice}" pattern="###,###,###"/>
</td>
</tr>
</c:forEach>
</table>

</center>

        <!-- load JS files -->
        <script src="../resources/js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h --> 
        <script src="../resources/js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>	