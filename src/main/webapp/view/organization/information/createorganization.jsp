<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<title>编辑机构信息页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">

			<div class="ibox float-e-margins">
				<fieldset>
					<legend>基本信息</legend>
					<form action="${path }/organization/createorganization.do" method="post" enctype="multipart/form-data" class="form-horizontal" role="form">
						<div class="form-group">
							<label class="col-md-2 control-label" for="organizationName">机构名称:</label>
							<div class="col-md-8">
								<input class="form-control" id="organizationName" name="organizationName"
									   type="text" placeholder="请输入机构名称">
							</div>
							<div>
								<input type="button" value="查询" id="queryorganization">
							</div>
						</div>
						<div id="aaa">
							<div class="form-group">
								<label class="col-md-2 control-label" for="organizationAddress">机构地址:</label>
								<div class="col-md-8">
									<input class="form-control" id="organizationAddress" name="organizationAddress" type="text" placeholder="请输入机构地址" />

								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="contacts">联系人</label>
								<div class="col-md-8">
									<!--联系人选择-->
									<select id="contacts" class="b" name="contacts" onchange="changecontact(this.value);">
										<option value="请选择">请选择</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="phone">手机</label>
								<div class="col-md-8">
									<input class="form-control" id="phone" name="phone"
										   value="${entity.phone}" type="text" readonly>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="telephone">电话</label>
								<div class="col-md-8">
									<input class="form-control" id="telephone" name="telephone"
										   value="${entity.telephone}" type="text" readonly>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="country">国家</label>
								<div class="col-md-8">
									<javakc:select codeTp="country" id="country" name="country"
												   value="${entity.country}" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label">省份</label>
								<div class="col-md-8">
									<%--								<input class="form-control" type="text" placeholder="${entity.province}" readonly>--%>
									<%--								<input type="hidden" value="${entity.province}" id="province">--%>
									<select id="prov" onchange="change(this.value);" class="a" name="province">
										<%--									<option>${entity.province}</option>--%>
										<option value="河北省">河北省</option>
										<option value="北京市">北京市</option>
										<option value="天津市">天津市</option>
										<option value="上海市">上海市</option>
										<option value="重庆市">重庆市</option>
										<option value="山西省">山西省</option>
										<option value="内蒙古省">内蒙古省</option>
										<option value="辽宁省">辽宁省</option>
										<option value="吉林省">吉林省</option>
										<option value="黑龙江省">黑龙江省</option>
										<option value="江苏省">江苏省</option>
										<option value="浙江省">浙江省</option>
										<option value="安徽省">安徽省</option>
										<option value="福建省">福建省</option>
										<option value="江西省">江西省</option>
										<option value="山东省">山东省</option>
										<option value="河南省">河南省</option>
										<option value="湖北省">湖北省</option>
										<option value="湖南省">湖南省</option>
										<option value="广东省">广东省</option>
										<option value="海南省">海南省</option>
										<option value="四川省">四川省</option>
										<option value="贵州省">贵州省</option>
										<option value="云南省">云南省</option>
										<option value="西藏省">西藏省</option>
										<option value="陕西省">陕西省</option>
										<option value="甘肃省">甘肃省</option>
										<option value="青海省">青海省</option>
										<option value="宁夏省">宁夏省</option>
										<option value="新疆省">新疆省</option>
										<option value="台湾省">台湾省</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label">城市</label>
								<div class="col-md-8">
									<%--								<input class="form-control" type="text" placeholder="${entity.city}" readonly>--%>

									<!--城市选择-->
									<select id="city" class="b" name="city">
										<option value="请选择">请选择</option>
									</select>
								</div>

							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="zipCode">邮编:</label>
								<div class="col-md-8">
									<input class="form-control" id="zipCode" name="zipCode" type="text" placeholder="请输入邮编" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="website">网站</label>
								<div class="col-md-8">
									<input class="form-control" id="website" name="website" type="text" placeholder="请输入网站" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="organizationLevel">机构级别</label>
								<div class="col-md-8">
									<javakc:select codeTp="organizationLevel" id="organizationLevel" name="organizationLevel" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="industryCategory">行业类别</label>
								<div class="col-md-8">
									<javakc:select codeTp="industryCategory" id="industryCategory" name="industryCategory" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="importanceLevel">重要级别</label>
								<div class="col-md-8">
									<javakc:select codeTp="importanceLevel" id="importanceLevel" name="importanceLevel" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="companyLevel">单位等级</label>
								<div class="col-md-8">
									<javakc:select codeTp="companyLevel" id="companyLevel" name="companyLevel" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="areaLevel">区域等级</label>
								<div class="col-md-8">
									<javakc:select codeTp="areaLevel" id="areaLevel" name="areaLevel" def="true" cls="form-control"></javakc:select>
								</div>
							</div>

							<legend>其他信息</legend>
							<div class="form-group">
								<label class="col-md-2 control-label" for="employeeName">经办人:</label>
								<div class="col-md-8">
									<input class="form-control" id="employeeName" name="employeeName" type="text" value="${entity.employeeName }" placeholder="${entity.employeeName }" readonly>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="annuaFee">年费:</label>
								<div class="col-md-8">
									<input class="form-control" id="annuaFee" name="annuaFee" type="text" placeholder="请输入年费" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="resourcesFund">电子资源经费:</label>
								<div class="col-md-8">
									<input class="form-control" id="resourcesFund" name="resourcesFund" type="text" placeholder="请输入电子资源经费" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="procurementTime">采购时间:</label>
								<div class="col-md-8">
									<input class="form-control" id="procurementTime" name="procurementTime" type="date" placeholder="请输入采购时间"
									>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="procurementLevel">采购级别:</label>
								<div class="col-md-8">

									<javakc:select codeTp="procurementLevel" id="procurementLevel" name="procurementLevel" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="procurementMethod">采购方式:</label>
								<div class="col-md-8">

									<javakc:select codeTp="procurementMethod" id="procurementMethod" name="procurementMethod" def="true" cls="form-control"></javakc:select>
								</div>

							</div>
							<div class="form-group">
								<label class="col-md-2 control-label">采购途径:</label>
								<div class="col-md-8">
									<javakc:select codeTp="procurementApproach" id="procurementApproach" name="procurementApproach" def="true" cls="form-control"></javakc:select>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-2 control-label" for="distribution">分配情况:</label>
								<div class="col-md-8">
									<javakc:select codeTp="distribution" id="distribution" name="distribution" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="auditStatus">审核状态:</label>
								<div class="col-md-8">
									<javakc:select codeTp="auditStatus" id="auditStatus" name="auditStatus" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="organizationType">机构类型:</label>
								<div class="col-md-8">

									<javakc:select codeTp="organizationType" id="organizationType" name="organizationType" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="goStatus">跟进状态:</label>
								<div class="col-md-8">

									<javakc:select codeTp="goStatus" id="goStatus" name="goStatus" def="true" cls="form-control"></javakc:select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label" for="remake">备注信息:</label>
								<div class="col-md-8">
									<textarea class="form-control" id="remake" name="remake" rows="3" placeholder="请输入备注信息"></textarea>
								</div>
							</div>
							<div>
								<div class="col-sm-6" style="text-align:center"><input type="submit" value="确定" class="btn btn-success"/></div>
								<div class="col-sm-6" style="text-align:center"><input type="button" value="取消" class="btn btn-success" onclick="javascript:history.back();"/></div>
							</div>
						</div>
					</form>
				</fieldset>

			</div>
		</div>
	<script type="text/javascript">
		$(document).ready(function () {

			var shengfen = $("#prov").val();
			change(shengfen);
			$("#aaa").hide();



			$("#queryorganization").click(function () {
				var val = $(" input[ name='organizationName' ] ").val();
				var organizationname = val.trim();
				if (val.trim() == ''){
					alert("请输入机构名称");
				}else {
					$.post('<%=path%>organization/queryorgbyname.do',{organizationname: organizationname},function (data) {
						if (data == 1){
							$("#aaa").show();


							$.post('<%=path%>contact/queryContactbynull.do',function (data) {
								var sss = data.toString();
								var strs= new Array();
								strs = sss.split(",");
								document.getElementById("contacts").options.length=0;
								for (var i=0;i<strs.length ;i++ )
								{
									var province=document.getElementById("contacts");
									var optionObj=document.createElement("option");
									optionObj.innerHTML=strs[i];
									optionObj.value=strs[i];
									province.appendChild(optionObj);
								}


								var contactname = $("#contacts").val();

								$.post('<%=path%>contact/querycontactbyname.do',{contactname: contactname},function (data) {

									var phone=data["phone"];
									var mobilePhone=data["mobilePhone"];
									var agent=data["agent"];

									$("#telephone").val(phone);
									$("#phone").val(mobilePhone);
									$("#employeeName").val(agent);
								});
							});


						}else {
							alert("该机构已存在，不能重复创建");
							window.location.href = '<%=path%>organization/queryOrganization.do'
						}
					});
				}
			});


			$('#organizationName').bind('input propertychange keyup', function() {
				$("#aaa").hide();
			});

		});

		function change(num) {
			$.post('<%=path%>organization/queryCity.do',{shengfen: num},function (data) {
				var sss = data.toString();
				var strs= new Array();
				strs = sss.split(",");
				document.getElementById("city").options.length=0;
				for (var i=0;i<strs.length ;i++ )
				{
					var province=document.getElementById("city");
					var optionObj=document.createElement("option");
					optionObj.innerHTML=strs[i];
					optionObj.value=strs[i];
					province.appendChild(optionObj);
				}
			});
		}

		function changecontact(num) {
			$.post('<%=path%>contact/querycontactbyname.do',{contactname: num},function (data) {

				var phone=data["phone"];
				var mobilePhone=data["mobilePhone"];
				var agent=data["agent"];

				$("#telephone").val(phone);
				$("#phone").val(mobilePhone);
				$("#employeeName").val(agent);
			});
		}
	</script>
	</body>


</html>