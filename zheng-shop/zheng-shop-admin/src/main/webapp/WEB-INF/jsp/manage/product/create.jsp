<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>新增商品</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>
</head>
<body>
<div id="main">
	<form id="createForm" method="post">
		<div class="form-group">
			<label for="name">品牌名称</label>
			<input id="name" type="text" class="form-control" name="name" maxlength="20">
		</div>
		<div class="form-group">
			<label for="logo">logo</label>
			<input id="logo" type="text" class="form-control" name="logo">
		</div>
		<div class="form-group">
			<label for="url">网址</label>
			<input id="url" type="text" class="form-control" name="url">
		</div>
		<div class="form-group">
			<label for="introduction">介绍</label>
			<input id="introduction" type="text" class="form-control" name="introduction">
		</div>
		<div class="form-group">
			<label for="orderList">排序</label>
			<input id="orderList" type="text" class="form-control" name="orderList">
		</div>
		<div class="form-group text-right dialog-buttons">
			<a class="waves-effect waves-button" href="javascript:;" onclick="createSubmit();">保存</a>
			<a class="waves-effect waves-button" href="javascript:;" onclick="createDialog.close();">取消</a>
		</div>
	</form>
</div>
<jsp:include page="/resources/inc/footer.jsp" flush="true"/>
<script>

</script>
</body>
</html>