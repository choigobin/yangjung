<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="dbconn.jsp" %>
	<%
	String custno = request.getParameter("custno");
	String custname ="", phone ="", address ="", joindate ="", grade ="", city = "";
	try{
		String sql = "select * from member_tbl_02 where custno = "+custno;
		pstmt = conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		rs.next();
		custno = rs.getString(1);
		custname = rs.getString(2);
		phone = rs.getString(3);
		address = rs.getString(4);
		joindate = rs.getString(5);
		grade = rs.getString(6);
		city = rs.getString(7);
	}catch(SQLException e){
		e.getMessage();
		System.out.print("로딩 실패");
	}finally{
		if(rs != null){rs.close();}
		if(pstmt != null){pstmt.close();}
		if(conn != null){conn.close();}
	}
	%>
	<br />
	<h3 align="center">홈쇼핑 회원 정보 수정</h3>
	<br />
	<form action="process_update.jsp" name="insert">
	<table align="center">
		<tr>
			<th>회원정보(자동발생)</th>
			<td width="300">
				<input type="text" size=10; name="custno" value=<%=custno%>>
			</td>
		</tr>
		<tr>
			<th>회원성명</th>
			<td>
				<input type="text" size=10; name="custname" value=<%=custname%>>
			</td>
		</tr>
		<tr>
			<th>회원전화</th>
			<td>
				<input type="text" size=20; name="phone" value=<%=phone%>>
			</td>
		</tr>
		<tr>
			<th>회원주소</th>
			<td>
				<input type="text" size=30; name="address" value='<%=address%>'>
			</td>
		</tr>
		<tr>
			<th>가입일자</th>
			<td>
				<input type="text" size=10; name="joindate" value=<%=joindate%>>
			</td>
		</tr>
		<tr>
			<th>고객등급[A:VIP,B:일바,C:직원]</th>
			<td>
				<input type="text" size=10; name="grade" value=<%=grade%>>
			</td>
		</tr>
		<tr>
			<th>도시코드</th>
			<td>
				<input type="text" size=10; name="city" value=<%=city%>>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="수정" onclick="javascript:insert1()">
				<input type="button" value="조회" onclick="location.href='select.jsp'">
			</td>
		</tr>
	</table>
	</form>
<%@include file="footer.jsp" %>