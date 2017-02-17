

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<table>
<thead>
<tr><th>products</th>
<th>Category</th>
<th>Actions</th></tr>
</thead>
<tbody>
<c:forEach items="${products}" var="product">
<tr>
<td>${product.productName}</td>
<td>${product.productCategory}</td>
<td><a href="/Filter/delete-product.do?product=${product.productName}
&category=${product.productCategory}">Delete Product</a></td> 
<td><a href="/Filter/update-product.do?product=${product.productName}
&category=${product.productCategory}">Update Product</a></td> 
</tr>
</c:forEach>
</tbody>
</table>

<a href="/Filter/AddProductServlet.do">Add new Product</a>
</body>
</html>