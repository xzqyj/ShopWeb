<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
</head>
<body>
	<form action="addGood" method="post">
	<table>
         <tr>
         	<td><label>商品编号: </label></td>
             <td><input type="text" id="goodid" name="goodid" ></td>
         </tr>
         <tr>
         	<td><label>商品名称: </label></td>
             <td><input type="text" id="goodname" name="goodname" ></td>
         </tr>
         <tr>
         	<td><label>商品价格: </label></td>
             <td><input type="text" id="goodprice" name="goodprice" ></td>
         </tr>
         <tr>
         	<td><label>商品图片: </label></td>
             <td><input type="file" accept="image/gif,image/jpeg,image/jpg,image/png,image/svg" id="goodpicture" name="goodpicture"></td>
             <td><input type="file" accept="image/gif,image/jpeg,image/jpg,image/png,image/svg" id="goodpicture1" name="goodpicture1" ></td>
             <td><input type="file" accept="image/gif,image/jpeg,image/jpg,image/png,image/svg" id="goodpicture2" name="goodpicture2" ></td>
         </tr>
         <tr>
         	<td><label>商品类别: </label></td>
             <td><input type="text" id="goodcategory" name="goodcategory" ></td>
         </tr>
         <tr>
         	<td><label>商品描述: </label></td>
             <td><input type="text" id="gooddescription" name="gooddescription" ></td>
         </tr>
         <tr>
         	<td><label>商品库存: </label></td>
             <td><input type="text" id="goodsavenum" name="goodsavenum" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="提交"></td>
         </tr>
     </table>
	
	</form>

</body>
</html>