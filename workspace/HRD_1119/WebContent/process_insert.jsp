<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbconn.jsp" %>
<%
String a = request.getParameter("custno");
String b = request.getParameter("custname");
String c = request.getParameter("phone");
String d = request.getParameter("address");
String e = request.getParameter("joindate");
String f = request.getParameter("grade");
String g = request.getParameter("city");

try{
String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, a);
pstmt.setString(2, b);
pstmt.setString(3, c);
pstmt.setString(4, d);
pstmt.setString(5, e);
pstmt.setString(6, f);
pstmt.setString(7, g);
pstmt.executeUpdate();
out.print("<script>location.href='insert.jsp';alert('등록이 완료 되었습니다.');</script>");
}catch(SQLException s){
	s.getMessage();
	System.out.println("실패");
}finally{
	if(pstmt !=null) pstmt.close();
	if(conn !=null) conn.close();
}
%>