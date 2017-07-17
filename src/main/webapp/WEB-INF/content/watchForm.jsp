<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到欢乐购商城！</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/jquery.countdown.css" />
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
<script src="js/responsiveslides.min.js"></script>
<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: false,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
</script>
<script src="js/jquery.countdown.js"></script>
<script src="js/script.js"></script>
</head>
<body>
<div class="header_top">
  <div class="container">
  	<div class="header_top-box">
     <div class="header-top-left">
			  <div class="cssmenu" style="margin-left: 0 px">
			  	   	<ul >
					<li><a href="loginForm">登录</a></li> 
					<li><a href="registerForm">注册</a></li>
				</ul>
   			   </div>
   			   <div class="box1">
   				       
   			   </div>
   				    <div class="clearfix"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html">Account我的宝贝</a></li> 
					<li><a href="wishlist.html">Wishlist</a></li> 
					<li><a href=" ">我的收藏</a></li> 
					<li><a href="register.jsp">我的订单</a></li>
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
			<li class="active grid"><a class="color2" href="main">主页</a></li>
			<li><a class="color4" href="nv">女装</a></li>				
			<li><a class="color10" href="watch">手表</a></li>
			<li><a class="color3" href="3C">数码产品</a></li>
			<div class="clearfix"> </div>
		 </ul>
	  </div>
</div>
</div>
<div class="index_slider">
	<div class="container">
	  <div class="callbacks_container">
	      <ul class="rslides" id="slider">
	        <li><img src="images/slider1.jpg" class="img-responsive" alt=""/></li>
	        <li><img src="images/2.jpg" class="img-responsive" alt=""/></li>
	        <li><img src="images/3.jpg" class="img-responsive" alt=""/></li>
	      </ul>
	  </div>
	</div> 
</div>
<div class="content_top">
	<div class="container">
		<div class="grid_1">
			<div class="col-md-3">
			 <div class="box2">
			 	<ul class="list1">
			 		<i class="lock"> </i>
			 		<li class="list1_right"><p>Upto 5% Reward on your shipping</p></li>
			 		<div class="clearfix"> </div>
			 	</ul>
			 </div>
			</div>
			<div class="col-md-3">
			 <div class="box3">
			 	<ul class="list1">
			 		<i class="clock1"> </i>
			 		<li class="list1_right"><p>Easy Extended Returned</p></li>
			 		<div class="clearfix"> </div>
			 	</ul>
			 </div>
			</div>
			<div class="col-md-3">
			 <div class="box4">
			 	<ul class="list1">
			 		<i class="vehicle"> </i>
			 		<li class="list1_right"><p>Free Shipping on order over 99 $</p></li>
			 		<div class="clearfix"> </div>
			 	</ul>
			 </div>
			</div>
			<div class="col-md-3">
			 <div class="box5">
			 	<ul class="list1">
			 		<i class="dollar"> </i>
			 		<li class="list1_right"><p>Delivery Schedule Spread Cheer Time</p></li>
			 		<div class="clearfix"> </div>
			 	</ul>
			 </div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<div class="column_center">
			<h1>最美的网上商店！ </h1>
			<h2>*****</h2>
		</div>
		<div class="sellers_grid">
			<ul class="sellers">
				<i class="star"> </i>
				<li class="sellers_desc"><h2>手表</h2></li>
				<div class="clearfix"> </div>
			</ul>
		</div>						
		<div class="grid_2">
			<c:forEach items="${requestScope.goods}" var="goods">
			<div class="col-md-3 span_6">
			  <div class="box_inner">
				<img src="images/${goods.goodPicture}" class="img-responsive" alt=""/>
				 <div class="sale-box"> </div>
				 <div class="desc">
				 	<h3>${goods.goodName }</h3>
				 	<h4>${goods.goodPrice }</h4>
				 	<ul class="list2">
				 	  <li class="list2_left"><span class="m_1"><a href="#" class="link">Add to Cart</a></span></li>
				 	  <li class="list2_right"><span class="m_2"><a href="#" class="link1">See More</a></span></li>
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
<div class="content_middle">
	<div class="container">
		<ul class="promote">
			<i class="promote_icon"> </i>
			<li class="promote_head"><h3>促销产品</h3></li>
		</ul>
		 <ul id="flexiselDemo3">
						<li><img src="images/n1.jpg"  class="img-responsive" /><div class="grid-flex"><h4>Contrary to popular </h4><p>589,90 $</p>
							<div class="m_3"><a href="#" class="link2">Add to Cart</a></div>
							<div class="ticket"> </div>
						</div></li>
						<li><img src="images/n2.jpg"  class="img-responsive" /><div class="grid-flex"><h4>Contrary to popular </h4><p>589,90 $</p>
							<div class="m_3"><a href="#" class="link2">Add to Cart</a></div>
							<div class="ticket"> </div>
						</div></li>
						<li><img src="images/n3.jpg"  class="img-responsive" /><div class="grid-flex"><h4>Contrary to popular </h4><p>589,90 $</p>
							<div class="m_3"><a href="#" class="link2">Add to Cart</a></div>
							<div class="ticket"> </div>
						</div></li>
						<li><img src="images/n4.jpg"  class="img-responsive" /><div class="grid-flex"><h4>Contrary to popular </h4><p>589,90 $</p>
							<div class="m_3"><a href="#" class="link2">Add to Cart</a></div>
							<div class="ticket"> </div>
						</div></li>
						<li><img src="images/n5.jpg"  class="img-responsive" /><div class="grid-flex"><h4>Contrary to popular </h4><p>589,90 $</p>
							<div class="m_3"><a href="#" class="link2">Add to Cart</a></div>
							<div class="ticket"> </div>
						</div></li>
				     </ul>
				    <script type="text/javascript">
					 $(window).load(function() {
						$("#flexiselDemo3").flexisel({
							visibleItems: 6,
							animationSpeed: 1000,
							autoPlay:true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
					    	responsiveBreakpoints: { 
					    		portrait: { 
					    			changePoint:480,
					    			visibleItems: 1
					    		}, 
					    		landscape: { 
					    			changePoint:640,
					    			visibleItems: 2
					    		},
					    		tablet: { 
					    			changePoint:768,
					    			visibleItems: 3
					    		}
					    	}
					    });
					    
					});
				   </script>
				   <script type="text/javascript" src="js/jquery.flexisel.js"></script>
	</div>
