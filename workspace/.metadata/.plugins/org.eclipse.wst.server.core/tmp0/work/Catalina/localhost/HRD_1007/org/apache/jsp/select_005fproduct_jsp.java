/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2019-11-04 06:35:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.prism.Presentable;
import java.sql.*;

public final class select_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.sun.prism.Presentable");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("table{\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\t}\r\n");
      out.write("tr, td{\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("a{ color: white; text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table height=\"100%\" width=\"100%\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav.jsp", out, false);
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td bgcolor=\"gray\" valign=\"top\">\r\n");
      out.write("<table width=\"100%\" align=\"center\">\r\n");
      out.write("<tr >\r\n");
      out.write("<th>no</th><th>상품코드</th><th>상품명</th><th>가격</th><th>상세정보</th><th>분류</th><th>제조사</th><th>재고수</th><th>상태</th>\r\n");
      out.write("</tr>\r\n");

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String user = "yangjung";
String password = "1234";
String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";

Class.forName("oracle.jdbc.driver.OracleDriver");
conn = DriverManager.getConnection(url, user, password);
request.setCharacterEncoding("utf-8");
try{
	String sql = "select * from productTbl";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	int a = 0;
	while(rs.next()){
		a++;
		String b = rs.getString(1);
		String c = rs.getString(3);
		String d = rs.getString(2);
		String e = rs.getString(4);
		String f = rs.getString(5);
		String g = rs.getString(6);
		String h = rs.getString(7);
		String i = rs.getString(8);
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(a );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(b );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(d );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(c );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(e );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(f );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(g );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(h );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\">");
      out.print(i );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

	}
			
}catch (SQLException e){
	out.println("테이블 호출 실패"+e.getMessage());
}finally{
	if(rs!=null) rs.close();
	if(pstmt!=null) pstmt.close();
	if(conn!=null) conn.close();
}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
