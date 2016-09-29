<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<jsp:include page="Bootstrap.jsp"></jsp:include>
</head>
<body>
<form action="ProfileServlet" method="post" onclick="Update">



<h1>Welcome ${user.username }</h1>
Name:
<input type="text" id="name" name="name" value="<c:out value="${user.username}"/>"/>  
<br>
<br>
Motto:
<input type="text" id="motto" name="motto" value="${user.motto }"/> 
<br>
<br>
Email:
<input type="text" id="email" name="email" value="${user.useremail}"/> 
<br>
<br>
Password:
<input type="text" id="password" name="password" value="${user.userpassword}"/> 
<br>
<br>
<input type="submit" value="Update">
<input type="submit" value="Back">


</form>
</body>
</html>