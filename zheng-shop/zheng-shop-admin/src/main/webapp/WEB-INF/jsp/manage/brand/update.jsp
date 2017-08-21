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
			<label for="name">品牌名称</label>
			<input id="name" type="text" class="form-control" name="name" value="${shopBrand.name}" maxlength="20">
		</div>
		<div class="form-group">
			<label for="logo">logo</label>
			<input id="logo" type="text" class="form-control" name="logo" value="${shopBrand.logo}">
		</div>
		<div class="form-group">
			<label for="url">网址</label>
			<input id="url" type="text" class="form-control" name="url" value="${shopBrand.url}">
		</div>
		<div class="form-group">
			<label for="introduction">介绍</label>
			<input id="introduction" type="text" class="form-control" name="introduction" value="${shopBrand.introduction}">
		</div>
		<div class="form-group">
			<label for="orderList">排序</label>
			<input id="orderList" type="text" class="form-control" name="orderList" value="${shopBrand.orderList}">
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
            url: '${basePath}/manage/brand/update/${shopBrand.id}',
            data: $('#updateForm').serialize(),
            beforeSend: function() {
                if ($('#name').val() == '') {
                    $('#name').focus();
                    return false;
                }
                if ($('#url').val() == -1) {
                    $('#url').focus();
                    return false;
                }
                if ($('#orderList').val() == -1) {
                    $('#orderList').focus();
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
</script>