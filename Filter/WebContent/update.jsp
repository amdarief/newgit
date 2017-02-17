<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
	<form action="/Filter/update-product.do" method="POST">
		<fieldset>
			<label>Description</label> <input name="product" type="text"/> <br/>
		</fieldset>
		<fieldset>
			<label>Category</label> <input name="category" type="text"/> <br/>
		</fieldset>
		<input type="hidden" name="index" value=<%= (String) request.getAttribute("index") %>/>
		<input name="update" type="submit" value="Update"/>
	</form>
</body>
</html>