<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="Bootstrap.jsp"></jsp:include>
<script>
function validateForm() {
    var x = document.forms["SignUp"]["newusername"].value;
    var y = document.forms["SignUp"]["newpassword"].value;
    var z = document.forms["SignUp"]["newemail"].value;
    var z = document.forms["SignUp"]["newmotto"].value;
   
    if (x == null || x == "") {
        alert("Name must be filled out");
        return false;
    }
  if (y == null || y == "") {
        alert("Email must be filled out");
        return false;
    }
  if (z == null || z == "") {
        alert("Motto must be filled out");
        return false;
    }
  if (a == null || a == "") {
        alert("password must be filled out");
        return false;
    }

}
</script>


<body>
<form name="SignUp" action= "NewuserServlet" method="post" onsubmit="return validateForm(this);">
<h1> Welcome to BullHorn</h1>
<h2> We would love to have you in our community as soon as you tell us about yourself</h2>
<br>
<br>
Your name:
<input type="text" id="newusername" name="newusername"/>
<br>
<br>
Your Secret code::
<input type="text" id="newpassword" name="newusername"/>
<br>
<br>
Where to reach you:
<input type="text" id="newemail" name="newemail"/>
<br>
<br>
Whats the motto of your life:
<input type ="text" id="newmotto" name="newmotto"/>
<br>
<br>
<p>Hold on, We are Signing you up </p>
<input type="submit" value="Signup"/>
</form>
</body>
</html>