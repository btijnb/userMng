<%@include file="/WEB-INF/views/common/header.jsp"%>

<center>
<input type="button" name="form" onclick="location.href='${pageContext.request.contextPath}/user/register'" value="登録"/> <!-- MEMO location.href絶対入れること -->
<input type="button" onclick="location.href='${pageContext.request.contextPath}/user/search2'" value="検索" />
</center>

<%@include file="/WEB-INF/views/common/footer.jsp"%>
