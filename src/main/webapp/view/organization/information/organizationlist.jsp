<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>机构信息展示列表页面</title>
	<%@ include file="../../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
	<div class="ibox float-e-margins">
		<form id="searchForm" action="" method="post">
			<div class="col-sm-12">
				<!-- ------------按钮组 start------------ -->
				<div class="alert alert-success" role="alert">机构详细信息</div>
				<div class="col-sm-8">
					<div class="btn-group" role="group">
<%--						<shiro:hasPermission name="user:create">--%>
<%--							<button type="button" class="btn btn-primary" data-toggle="modal" id="add" name="user/add.do">--%>
<%--								<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加--%>
<%--							</button>--%>
<%--						</shiro:hasPermission>--%>
<%--						<shiro:hasPermission name="user:update">--%>
<%--							<button type="button" class="btn btn-success" data-toggle="modal" id="update" name="user/view.do">--%>
<%--								<i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改--%>
<%--							</button>--%>
<%--						</shiro:hasPermission>--%>
<%--						<shiro:hasPermission name="user:delete">--%>
<%--							<button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="user/delete.do">--%>
<%--								<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除--%>
<%--							</button>--%>
<%--						</shiro:hasPermission>--%>
                        <button type="button" class="btn btn-success" data-toggle="modal" onclick="goto();">
                            新增机构
                        </button>
                        <button type="button" class="btn btn-primary" data-toggle="modal" id="add" name="contact/queryContact.do">
                            联系人
                        </button>
					</div>
				</div>
				<div class="col-sm-4">
					<input class="form-control" id="search" name="userName" value="" type="text" placeholder="查询内容 回车搜索"/>
				</div>
				<!-- ------------按钮组 end------------ -->
				<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
				<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
				<table class="table table-striped table-bordered table-hover table-condensed">
					<thead>
					<tr>
						<th><input type="checkbox" id="checkall"/></th>
						<th>编号</th>
						<th>机构名称</th>
						<th>机构级别</th>
						<th>省份/市</th>
						<th>经办人</th>
						<th>联系人</th>
						<th>审核状态</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="u" items="${page.list }" varStatus="v">
						<tr>
							<td><input type="checkbox" name="ids" value="${u.id}"/></td>
							<td>${u.id}</td>
							<td>${u.organizationName}</td>

							<td><javakc:show value="${u.organizationLevel}" codeTp="organizationLevel"></javakc:show></td>
							<td>${u.organizationProvince}</td>
							<td>${u.employeeName}</td>
							<td>${u.contactName}</td>

							<td><javakc:show value="${u.auditStatus}" codeTp="auditStatus"></javakc:show></td>

							<td>
								<a style="text-decoration:none" class="col-sm-4" href="javascript:editor('${u.id}');" title="编辑">编辑</a>
								<a style="text-decoration:none" class="col-sm-4" href="javascript:deletemm('${u.id}');" title="删除">删除</a>
								<a style="text-decoration:none" class="col-sm-4" href="javascript:check('${u.id}');" title="查看">查看</a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<div class="page">${page}</div>
			</div>
		</form>
	</div>
</div>
<script type="text/javascript">
	function check(id) {
		window.location.href = '<%=path%>organization/checkOrganization/' + id + '.do'
	}
	function editor(id) {
		window.location.href = '<%=path%>organization/editorOrganization/' + id + '.do'
	}
	function deletemm(id) {
		window.location.href = '<%=path%>organization/deleteOrganization/' + id + '.do'
	}
	function goto() {
		window.location.href = '<%=path%>view/organization/information/createorganization.jsp'
	}
</script>
</body>
</html>