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
<title>막걸리 홈페이지</title>


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
          
          
          <link rel="stylesheet" type="text/css" href="../resources/css/NewFile.css" media="all" />
          <link href="https://fonts.googleapis.com/css2?family=East+Sea+Dokdo&display=swap" rel="stylesheet"> 
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
<section class="tm-section">
            <div class="container-fluid">
<center>

<h2>상품 상세정보</h2>
<table border="1">
	<tr>
		<td>
<!-- 			<img 들어갈 곳> -->
		</td>
		<td>
			<table border="1" style="height: 300px; width: 400px;">
			<tr align="center">
				<td bgcolor="lightgray">상품명</td>
				<td>${productDetail.productName}</td>
			</tr>
			<tr align="center">
				<td bgcolor="lightgray">가격</td>
				<td><fmt:formatNumber value="${productDetail.productPrice}" pattern="###,###"/></td>
			</tr>
			<tr align="center">
				<td bgcolor="lightgray">상품소개</td>
				<td>${productDetail.productInfo}</td>
			</tr>
				<td colspan="2">
					<form name="form1" method="post" action="../cart/cartInsert.do">
						<input type="hidden" name="productId" value="${productDetail.productId}">
						<input type="hidden" name="id" value="${id}">
							<select name="cartAmount">
								<c:forEach begin="1" end="10" var="i">
									<option value="${i}">${i}</option>
								</c:forEach>	
							</select>&nbsp;개	
						<input type="submit" value="장바구니에 담기">
					</form>
			<a href="productList.do">상품목록</a>	
		</td>
	</tr>
</table>
</td>
</tr>
</table>

</center>
   </section>

        <!-- load JS files -->
        <script src="../resources/js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h --> 
        <script src="../resources/js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->

</body>
</html>	