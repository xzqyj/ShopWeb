<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改、找回密码</title>
</head>
<body>
	<form action="updatepassword" method="post">
	<table>
         <tr>
         	<td><label>用户名: </label></td>
             <td><input type="text" id="username" name="username" ></td>
         </tr>
         <tr>
         	<td><label>确认密码:</label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="修改"></td>
         </tr>
     </table>
	
	</form>
<form action="findPassword" method="post">
	<table>
         <tr>
         	<td><label>用户名: </label></td>
             <td><input type="text" id="username" name="username" ></td>
         </tr>
         <tr>
         	<td><label>您的密码为:${users.userPassword}  </label></td>
             
         </tr>
         <tr>
             <td><input type="submit" value="找回密码"></td>
         </tr>
     </table>
	
	</form>


</body>
</html>