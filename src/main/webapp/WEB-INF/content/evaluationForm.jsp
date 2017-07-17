<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单评价</title>
</head>
<body>
<form action="addRemark?id=${orders.get(0).id}" method="post">
	<table>
        
         	<div>
         	<label>订单评价 </label>
         	<label >订单编号：${orders.get(0).id}</label>
         	</div>
         
         <div><textarea rows="3" cols="20" name="goodremark"> </textarea></div>
             <td><input type="submit" value="提交"></td>
        
     </table>
	
	</form>
</body>
</html>