<%@include file="/WEB-INF/views/common/header.jsp"%>

<center>

	<form action="${pageContext.request.contextPath}/user/register" method="get">
		<input type="submit" name="form" value="登録"> <!-- MEMO 或いはこうやってもいい　<button name="form">登録</button> <input type=button こんなのは存在しない-->
	</form>

	<input type="button" onclick="location.href='${pageContext.request.contextPath}/user/search2'" value="検索" /> <!-- MEMO location.href絶対入れること -->

</center>

<%@include file="/WEB-INF/views/common/footer.jsp"%>
