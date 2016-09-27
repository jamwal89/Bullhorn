<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Home Page</title>
</head>
<body>

<form action = "Homeservlet" method="post">
<%  model.Bhuser user= (model.Bhuser) session.getAttribute("user");%>
<p> <%= user.getUseremail()%> </p>
<p> <%= user.getUserpassword() %> </p>
<textarea rows="4" cols="50"> </textarea>
<input type = "Submit" value ="Submit">

</form>

<p>Note that the form itself is not visible.</p>
<p>Also note that the default width of a text input field is 20 characters.</p>


<body>

</body>
</html>