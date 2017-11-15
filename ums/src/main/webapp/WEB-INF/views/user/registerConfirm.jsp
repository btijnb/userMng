<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>registerConfirm</title>
</head>
<body>
	<h1>確認</h1>

	<form:form action="${pageContext.request.contextPath}/user/register"
		modelAttribute="registerForm" method="post">

		<form:button>
			<c:out value="登録" />
		</form:button>
	</form:form>
	<a href="<c:url value="/user/register?redo"/>">
		<button type="button">やり直し</button>
	</a>
</body>
</html>