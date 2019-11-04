<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="dbconn.jsp" %>
<table width=300 border=1 align="center">
<tr>
	<th>아이디</th>
	<th>비밀번호</th>
	<th>이름</th>
</tr>
<%
	ResultSet rs=null;
	Statement stmt=null;
	try{
		String sql = "select * from membertable";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			String id=rs.getString("id");
			String passwd=rs.getString("passwd");
			String name=rs.getString("name");
			%>
			<tr>
				<td><%=id%></td>
				<td><%=passwd%></td>
				<td><%=name%></td>
			</tr>
			<%
		}
	}catch(SQLException e){
		out.println("database 호출에 실패했습니다.");
		out.println("SQLException: "+e.getMessage());
	}finally{
		if(rs !=null){
			rs.close();}
		if(stmt !=null){
			stmt.close();}
		if(conn !=null){
			conn.close();}
	}
%>
	</table>
</body>
</html>