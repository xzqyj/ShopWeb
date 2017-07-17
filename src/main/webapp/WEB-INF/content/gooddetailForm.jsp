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
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Raleway:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script src="js/jquery.easydropdown.js"></script>
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<link rel="stylesheet" href="css/etalage.css">
<script src="js/jquery.etalage.min.js"></script>
<script src="js/script3.js"></script>
<title>商品详情</title>
</head>
<body>
<div class="header_top">
  <div class="container">
  	<div class="header_top-box">
     <div class="header-top-left">
			  <div class="box">
			  	   	<select tabindex="4" class="dropdown drop">
					   <option value="" class="label" value="">Dollar :</option>
				       <option value="1">Dollar</option>
				       <option value="2">Euro</option>
					</select>
   			   </div>
   			   <div class="box1">
   				       <select tabindex="4" class="dropdown">
							<option value="" class="label" value="">English :</option>
							<option value="1">English</option>
							<option value="2">French</option>
							<option value="3">German</option>
					  </select>
   			   </div>
   				    <div class="clearfix"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html">Account</a></li> 
					<li><a href="wishlist.html">Wishlist</a></li>
					<li><a href="login.html">Log In</a></li> 
					<li><a href="register.html">Sign Up</a></li>
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
			<li><a class="color2" href="index.html">Home</a></li>
			<li><a class="color4" href="men.html">Special</a></li>			
			<li class="active grid"><a class="color10" href="#">Men Fashion</a></li>
			<li><a class="color8" href="blog.html">Blog</a></li>
			<div class="clearfix"> </div>
		 </ul>
	  </div>
</div>
</div>
<div class="men">
	<div class="container">
	  <div class="single_top">
	       <div class="col-md-9 single_right">
	   	       <div class="grid images_3_of_2">
						<ul id="etalage">
							<li>
								<a href="optionallink.html">
									<img class="etalage_thumb_image" src="images/${goods.get(0).goodPicture}" class="img-responsive" />
									<img class="etalage_source_image" src="images/${goods.get(0).goodPicture}" class="img-responsive" title="" />
								</a>
							</li>
						</ul>
						 <div class="clearfix"></div>		
				  </div> 
				  <div class="desc1 span_3_of_2">
				    <h1>${goods.get(0).goodName}</h1>
				    <p > <font size="6" color="red"> ${goods.get(0).goodPrice}</font></span> </p>
					 <span class="m_link"><a href="#"></a> </span>
					 <p class="m_text2">商品描述</p>
					 <div class="btn_form">
						<form action="addShopcart1?username=${sessionScope.user.userName}&goodname=${goods.get(0).goodName}&goodprice=${goods.get(0).goodPrice}
						&goodpicture=${goods.get(0).goodPicture}&goodid=${goods.get(0).goodId}" method="post">
						    <p class="m_text2">库存数量:${goods.get(0).goodSavenum}</p>
							
						    <p class="m_text2">购买数量:<input type="text" name="goodnum"/></a></p>
						    
						     <p class="m_text2"></p>
						    
							<input  type="submit" value="加入购物车" >
						</form>
					 </div>
				  </div>
				  <div class="clearfix"></div>	
       </div>
       <div class="col-md-3">
      	<!-- FlexSlider -->
              <section class="slider_flex">
				  <div class="flexslider">
					<ul class="slides">
						<li><img src="images/pic4.jpg" class="img-responsive" alt=""/></li>
						<li><img src="images/pic7.jpg" class="img-responsive" alt=""/></li>
						<li><img src="images/pic6.jpg" class="img-responsive" alt=""/></li>
						<li><img src="images/pic5.jpg" class="img-responsive" alt=""/></li>
				    </ul>
				  </div>
	          </section>
<!-- FlexSlider -->
      </div>
      <div class="clearfix"> </div>
     </div>
       <div class="toogle">
     	<h2>产品详情</h2>
     	<p class="m_text2"></p>
     </div>
     <div class="toogle">
     	<h2>More Information</h2>
     	<p class="m_text2">产品描述</p>
     </div>
     <h4 class="head_single">Related Products</h4>
     <div class="span_3">
	          	 <div class="col-sm-3 grid_1">
	          	    <a href="single.html">
				     <img src="" class="img-responsive" alt=""/>
				     <h3>parum clari</h3>
				   	 <p>Duis autem vel eum iriure</p>
				   	 <h4>Rs.399</h4>
			         </a>  
				  </div> 
				<div class="col-sm-3 grid_1">
	          	    <a href="single.html">
				     <img src="images/pic8.jpg" class="img-responsive" alt=""/>
				     <h3>parum clari</h3>
				   	 <p>Duis autem vel eum iriure</p>
				   	 <h4>Rs.399</h4>
			         </a>  
				  </div> 
				 <div class="col-sm-3 grid_1">
	          	    <a href="single.html">
				     <img src="images/pic1.jpg" class="img-responsive" alt=""/>
				     <h3>parum clari</h3>
				   	 <p>Duis autem vel eum iriure</p>
				   	 <h4>Rs.399</h4>
			         </a>  
				  </div> 
				  <div class="col-sm-3 grid_1">
	          	    <a href="single.html">
				     <img src="images/pic3.jpg" class="img-responsive" alt=""/>
				     <h3>   </h3>
				   	 <p>Duis autem vel eum iriure</p>
				   	 <h4>Rs.399</h4>
			         </a>  
				  </div> 
				  <div class="clearfix"></div>
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
<link href="css/flexslider.css" rel='stylesheet' type='text/css'/>
							  <script defer src="js/jquery.flexslider.js"></script>
							  <script type="text/javascript">
								
							  </script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>