</div>
<div class="container">
   <div class="content_middle_bottom">
	  <div class="col-md-4">
		  <ul class="spinner">
			<i class="spinner_icon"> </i>
			<li class="spinner_head"><h3>But I must explain</h3></li>
			<div class="clearfix"> </div>
		  </ul>
		  <div class="timer_box">
			<div class="thumb"> </div>
			<div class="timer_grid">
 			<ul id="countdown">
			</ul>
				<ul class="navigation">
					<li>
						<p class="timeRefDays">DAYS</p>
					</li>
					<li>
						<p class="timeRefHours">HOURS</p>
					</li>
					<li>
						<p class="timeRefMinutes">MINUTES</p>
					</li>
					<li>
						<p class="timeRefSeconds">SECONDS</p>
					</li>
				</ul>
          </div>
          <div class="thumb_desc">
          	<h3> totam rem aperiam</h3>
          	<div class="price">
			   <span class="reducedfrom">$140.00</span>
			   <span class="actual">$120.00</span>
			</div>
		 </div>
		 <a href="#"><div class="m_3 deal"><div class="link3">Buy this deal</div></div></a>
		</div>
		</div>
		<div class="col-md-8">
		  <ul class="spinner">
			<i class="paperclip"> </i>
			<li class="spinner_head"><h3>From the Blog</h3></li>
			<div class="clearfix"> </div>
		  </ul>
		      <div class="a-top">
				 <div class="left-grid">
					<img src="images/t4.jpg" class="img-responsive" alt=""/>
				 </div>
				 <div class="right-grid">
					<h4><a href="#">Duis autem vel eum iriure dolor in hendrerit</a></h4>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat</p>
				 </div>
				 <div class="but">
				   <a class="arrow" href="#"> </a>
				 </div>
				 <div class="clearfix"></div>
			 </div>
			 <div class="a-top">
				 <div class="left-grid">
					<img src="images/t5.jpg" class="img-responsive" alt=""/>
				 </div>
				 <div class="right-grid">
					<h4><a href="#">Duis autem vel eum iriure dolor in hendrerit</a></h4>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat</p>
				 </div>
				 <div class="but">
				   <a class="arrow" href="#"> </a>
				 </div>
				 <div class="clearfix"></div>
			 </div>
			 <div class="a-top">
				 <div class="left-grid">
					<img src="images/t6.jpg" class="img-responsive" alt=""/>
				 </div>
				 <div class="right-grid">
					<h4><a href="#">Duis autem vel eum iriure dolor in hendrerit</a></h4>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat</p>
				 </div>
				 <div class="but">
				   <a class="arrow" href="#"> </a>
				 </div>
				 <div class="clearfix"></div>
			 </div>
			 <div class="a-top">
				 <div class="left-grid">
					<img src="images/t7.jpg" class="img-responsive" alt=""/>
				 </div>
				 <div class="right-grid">
					<h4><a href="#">Duis autem vel eum iriure dolor in hendrerit</a></h4>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat</p>
				 </div>
				 <div class="but">
				   <a class="arrow" href="#"> </a>
				 </div>
				 <div class="clearfix"></div>
			 </div>
		</div>
		<div class="clearfix"></div>
	</div>
    <div class="content_bottom">
    	<div class="col-md-3 span_1">
    	  <ul class="spinner">
			 <i class="box_icon"> </i>
			 <li class="spinner_head"><h3>mazim pla</h3></li>
			 <div class="clearfix"> </div>
		  </ul>
		  <img src="images/t8.jpg" class="img-responsive" alt=""/>
    	</div>
    	<div class="col-md-3 span_1">
    	  <ul class="spinner">
			 <i class="bubble"> </i>
			 <li class="spinner_head"><h3>About Us</h3></li>
			 <div class="clearfix"> </div>
		  </ul>
		  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat</p>
    	</div>
    	<div class="col-md-3 span_1">
    	  <ul class="spinner">
			 <i class="mail"> </i>
			 <li class="spinner_head"><h3>Contact Us</h3></li>
			 <div class="clearfix"> </div>
		  </ul>
		 <ul class="social">
			<li><a href=""> <i class="fb"> </i> </a></li>
		    <li><a href=""><i class="tw"> </i> </a></li>
			<li><a href=""><i class="google"> </i> </a></li>
			<li><a href=""><i class="linkedin"> </i> </a></li>
			<li><a href=""><i class="skype"> </i> </a></li>
		</ul>
    	</div>
    	<div class="col-md-3 span_1">
    	  <ul class="spinner">
			 <i class="mail"> </i>
			 <li class="spinner_head"><h3>Contact Us</h3></li>
			 <div class="clearfix"> </div>
		  </ul>
		  <p></p>
		  <p></p>
		  <p></p>
		  <p></p>
    	</div>
    	<div class="clearfix"> </div>
    </div>
</div>

<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>