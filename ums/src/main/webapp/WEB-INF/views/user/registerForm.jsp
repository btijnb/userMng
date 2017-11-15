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
		<form:label path="userId">
			<c:out value="ユーザID" />
		</form:label> :
		<form:input path="userId" />
		<br>
		<form:label path="userName">
			<c:out value="名前" />
		</form:label> :
		<form:input path="userName" />
		<br>
		<form:label path="birthDay">
			<c:out value="生年月日" />
		</form:label> :
		<form:input path="birthDay" />
		<br>
		<form:label path="address">
			<c:out value="住所" />
		</form:label> :
		<form:input path="address" />
		<br>
		<form:label path="telNum">
			<c:out value="電話番号" />
		</form:label> :
		<form:input path="telNum" />
		<br>
		<form:label path="roles">
			<c:out value="権限" />
		</form:label> :
		<form:checkboxes path="roles" items="${checkRoles }" />
		<br>
		<form:label path="password">
			<c:out value="パスワード" />
		</form:label> :
		<form:input path="password" />
		<br>
		<form:label path="confirmPassword">
			<c:out value="パスワード" />
		</form:label> :
		<form:input path="confirmPassword" />
		<br>
		<form:button name="confirm">
			<c:out value="登録" />
		</form:button>

	</form:form>


</body>
</html>