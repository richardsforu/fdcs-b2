<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Product Form</h1> <hr/>

<jsp:include page="menu.jsp"/> <br/>

	<form:form action="saveProduct_v2" method="post" modelAttribute="product">

		<table align="center">

			<tr>
				<td>Product Id</td>
				<td> <form:input path="prodId" readonly="true"/> </td>
			</tr>

			<tr>
				<td>Product Name</td>
				<td> <form:input path="prodName"/> </td>
			</tr>

			<tr>
				<td>Price</td>
				<td> <form:input path="price"/> </td>
			</tr>

			<tr>
				<th colspan="2">
				<input type="submit" value="Update"> <input
					type="reset" value="Reset">
				</th>
			</tr>

		</table>
	</form:form>


</body>
</html>