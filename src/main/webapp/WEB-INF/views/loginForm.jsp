<head>
<%@ page isELIgnored="false" %>
</head>
<html>
<head>
<title>Form Webpage</title>
</head>
<body>
   <form action="saveUser" modelAttribute="user" method="POST">
    Email Id<input path="email" type="text" name="Email"/> <br>
    Password<input path="password" type="text"/><br>
    <input type="submit" value="Submit"/>
    </form>
</body>
</html>