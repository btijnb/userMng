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

		<div>
			<form:label path="userId">
				<c:out value="ユーザID" />
			</form:label>
			: ${f:h(registerForm.userId)}
		</div>

		<div>
			<form:label path="userName">
				<c:out value="名前" />
			</form:label>
			: ${f:h(registerForm.userName)}
		</div>

		<div>
			<form:label path="birthDay">
				<c:out value="生年月日" />
			</form:label>
			: ${f:h(registerForm.birthDay)}
		</div>

		<div>
			<form:label path="address">
				<c:out value="住所" />
			</form:label>
			: ${f:h(registerForm.address)}
		</div>

		<div>
			<form:label path="telNum">
				<c:out value="電話番号" />
			</form:label>
			: ${f:h(registerForm.telNum)}
		</div>

		<div>
			<form:label path="roles">
				<c:out value="権限" />
			</form:label>
			: ${fn:join(registerForm.roles, ",")}
		</div>

		<form:button>
			<c:out value="登録" />
		</form:button>
	</form:form>
	<a href="<c:url value="/user/register?redo"/>">
		<button type="button">やり直し</button>
	</a>
</body>
</html>