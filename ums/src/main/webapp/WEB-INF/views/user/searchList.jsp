<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>掲示板リスト</title>
</head>
<body>
<div align="center">
	<h2>掲示板リスト</h2>
	<hr width="400" color="red"/>
	
	<table border="1" cellpadding="0" cellspacing="0" width="500">
		<tr>
			<td>ユーザーID</td>     <!-- パスワードは出力しない -->
			<td>名前</td>
			<td>生年月日</td>
			<td>住所</td>
			<td>電話番号</td>
			<td>権限</td>
			<td>状態</td>
		</tr>

		  
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.user_id}</td>
				<td>${list.name}</td>
				<td>${list.birth}</td>
				<td>${list.address}</td>
				<td>${list.pn}</td>
				<td>${list.status}</td>
				<td>${list.updated}</td>				
			</tr>
		</c:forEach>

	</table>	

</div>
</body>
</html>