<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>凌安信息化管理系统</title>
	<link rel="shortcut icon" type="image/x-icon" href="img/logo.ico" media="screen" />
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login/login.css" rel="stylesheet">
  </head>
  <body >
    <div class='loginWindow'>
    	<div class='loginPanel'>
    		<div class="userBox">
			       <form class="bs-example bs-example-form" role="form">
						<div class="input-group">
							<input type="text" class="form-control foricon" placeholder="用户名">
							<span class="input-group-addon glyphicon glyphicon-user"></span>
						</div>
						<br>
						<div class="input-group">
							<input type="text" class="form-control foricon" placeholder="密码">
							<span class="input-group-addon glyphicon glyphicon-lock"></span>
						</div>
					</form>
					<button id="test_login" type="button" class="btn btn-primary btn-block loginBtn" aria-label="Center Align">登录</button>
			     
    		</div>
			
    	</div>
    </div>
   
    <script data-main="js/login/login" src="js/require.js"></script>
</body>
</html>