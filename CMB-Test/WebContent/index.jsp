<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="js/jquery-3.0.0.js" type="application/javascript"></script>
  <script type="text/javascript">
	var info_model = "A 180";
	$.ajax({
		type:"post",
		url:"User/Check.do",
		datatype:"String",
		async:true,
		success:function(data){
			alert(data);
		}
	});
</script> 
</head>
<body>
<form method="post" action="User/Login.do">
	用户名<input name="username" type="text">
	密码<input name="password" type="password">
	车型<input name="info_model" type="text"/>
	<input type="submit" value="点击进入主页！"/>
</form>
</body>
</html>