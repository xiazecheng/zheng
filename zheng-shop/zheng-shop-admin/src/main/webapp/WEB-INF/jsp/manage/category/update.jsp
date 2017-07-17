<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div id="updateDialog" class="crudDialog">
	<form id="updateForm" method="post">
		<div class="form-group">
			<label for="name">名称</label>
			<input id="name" type="text" class="form-control" name="name" maxlength="20" value="${shopProductCategory.name}">
		</div>
		<div class="form-group">
			<select id="parentId" name="parentId">
				<option value="-1">顶级分类</option>
				<c:forEach var="productCategory" items="${productCategories}">
					<c:set value="${fn:split(productCategory.path, ',') }" var="array" />
					<option value="${productCategory.id}">
						<c:forEach var="item" items="${array}">
							-
						</c:forEach>
					${productCategory.name}
					</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="orderList">排序</label>
			<input id="orderList" type="text" class="form-control" name="orderList" value="${shopProductCategory.orderList}">
		</div>
		<div class="form-group">
			<label for="metaKeywords">关键字</label>
			<input id="metaKeywords" type="text" class="form-control" name="metaKeywords" maxlength="20" value="${shopProductCategory.metaKeywords}">
		</div>
		<div class="form-group">
			<label for="metaDescription">页面描述</label>
			<input id="metaDescription" type="text" class="form-control" name="metaDescription" maxlength="20" value="${shopProductCategory.metaDescription}">
		</div>
		<div class="form-group text-right dialog-buttons">
			<a class="waves-effect waves-button" href="javascript:;" onclick="updateSubmit();">保存</a>
			<a class="waves-effect waves-button" href="javascript:;" onclick="updateDialog.close();">取消</a>
		</div>
	</form>
</div>
<script>
function updateSubmit() {
    $.ajax({
        type: 'post',
        url: '${basePath}/manage/category/update/${shopProductCategory.id}',
        data: $('#updateForm').serialize(),
        beforeSend: function() {
            if ($('#name').val() == '') {
                $('#name').focus();
                return false;
            }
        },
        success: function(result) {
			if (result.code != 1) {
				if (result.data instanceof Array) {
					$.each(result.data, function(index, value) {
						$.confirm({
							theme: 'dark',
							animation: 'rotateX',
							closeAnimation: 'rotateX',
							title: false,
							content: value.errorMsg,
							buttons: {
								confirm: {
									text: '确认',
									btnClass: 'waves-effect waves-button waves-light'
								}
							}
						});
					});
				} else {
						$.confirm({
							theme: 'dark',
							animation: 'rotateX',
							closeAnimation: 'rotateX',
							title: false,
							content: result.data.errorMsg,
							buttons: {
								confirm: {
									text: '确认',
									btnClass: 'waves-effect waves-button waves-light'
								}
							}
						});
				}
			} else {
				updateDialog.close();
				$table.bootstrapTable('refresh');
			}
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
			$.confirm({
				theme: 'dark',
				animation: 'rotateX',
				closeAnimation: 'rotateX',
				title: false,
				content: textStatus,
				buttons: {
					confirm: {
						text: '确认',
						btnClass: 'waves-effect waves-button waves-light'
					}
				}
			});
        }
    });
}
$(function(){
    initParentId();
})

function initParentId(){
    var parentId = '${shopProductCategory.parentId}';
	if(parentId == ""){
	    $("#parentId").val(-1);
	}else{
        $("#parentId").val(parentId);
	}
}
</script>