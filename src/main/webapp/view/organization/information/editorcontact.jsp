<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>编辑联系人信息页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">

			<div class="ibox float-e-margins">
				<fieldset>
					<legend>联系人信息</legend>
					<form class="form-horizontal" action="${path }/contact/update.do" method="post" enctype="multipart/form-data" role="form">
						<div class="form-group">
							<input type="hidden" name="id" value="${entity.id}">
							<label class="col-md-2 control-label" for="institution">机构名称:</label>
							<div class="col-md-10">
								<input class="form-control" id="institution" name="institution"
									   value="${entity.institution}" type="text" placeholder="${entity.institution }" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="name">姓名:</label>
							<div class="col-md-10">
								<input class="form-control" id="name" name="name"
									   value="${entity.name}" type="text" placeholder="请输入姓名" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="sex">性别:</label>
							<div class="col-md-10">
								<javakc:select codeTp="sex" id="sex" name="sex"
											   value="${entity.sex}" def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="duty">职务:</label>
							<div class="col-md-10">
								<input class="form-control" id="duty" name="duty"
									   value="${entity.duty}" type="text" placeholder="请输入职务" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="mobilePhone">手机:</label>
							<div class="col-md-10">
								<input class="form-control" id="mobilePhone" name="mobilePhone"
									   value="${entity.mobilePhone}" type="text" placeholder="请输入手机号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="phone">电话:</label>
							<div class="col-md-10">
								<input class="form-control" id="phone" name="phone"
									   value="${entity.phone}" type="text" placeholder="请输入电话号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="fax">传真:</label>
							<div class="col-md-10">
								<input class="form-control" id="fax" name="fax"
									   value="${entity.fax}" type="text" placeholder="请输入传真" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="mail">邮箱:</label>
							<div class="col-md-10">
								<input class="form-control" id="mail" name="mail"
									   value="${entity.mail}" type="text" placeholder="请输入邮箱" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="qq">QQ:</label>
							<div class="col-md-10">
								<input class="form-control" id="qq" name="qq"
									   value="${entity.qq}" type="text" placeholder="请输入qq号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="wechat">微信:</label>
							<div class="col-md-10">
								<input class="form-control" id="wechat" name="wechat"
									   value="${entity.wechat}" type="text" placeholder="请输入微信号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="address">地址:</label>
							<div class="col-md-10">
								<input class="form-control" id="address" name="address"
									   value="${entity.address}" type="text" placeholder="请输入住址" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="importantGrade">重要等级:</label>
							<div class="col-md-10">
								<javakc:select codeTp="importantGrade" id="importantGrade" name="importantGrade"
											   value="${entity.importantGrade}" def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="followStatus">跟进状态:</label>
							<div class="col-md-10">
								<javakc:select codeTp="followStatus" id="followStatus" name="followStatus"
											   value="${entity.followStatus}" def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">经办人:</label>
							<div class="col-md-10">
								<input type="hidden" id="ccc" value="${entity.agent}">
								<!--经办人选择-->
								<select id="agent" class="form-control" name="agent">
									<option value="请选择">请选择</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="ifAccept">是否认可:</label>
							<div class="col-md-10">
								<javakc:select codeTp="ifAccept" id="ifAccept" name="ifAccept"
											   value="${entity.ifAccept}" def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="acceptReason">认可理由:</label>
							<div class="col-md-10">
								<input class="form-control" id="acceptReason" name="acceptReason"
									   value="${entity.acceptReason}" type="text" placeholder="请输入认可理由" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="origin">信息来源:</label>
							<div class="col-md-10">
								<input class="form-control" id="origin" name="origin"
									   value="${entity.origin}" type="text" placeholder="请输入信息来源" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="rank">备注:</label>
							<div class="col-md-10">
								<input class="form-control" id="rank" name="rank"
									   value="${entity.rank}" type="text" placeholder="请输入信息来源" />
							</div>
						</div>
						<div>
							<div class="col-sm-6" style="text-align:center"><input type="submit" value="确定编辑" class="btn btn-success"/></div>
							<div class="col-sm-6" style="text-align:center"><input type="button" value="取消" class="btn btn-success" onclick="javascript:history.back();"/></div>
						</div>

					</form>
				</fieldset>

			</div>
		</div>
		<script type="text/javascript">
			$(document).ready(function () {
				$.post('<%=path%>contact/queryEmployee.do',function (data) {
					var sss = data.toString();
					alert(sss);
					var strs= new Array();
					strs = sss.split(",");
					document.getElementById("agent").options.length=0;
					for (var i=0;i<strs.length ;i++ )
					{
						var province=document.getElementById("agent");
						var optionObj=document.createElement("option");
						optionObj.innerHTML=strs[i];
						optionObj.value=strs[i];
						province.appendChild(optionObj);
					}
					var ccc = $("#ccc").val();
					var number = $("#agent option").length;
					for (var i = 0; i < number; i++){
						if ($("#agent").get(0).options[i].text == ccc){
							$("#agent").get(0).options[i].selected = true;
						}
					}
				});
			})
		</script>
	</body>
<%--	<script type="text/javascript" src="${path }/view/system/user/js/user.js"></script>--%>
</html>