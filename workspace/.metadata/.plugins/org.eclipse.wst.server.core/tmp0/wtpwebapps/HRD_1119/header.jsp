<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<style>
#tb1 {
		height:100%; width:100%;
		border: 0px;
		border-collapse: collapse;
		}
table{
	border: solid black 1px;
	border-collapse: separate;
	}
#t1 {
	border: 0px;
	}
tr,td,th{
	border: solid black 1px;
	}
a{
	color:white;
	text-decoration:none;
}
</style>
<script type="text/javascript">
function insert1() {
	if(document.insert.custname.value==""){
		alert("회원 성명이 입력되지 않았습니다.");
		document.insert.custname.focus();
	}
	else{
		document.insert.submit();
	}
}

</script>
<title>쇼핑몰 회원관리</title>
</head>
<body>
<table id="tb1">
<tr id="t1" height="10%"><%-- header --%>
	<td id="t1" bgcolor="blue" align="center">
		<span style="font-size:20px; color:white;">쇼핑몰 회원관리 ver1.0</span>
	</td>
</tr>
<tr id="t1" height="5%"><%-- nav --%>
	<td id="t1" bgcolor="skyblue" align="left">
		<span style="color:white;">
			&nbsp&nbsp&nbsp&nbsp
			<a href="insert.jsp">회원등록</a>
			&nbsp&nbsp&nbsp&nbsp
			<a href="select.jsp">회원목록조회/수정</a>
			&nbsp&nbsp&nbsp&nbsp
			<a href="money.jsp">회원매출조회</a>
			&nbsp&nbsp&nbsp&nbsp
			<a href="index.jsp">홈으로</a>
		</span>
	</td>
</tr>
<tr id="t1">
	<td id="t1" bgcolor="gray" valign="top">
	