/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2019-11-20 07:07:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/dbconn.jsp", Long.valueOf(1574149474365L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1574146664402L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1574150639338L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style>\r\n");
      out.write("#tb1 {\r\n");
      out.write("\t\theight:100%; width:100%;\r\n");
      out.write("\t\tborder: 0px;\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t}\r\n");
      out.write("table{\r\n");
      out.write("\tborder: solid black 1px;\r\n");
      out.write("\tborder-collapse: separate;\r\n");
      out.write("\t}\r\n");
      out.write("#t1 {\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\t}\r\n");
      out.write("tr,td,th{\r\n");
      out.write("\tborder: solid black 1px;\r\n");
      out.write("\t}\r\n");
      out.write("a{\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function insert1() {\r\n");
      out.write("\tif(document.insert.custname.value==\"\"){\r\n");
      out.write("\t\talert(\"회원 성명이 입력되지 않았습니다.\");\r\n");
      out.write("\t\tdocument.insert.custname.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tdocument.insert.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<title>쇼핑몰 회원관리</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"tb1\">\r\n");
      out.write("<tr id=\"t1\" height=\"10%\">");
      out.write("\r\n");
      out.write("\t<td id=\"t1\" bgcolor=\"blue\" align=\"center\">\r\n");
      out.write("\t\t<span style=\"font-size:20px; color:white;\">쇼핑몰 회원관리 ver1.0</span>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr id=\"t1\" height=\"5%\">");
      out.write("\r\n");
      out.write("\t<td id=\"t1\" bgcolor=\"skyblue\" align=\"left\">\r\n");
      out.write("\t\t<span style=\"color:white;\">\r\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t<a href=\"insert.jsp\">회원등록</a>\r\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t<a href=\"select.jsp\">회원목록조회/수정</a>\r\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t<a href=\"#\">회원매출조회</a>\r\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t<a href=\"index.jsp\">홈으로</a>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr id=\"t1\">\r\n");
      out.write("\t<td id=\"t1\" bgcolor=\"gray\" valign=\"top\">\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("UTF-8");
String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
String user = "scott";
String password = "1234";

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

Class.forName("oracle.jdbc.OracleDriver");
conn = DriverManager.getConnection(url, user, password);
 
      out.write('\r');
      out.write('\n');

	int number = 0;
	String sql = "select custno from member_tbl_02 order by custno desc";
	try{
		pstmt=conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if(rs.next()){
			number = rs.getInt(1)+1;
		}
	}catch(SQLException e){
		e.getMessage();
	}finally{
		if(rs!=null){rs.close();}
		if(pstmt!=null){pstmt.close();}
		if(conn!=null){conn.close();}
	}

      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<h3 align=\"center\">홈쇼핑 회원 등록</h3>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<form action=\"process_insert.jsp\" name=\"insert\">\r\n");
      out.write("\t<table align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>회원정보(자동발생)</th>\r\n");
      out.write("\t\t\t<td width=\"300\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=10; name=\"custno\" value=\"");
      out.print(number);
      out.write("\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>회원성명</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=10; name=\"custname\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>회원전화</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=20; name=\"phone\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>회원주소</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=30; name=\"address\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>가입일자</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=10; name=\"joindate\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>고객등급[A:VIP,B:일바,C:직원]</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=10; name=\"grade\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>도시코드</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" size=10; name=\"city\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"등록\" onclick=\"javascript:insert1()\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"조회\" onclick=\"location.href='select.jsp'\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr id=\"t1\" height=\"5%\">");
      out.write("\r\n");
      out.write("\t<td id=\"t1\" bgcolor=\"blue\" align=\"center\">\r\n");
      out.write("\t\t<span style=\"color:white;\">HRDKOREA 한국</span>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
