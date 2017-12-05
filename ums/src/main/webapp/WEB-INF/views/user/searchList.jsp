<%@include file="/WEB-INF/views/common/header.jsp"%>

<div align="center">

<!--  TODO ページめくるhyperlink -->
<!--  TODO 現在ページ位置表示 -->

	<table border="1" cellpadding="0" cellspacing="0" width="500">
		<tr>
			<td>選択</td>
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
				<td><form action="#" method="get"></form><input type="radio" name="choose" value="${list.user_id2}"></form></td>
				<td>${list.user_id2}</td>
				<td>${list.name2}</td>
				<td>${list.birth2}</td>
				<td>${list.address2}</td>
				<td>${list.pn2}</td>
				<td>${list.status2}</td>
				<td>${list.updated2}</td>				
			</tr>
		</c:forEach>
	</table>	<br>
	
<form action="${pageContext.request.contextPath}/user/update" method="get">
	<input type="submit" name="formUserId" value="更新" /><!-- FIXME form&userId=xyzに -->
</form>

<form action="${pageContext.request.contextPath}/user/delete" method="get">
	<input type="submit" name="formUserId" value="削除" /><!-- FIXME form&userId=xyzに -->
</form>

</div>

<%@include file="/WEB-INF/views/common/footer.jsp"%>