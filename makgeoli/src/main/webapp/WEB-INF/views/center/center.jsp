<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<title>center</title>
<!--
Classic Template
http://www.templatemo.com/tm-488-classic
-->
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">  <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="../resources/css/templatemo-style.css">                                   <!-- Templatemo style -->
          <link rel="stylesheet" type="text/css" href="../resources/css/center.css" media="all" />

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
    
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

<div class="my_container">
    <div class="my_wrapper fnq">
        <div class="CustomerCenter_title pc">
            <span>고객센터</span>
        </div>
        
        <div class="CustomerCenter_FAQ pc">
            <span>자주 묻는 질문</span>
        </div>
        
            <div class="CustomerCenter_FAQ_kinds">
                <div onclick="location.href='center.do'" class="active">전체</div>
                <div onclick="location.href='center1.do'">회원질문</div>
                <div onclick="location.href='center2.do'">주문/결제</div>
                <div onclick="location.href='center3.do'">취소/교환/반품</div>
            </div>
        </div>
        <ul class="CustomerCenter_FAQ_list">
                                <li>
                        <input type="radio" id="Question01" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question01">회원가입은 무료인가요?</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span>네 무료입니다.</span>
                        </div>
                    </li>
                                        <li>
                        <input type="radio" id="Question02" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question02">회원 정보 (주소 포함) 변경하고싶어요</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span>오른쪽 상단 [로그인] → 내정보 → 변경하기 버튼 누르고 정보를 변경 하면 됩니다. </span>
                        </div>
                    </li>
                                     
                    </li>
                                        <li>
                        <input type="radio" id="Question03" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question03">결제내역을 문자나 이메일로 받아 볼 수 있나요?</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span>현재 결제내역을 카카오톡 혹은 문자로 발송 하고있습니다.</span>
                        </div>
                    </li>
                                        <li>
                        <input type="radio" id="Question04" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question04">막걸리에서 어떤 결제방법을 지원하나요?</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span>막걸리에서는 카드 결제만 지원합니다. </span>
                        </div>
                    </li>
                                        <li>
                        <input type="radio" id="Question05" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question05">취소는 어떻게 하나요?</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span>[일반 상품의 경우]
								오른쪽 상단 [로그인] → [나의 담화] → 내구독 메뉴에서 주문 내역에서 주문 취소 하고 싶은 상품의 “배송정보”가 ‘준비중’인 상태이면 옆에 “취소하기”  버튼을 누르시면 됩니다. "배송중" 혹은 "배송완료"인 상태는 따로 문의 주시기 바랍니다.
							</span>
                        </div>
                    </li>
                                        <li>
                        <input type="radio" id="Question06" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question06">교환/반품 기준이 어떻게 되나요?</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span>[단순변심/ 주문 오류의 경우]
								신선식품인 술이 포함되어 단순변심 교환/반품을 받지 않습니다. 
								[상품에 문제가 있는 경우] 
								문제가 있는 부분을 사진 찍어 “카카오톡 플러스” (@sooldamhwa) 1:1 메시지를 보내주시면 저희가 친절하게 안내해 드리겠습니다!
							</span>
                        </div>
                    </li>
                                        <li>
                        <input type="radio" id="Question07" name="CustomerCenter_FAQ_Question" class="inputhidden">
                        <label for="Question07">상품을 교환/반품 하고 싶어요.</label>
                        <div class="CustomerCenter_FAQ_Answer">
                            <span> 1:1 문의를 보내주시면 저희가 친절하게 안내해 드리겠습니다!</span>
                        </div>
                    </li>
                            </ul>
        <div class="OtherQuestion mobile">
            <span>다른 질문 있으신가요?</span>
        </div>
        <form action="../question/questionList.do">
        <div class="Question_btn fnq">
            <button type="submit" class="OneToOneQuestion_btn">더 많은 질문</button>
        </div>
        </form>
    </div>
</div>
</body>
</html>