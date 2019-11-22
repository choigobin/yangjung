<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
request.setCharacterEncoding("utf-8");
Class.forName("oracle.jdbc.OracleDriver");
conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/testdb", "scott", "1234");
int x = 1;
try{
	String sql = "select custno from member_tbl_02 order by custno desc";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	if(rs.next()){
		x=x+rs.getInt(1);
	}
}catch(SQLException e){
	System.out.print(e.getMessage());
}finally{
	if(rs!=null) rs.close();
	if(pstmt!=null) pstmt.close();
	if(conn!=null) conn.close();
}
%>
<style>
#tb1{
	height: 100%; width:100%;
	border-collapse: collapse;
	border: solid 0px;
	}
#t1{
	border: solid 0px;
	}
tr,td{
	border: solid black 1px;
	}
#tb2{
	border-collapse: separate;
	border: solid black 1px;
	}	
a{
	color: white;
	text-decoration: none;
}
</style>
<script type="text/javascript">
function check1() {
	if(document.form.custname.value==""){
		alert("회원 성명이 입력되지 않았습니다.");
		document.form.custname.focus();
	}
	else{
		document.form.submit();
	}
}

</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table id="tb1">
<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>
<tr id="t1">
<td id="t1" valign="top" bgcolor="gray">
<br />
<h1 align="center">홈쇼핑 회원 등록</h1>
<form name="form" method="get" action="SQL_insert.jsp">
<table id="tb2" align="center">
<tr>
	<td style="text-align: center;">
		회원번호(자동발생)
	</td>
	<td width="300">
		<input type="text" size="10" name=custno value="<%=x%>">
	</td>
</tr>
<tr>
	<td style="text-align: center;">
		회원성명
	</td>
	<td>
		<input type="text" size="10" name=custname>
	</td>
</tr>
<tr>
	<td style="text-align: center;">
		회원전화
	</td>
	<td>
		<input type="text" size="20" name=phone>
	</td>
</tr>
<tr>
	<td style="text-align: center;">
		회원주소
	</td>
	<td>
		<input type="text" size="30" name=address>
	</td>
</tr>
<tr>
	<td style="text-align: center;">
		가입일자
	</td>
	<td>
		<input type="text" size="10" name=joindate>
	</td>
</tr>
<tr>
	<td style="text-align: center;">
		고객등급[A:VIP,B:일반,C:직원]
	</td>
	<td>
		<input type="text" size="10" name=grade>
	</td>
</tr>
<tr>
	<td style="text-align: center;">
		도시코드
	</td>
	<td>
		<input type="text" size="10" name=city>
	</td>
</tr>
<tr>
<td colspan="2" style="text-align: center;" >
	<input type="button" value="등록" onclick="javascript:check1()">
	<input type="button" value="조회" onclick="location.href='SQL_select.jsp'">
</td>
</tr>
</table>
</form>
</td>
</tr>
<jsp:include page="footer.jsp"/>
</table>
</body>
</html>