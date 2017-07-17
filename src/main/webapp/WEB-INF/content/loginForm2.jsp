<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
<script src="js/webjss/jquery.easydropdown.js"></script>
<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/webjss/megamenu.js"></script>
<script type="text/javascript">
window.onload=function onLoginLoaded() {
if(isPostBack == "False") {
GetLastUser();
}
}
function GetLastUser() {
var id = "49BAC005-7D5B-4231-8CEA-16939BEACD67";//GUID标识符
var usr = GetCookie(id);
if (usr != null) {
document.getElementById('loginname').value = usr;
} 
else {
document.getElementById('loginname').value = "001";
}
GetPwdAndChk();
}
//点击登录时触发客户端事件
function SetPwdAndChk() {
//取用户名
var usr = document.getElementById('loginname').value;
alert(usr);
//将最后一个用户信息写入到Cookie
SetLastUser(usr);
//如果记住密码选项被选中
if(document.getElementById('chkRememberPwd').checked == true) {
//取密码值
var pwd = document.getElementById('password').value;
alert(pwd);
var expdate = new Date();
expdate.setTime(expdate.getTime() + 14 * (24 * 60 * 60 * 1000));
//将用户名和密码写入到Cookie
SetCookie(usr, pwd, expdate);
} 
else {
//如果没有选中记住密码,则立即过期
ResetCookie();
}
}
function SetLastUser(usr) {
var id = "49BAC005-7D5B-4231-8CEA-16939BEACD67";
var expdate = new Date();
//当前时间加上两周的时间
expdate.setTime(expdate.getTime() + 14 * (24 * 60 * 60 * 1000));
SetCookie(id, usr, expdate);
}
//用户名失去焦点时调用该方法
function GetPwdAndChk() {
var usr = document.getElementById('loginname').value;
var pwd = GetCookie(usr);
if (pwd != null) {
document.getElementById('chkRememberPwd').checked = true;
document.getElementById('password').value = pwd;
} 
else {
document.getElementById('chkRememberPwd').checked = false;
document.getElementById('password').value = "";
}
}
//取Cookie的值
function GetCookie(name) {
var arg = name + "=";
var alen = arg.length;
var clen = document.cookie.length;
var i = 0;
while (i < clen) {
var j = i + alen;
//alert(j);
if (document.cookie.substring(i, j) == arg) return getCookieVal(j);
i = document.cookie.indexOf(" ", i) + 1;
if (i == 0) break;
}
return null;
}
var isPostBack = ${IsPostBack};
function getCookieVal(offset) {
var endstr = document.cookie.indexOf(";", offset);
if (endstr == -1) endstr = document.cookie.length;
return unescape(document.cookie.substring(offset, endstr));
}
//写入到Cookie
function SetCookie(name, value, expires) {
var argv = SetCookie.arguments;
//本例中length = 3
var argc = SetCookie.arguments.length;
var expires = (argc > 2) ? argv[2] : null;
var path = (argc > 3) ? argv[3] : null;
var domain = (argc > 4) ? argv[4] : null;
var secure = (argc > 5) ? argv[5] : false;
document.cookie = name + "=" + escape(value) + ((expires == null) ? "" : ("; expires=" + expires.toGMTString())) + ((path == null) ? "" : ("; path=" + path)) + ((domain == null) ? "" : ("; domain=" + domain)) + ((secure == true) ? "; secure" : "");
}
function ResetCookie() {
var usr = document.getElementById('loginname').value;
var expdate = new Date();
SetCookie(usr, null, expdate);
}
</script>

</head>
<body>
<div class="header_top">
  <div class="container">
  	<div class="header_top-box">
     <div class="header-top-left">
		
   				    <div class="clearfix"></div>
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
			<li><a class="color10" href="#">Men Fashion</a></li>
			<li><a class="color3" href="404.html">Accessories</a></li>
			<li><a class="color7" href="#">Women's Fashion</a></li>
			<li><a class="color8" href="blog.html">Blog</a></li>
			<div class="clearfix"> </div>
		 </ul>
	  </div>
</div>
</div>
<div class="men">
	<div class="container">
	    <div class="register">
			   <div class="col-md-6 login-left">
			  	 <h3>新客户</h3>
				 <p>通过在我们的商店创建一个帐户，您将能够更快地浏览结帐过程，存储多个送货地址，查看和跟踪您的订单在您的帐户和更多</p>
				 <a class="acount-btn" href="registerForm">创建一个账户</a>
			   </div>
			   
			   <div class="col-md-6 login-right">
			  	<h3>用户登录</h3>
				<p>如果您有我们的帐户，请登录！</p>
		<font color="red">${requestScope.message }</font>	
		<form action="login" method="post">
         <div>
         	<span>登录名: </span>
             <input type="text" id="loginname" name="loginname" onblur="GetPwdAndChk()">
         </div>
         <div>
         	<span>密码: </span>
             <input type="password" id="password" name="password" ><a class="forgot" href="updatepasswordForm">忘记密码？</a>
         </div>
              <div>  <input type="checkbox" ID="chkRememberPwd"/>记住密码</div>
            <input type="submit" OnClick="SetPwdAndChk()" value="登录">
           
		</form>	
		<form action="login" method="post" id="form1">
			<div> 
			用户名:<input type="text" ID="loginname" name="loginname" onblur="GetPwdAndChk()">
			密码：<input type="password" ID="password" name="password">
			
			<input type="checkbox" ID="chkRememberPwd" />记住密码
		
			<input type="submit"  value="进入"/>
</div>
</form>
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
		<p ></p>
	</div>
</div>

<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>