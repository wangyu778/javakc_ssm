<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>查看机构信息页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">

			<div class="ibox float-e-margins">
				<fieldset>
					<legend>基本信息</legend>
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-md-1 control-label text-center">机构名称:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.organizationName }" readonly>

							</div>
							<label class="col-md-1 control-label text-center">邮编:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.zipCode}" readonly>

							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">机构地址:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.organizationAddress}" readonly>

							</div>
							<label class="col-md-1 control-label text-center">网站</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.website}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">联系人</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.contacts}" readonly>
							</div>
							<label class="col-md-1 control-label text-center">机构级别</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.organizationLevel}" codeTp="organizationLevel"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">手机</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.phone}" readonly>
							</div>
							<label class="col-md-1 control-label text-center">行业类别</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.industryCategory}" codeTp="industryCategory"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">电话</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.telephone}" readonly>
							</div>
							<label class="col-md-1 control-label text-center">重要级别</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.importanceLevel}" codeTp="importanceLevel"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">国家</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.country}" codeTp="country"></javakc:show>"
									   readonly
								>
							</div>
							<label class="col-md-1 control-label text-center">单位等级</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.companyLevel}" codeTp="companyLevel"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">省份</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.province}" readonly>
							</div>
							<label class="col-md-1 control-label text-center">区域等级</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.areaLevel}" codeTp="areaLevel"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">城市</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.city}" readonly>
							</div>
						</div>
					</form>
				</fieldset>
				<fieldset>
					<legend>其他信息</legend>
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-md-1 control-label text-center">经办人:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.employeeName }" readonly>

							</div>
							<label class="col-md-1 control-label text-center">采购途径:</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.procurementApproach}" codeTp="procurementApproach"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">年费:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.organizationName }" readonly>

							</div>
							<label class="col-md-1 control-label text-center">分配情况:</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.distribution}" codeTp="distribution"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">电子资源经费:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.organizationName }" readonly>

							</div>
							<label class="col-md-1 control-label text-center">采购时间:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.zipCode}" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">备注信息:</label>
							<div class="col-md-5">
								<input class="form-control" type="text" placeholder="${entity.organizationName }" readonly>

							</div>
							<label class="col-md-1 control-label text-center">采购级别:</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.procurementLevel}" codeTp="procurementLevel"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">采购方式:</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.procurementMethod}" codeTp="procurementMethod"></javakc:show>"
									   readonly
								>
							</div>
							<label class="col-md-1 control-label text-center">机构类型:</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.organizationType}" codeTp="organizationType"></javakc:show>"
									   readonly
								>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-1 control-label text-center">跟进状态:</label>
							<div class="col-md-5">
								<input class="form-control"
									   type="text"
									   placeholder="<javakc:show value="${entity.goStatus}" codeTp="goStatus"></javakc:show>"
									   readonly
								>
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