<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- css -->
<link rel="stylesheet" href="../css/bootstrap.min.css">
<!-- js -->
<script src="../js/bootstrap.min.js"></script>
<script src="../js/jquery-3.4.1.min.js"></script>
<title>상품 상세 정보</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
		Product product = dao.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="c:/upload/<%=product.getFilename()%>" style="width: 100%" />
			</div>
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%></p>
				<p><b>상품 코드 : </b><span class="badge badge-danger"><%=product.getProductId()%></span></p>
				<p><b>제조사</b> : <%=product.getManufacturer()%></p>
				<p><b>분류</b> : <%=product.getCategory()%></p>
				<p><b>재고 수</b> : <%=product.getUnitsInStock()%></p>
				<h4><%=product.getUnitPrice()%>원</h4>
				<p><a href="#" class="btn btn-info"> 상품 주문 &raquo;</a>
				<a href="products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
				</p>
			</div>
		</div>
		<hr>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>