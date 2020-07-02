<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>查看联系人信息页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">

			<div class="ibox float-e-margins">
				<fieldset>
					<legend>联系人信息</legend>
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-md-2 control-label text-center">机构名称:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.institution }" readonly>

							</div>

						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">姓名:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.name}" readonly>

							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">性别:</label>
							<div class="col-md-10">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.sex}" codeTp="sex"></javakc:show>"
									   readonly
								>
							</div>

						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">职务:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.duty}" readonly>
							</div>

						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">手机:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.mobilePhone}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">电话:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.phone}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">传真:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.fax}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">邮箱:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.mail}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">QQ:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.qq}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">微信:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.wechat}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">地址:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.address}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">重要等级:</label>
							<div class="col-md-10">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.importantGrade}" codeTp="importantGrade"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">跟进状态:</label>
							<div class="col-md-10">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.followStatus}" codeTp="followStatus"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">经办人:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.agent}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">是否认可:</label>
							<div class="col-md-10">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.ifAccept}" codeTp="ifAccept"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">认可理由:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.acceptReason}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">信息来源:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.origin}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label text-center">备注:</label>
							<div class="col-md-10">
								<input class="form-control" type="text" placeholder="${entity.rank}" readonly>
							</div>
						</div>

					</form>
				</fieldset>
				<fieldset>
					<div>
						<div class="col-sm-12" style="text-align:center"><input type="button" value="关闭" class="btn btn-success" onclick="javascript:history.back();"/></div>
					</div>
				</fieldset>
			</div>
		</div>
	</body>
<%--	<script type="text/javascript" src="${path }/view/system/user/js/user.js"></script>--%>
</html>