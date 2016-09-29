<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="Style.css"> 
<title>Bullhorn Support</title>
<jsp:include page="Bootstrap.jsp"></jsp:include>
</head>
<script>

function validate(form) {
    valid = true;
    var x = document.forms["Support"]["email"].value;
    if (x==null && $('#posttext').val().length==0){
        alert("You may not submit an empty post.");
        valid = false;
    }
    return valid;
}
</script>
<body>
<jsp:include page="navbar.jsp"></jsp:include>


<label>Issues? Write to us </label>


<form  action="SupportServlet"  method="post" onsubmit="return validate(this);">

Name:
<input type ="text" id="username" name ="username" maxlength =50>
<br>
<br>
Email:
<input type ="text" name ="email" id="email" maxlength=100>
<br>
<br>
 <textarea name= "posttext" id="posttext"
        class="form-control" rows="2"
       ></textarea>
 <input type = "Submit" value ="Submit">


</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>