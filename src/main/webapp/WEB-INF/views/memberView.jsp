<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디는 ${memId }이고 비밀번호는 ${memPw }입니다.<br><br>
	이름 : ${memName }<br><br>
	
	<form action="">
		이름 : <input type="text" name="mname"><br><br>
		<input type="submit" value="이름입력">
	</form>
</body>
</html>