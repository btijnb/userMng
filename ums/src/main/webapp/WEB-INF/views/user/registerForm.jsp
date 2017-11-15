<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="${pageContext.request.contextPath}/user/register"
		modelAttribute="registerForm" method="post">
		<c:out value="ユーザID" />
		<form:input path="userId" />
		<br>
		<c:out value="名前" />
		<form:input path="userName" />
		<br>
		<c:out value="生年月日" />
		<form:input path="birthDay" />
		<br>
		<c:out value="住所" />
		<form:input path="address" />
		<br>
		<c:out value="電話番号" />
		<form:input path="telNum" />
		<br>
		<c:out value="権限" />
		<form:checkboxes path="roles" items="${checkRoles }" />
		<br>
		<c:out value="パスワード" />
		<form:input path="password" />
		<br>
		<c:out value="パスワード確認" />
		<form:input path="confirmPassword" />
		<br>

		<form:button name="confirm">
			<c:out value="登録" />
		</form:button>

	</form:form>


</body>
</html>