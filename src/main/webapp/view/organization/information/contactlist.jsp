<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>联系人信息展示列表页面</title>
	<%@ include file="../../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
	<div class="ibox float-e-margins">
		<form id="searchForm" action="" method="post">
			<div class="col-sm-12">
				<!-- ------------按钮组 start------------ -->
				<div class="alert alert-success" role="alert">联系人详细信息</div>
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
                            新增联系人
                        </button>
                        <button type="button" class="btn btn-primary" data-toggle="modal" id="add" name="organization/queryOrganization.do">
                            机构信息
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
						<th>姓名</th>
						<th>性别</th>
						<th>职务</th>
						<th>手机</th>
						<th>办公电话</th>
						<th>重要等级</th>
						<th>跟进状态</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach var="u" items="${page.list }" varStatus="v">
						<tr>
							<td><input type="checkbox" name="ids" value="${u.id}"/></td>
							<td>${u.id}</td>
							<td>${u.institution}</td>
							<td>${u.name}</td>
							<td><javakc:show value="${u.sex}" codeTp="sex"></javakc:show></td>
							<td>${u.duty}</td>
							<td>${u.mobilePhone}</td>
							<td>${u.phone}</td>
							<td><javakc:show value="${u.importantGrade}" codeTp="importantGrade"></javakc:show></td>

							<td><javakc:show value="${u.followStatus}" codeTp="followStatus"></javakc:show></td>

							<td>
								<a style="text-decoration:none" class="col-sm-4" href="javascript:editor('${u.id}');" title="编辑">编辑</a>
								<a style="text-decoration:none" class="col-sm-4" href="javascript:deletebyid('${u.id}');" title="删除">删除</a>
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
		window.location.href = '<%=path%>contact/checkContact/' + id + '.do'
	}
	function editor(id) {
		window.location.href = '<%=path%>contact/editorContact/' + id + '.do'
	}
	function goto() {
		window.location.href = '<%=path%>view/organization/information/createcontact.jsp'
	}
	function deletebyid(id) {
		window.location.href = '<%=path%>contact/deleteContact/' + id + '.do'
	}
</script>
</body>
</html>