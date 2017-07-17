<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Gifty Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Raleway:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<!-- dropdown -->
<script src="js/jquery.easydropdown.js"></script>
<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>

<title>购物车页面</title>
</head>
<body>
<div class="header_top">
  <div class="container">
  	<div class="header_top-box">
     <div class="header-top-left">
			  <div class="box">
			  
   			   </div>
   			   <div class="box1">
   				       
   			   </div>
   				    <div class="clearfix"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html">我的宝贝</a></li> 
					<li><a href="wishlist.html">我的收藏</a></li>
					<li><a href="login.html">我的订单</a></li> 
					
				</ul>
			</div>
			<div class="clearfix"></div>
    </div>
  </div>
</div>
<div class="header_bottom">
	<div class="container">
	 <div class="header_bottom-box">
		<div class="header_bottom_left">
			<div class="logo">
				<a href="index.html"><img src="images/logo.png" alt=""/></a>
			</div>
			<ul class="clock">
				<i class="clock_icon"> </i>
				<li class="clock_desc">Justo 24/h</li>
			</ul>
			<div class="clearfix"> </div>
		</div>
		<div class="header_bottom_right">
			<div class="search">
			  <input type="text" value="Your email address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your email address';}">
			  <input type="submit" value="">
	  		</div>
	  		<ul class="bag">
	  			<a href="#"><i class="bag_left"> </i></a>
	  			<a href="#"><li class="bag_right"><p>205.00 $</p> </li></a>
	  			<div class="clearfix"> </div>
	  		</ul>
		</div>
		<div class="clearfix"> </div>
	</div>
 </div>
</div>
<div class="menu">
	<div class="container">
		<div class="menu_box">
	     <ul class="megamenu skyblue">
			<li class="active grid"><a class="color2" href="index.html">主页</a></li>
			<li><a class="color4" href="nv">女装</a></li>				
			<li><a class="color10" href="watch">手表</a></li>
			<li><a class="color3" href="3C">数码产品</a></li>
			
			<div class="clearfix"> </div>
		 </ul>
	  </div>
</div>
</div>
<div class="men">
	<div class="container">
	    <div class="grid_2">
			<c:forEach items="${requestScope.shopcarts}" var="shopcarts">
			<div class="col-md-3 span_6">
			  <div class="box_inner">
				<img src="images/${shopcarts.goodPicture}" class="img-responsive" alt=""/>
				 <div class="sale-box"> </div>
				 <div class="desc">
				 	<h3>商品名称：${shopcarts.goodName }</h3>
				 	<h4>商品价格：${shopcarts.goodPrice }</h4>
				 	<h4><a href="" ></a>商品数量：${shopcarts.goodNum}</h4>
				 	<ul class="list2">
				 	  <li class="list2_right"><span class="m_2"><a href="deleteShopcart?goodname=${shopcarts.goodName}" class="link1">删除商品</a></span></li>
				 	 <li class="list2_left"><span class="m_1"><a href="addOrder?username=${shopcarts.userName}&goodname=${shopcarts.goodName }&goodid=${shopcarts.goodId}
				 	 &goodpicture=${shopcarts.goodPicture}&goodnum=${shopcarts.goodNum}&goodprice=${shopcarts.goodPrice}" class="link">立即购买</a></span></li>
				 	  <div class="clearfix"> </div>
				 	</ul>
				 
				 	<div class="heart"> </div>
				 </div>
			   </div>
			</div>
			</c:forEach>
			<div class="clearfix"> </div>
		</div>
	 </div>
</div>
<div class="footer">
	<div class="container">
		<img src="images/pay.png" class="img-responsive" alt=""/>
		<ul class="footer_nav">
		  <li><a href="#">Home</a></li>
		  <li><a href="#">Blog</a></li>
		  <li><a href="#">Shop</a></li>
		  <li><a href="#">Media</a></li>
		  <li><a href="#">Features</a></li>
		  <li><a href="#">About Us</a></li>
		  <li><a href="contact.html">Contact Us</a></li>
		</ul>
		<p class="copy">Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
	</div>
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>