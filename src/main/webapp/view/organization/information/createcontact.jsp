<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>创建联系人信息页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">

			<div class="ibox float-e-margins">
				<fieldset>
					<legend>联系人基本信息</legend>
					<form class="form-horizontal" action="${path }/contact/createcontact.do" method="post" enctype="multipart/form-data" role="form">
						<div class="form-group">
							<label class="col-md-2 control-label" for="name">姓名:</label>
							<div class="col-md-10">
								<input class="form-control" id="name" name="name" type="text" placeholder="请输入姓名" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="sex">性别:</label>
							<div class="col-md-10">
								<javakc:select codeTp="sex" id="sex" name="sex" def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="duty">职务:</label>
							<div class="col-md-10">
								<input class="form-control" id="duty" name="duty" type="text" placeholder="请输入职务" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="mobilePhone">手机:</label>
							<div class="col-md-10">
								<input class="form-control" id="mobilePhone" name="mobilePhone" type="text" placeholder="请输入手机号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="phone">电话:</label>
							<div class="col-md-10">
								<input class="form-control" id="phone" name="phone" type="text" placeholder="请输入电话号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="fax">传真:</label>
							<div class="col-md-10">
								<input class="form-control" id="fax" name="fax" type="text" placeholder="请输入传真" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="mail">邮箱:</label>
							<div class="col-md-10">
								<input class="form-control" id="mail" name="mail" type="text" placeholder="请输入邮箱" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="qq">QQ:</label>
							<div class="col-md-10">
								<input class="form-control" id="qq" name="qq" type="text" placeholder="请输入qq号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="wechat">微信:</label>
							<div class="col-md-10">
								<input class="form-control" id="wechat" name="wechat" type="text" placeholder="请输入微信号" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="address">地址:</label>
							<div class="col-md-10">
								<input class="form-control" id="address" name="address" type="text" placeholder="请输入住址" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="importantGrade">重要等级:</label>
							<div class="col-md-10">
								<javakc:select codeTp="importantGrade" id="importantGrade" name="importantGrade"
											   def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="followStatus">跟进状态:</label>
							<div class="col-md-10">
								<javakc:select codeTp="followStatus" id="followStatus" name="followStatus"
											   def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">经办人:</label>
							<div class="col-md-10">
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
											   def="true" cls="form-control"></javakc:select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="acceptReason">认可理由:</label>
							<div class="col-md-10">
								<textarea class="form-control" id="acceptReason" name="acceptReason" rows="3" placeholder="请输入认可理由"></textarea>
							</div>

						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="origin">信息来源:</label>
							<div class="col-md-10">
								<input class="form-control" id="origin" name="origin" type="text" placeholder="请输入信息来源" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="rank">备注:</label>
							<div class="col-md-10">
								<textarea class="form-control" id="rank" name="rank" rows="3" placeholder="请输入备注"></textarea>
							</div>
						</div>
						<div>
							<div class="col-sm-6" style="text-align:center"><input type="submit" value="确定" class="btn btn-success"/></div>
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
				});
			})
		</script>
	</body>
<%--	<script type="text/javascript" src="${path }/view/system/user/js/user.js"></script>--%>
</html>