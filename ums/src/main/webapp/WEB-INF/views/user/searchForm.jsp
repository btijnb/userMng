<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<form action="${pageContext.request.contextPath}/user/search" method="get"> <!-- TODO 後でPOSTに修正 -->
 		ユーザID：<input type="text" name="user_id"/><br/>
 		名前：<input type="text" name="name"/><br/>
 		生年月日：<input type="text" name="birth"/><br/>
 		住所：<input type="text" name="address"/><br/>
 		電話番号：<input type="text" name="pn"/><br/>
 		権限：<input type="text" name="status"/><br/>
 		状態：<input type="text" name="updated"/><br/>
 		
		<input type="submit" value="検索" />
	</form>
</div>

</body>
</html>