<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
<style>
#tb1{
	height: 100%; width:100%;
	border-collapse: collapse;
	border: solid 0px;
	}
#t1{
	border: solid 0px;
	}
th,tr,td{
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
<table id="tb2" align="center">
<tr>
<th>회원번호</th>
<th>회원성명</th>
<th>전화번호</th>
<th>주소</th>
<th>가입일자</th>
<th>고객등급</th>
<th>거주지역</th>
</tr>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
request.setCharacterEncoding("utf-8");
Class.forName("oracle.jdbc.OracleDriver");
conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/testdb", "scott", "1234");

try{
	String sql = "select custno,custname,phone,address,to_char(joindate,'yyyy-mm-dd'),grade,city from member_tbl_02";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while(rs.next()){
		String grad="";
		if(rs.getString(5) !=null){
			if(rs.getString(6).equals("A")){
			grad="VIP";
			}
			if(rs.getString(6).equals("B")){
			grad="일반";
			}
			if(rs.getString(6).equals("C")){
			grad="직원";
			}
		}
		%>
		<tr align="center">
		<td style="color:white;">
		<%=rs.getString(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getString(3)%></td>
		<td><%=rs.getString(4)%></td>
		<td><%=rs.getString(5)%></td>
		<td><%=grad%></td>
		<td><%=rs.getString(7)%></td>
		</tr>
		<%
	}

}catch(SQLException e){
	System.out.print(e.getMessage());
}finally{
	if(rs!=null) rs.close();
	if(pstmt!=null) pstmt.close();
	if(conn!=null) conn.close();
}
%>
</table>
</td>
</tr>
<jsp:include page="footer.jsp"/>
</table>
</body>
</html>