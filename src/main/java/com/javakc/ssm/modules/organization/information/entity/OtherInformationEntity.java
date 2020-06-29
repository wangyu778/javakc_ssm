package com.javakc.ssm.modules.organization.information.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.Date;

public class OtherInformationEntity extends BaseEntity<OtherInformationEntity> {

    private int id;//机构其他信息的id
    private int employeeId;//员工id
    private int annuaFee;//年费
    private int resourcesFund;//电子资源经费
    private Date procurementTime;//采购时间
    private int procurementLevel;//采购级别  1：不确定、2：重要、3：一般、4：跟进
    private int procurementMethod;//采购方式  1：不确定、2：单独采购、3：联合采购
    private int procurementApproach;//采购途径  1:不确定、2：直接采购、3：招标采购、4：代理采购
    private int distribution;//分配情况  1：未分配、2：已分配
    private int auditStatus;//审核状态  1：未审核、2：审核中、3：已审核
    private int organizationType;//机构类别  1：重要客户、2：普通客户、3：低价值客户
    private int goStatus;//跟进状态  1：初访、2：意向、3：潜在、4：报价、5：成交、6：暂时搁置
    private String remake;//备注信息

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAnnuaFee() {
        return annuaFee;
    }

    public void setAnnuaFee(int annuaFee) {
        this.annuaFee = annuaFee;
    }

    public int getResourcesFund() {
        return resourcesFund;
    }

    public void setResourcesFund(int resourcesFund) {
        this.resourcesFund = resourcesFund;
    }

    public Date getProcurementTime() {
        return procurementTime;
    }

    public void setProcurementTime(Date procurementTime) {
        this.procurementTime = procurementTime;
    }

    public int getProcurementLevel() {
        return procurementLevel;
    }

    public void setProcurementLevel(int procurementLevel) {
        this.procurementLevel = procurementLevel;
    }

    public int getProcurementMethod() {
        return procurementMethod;
    }

    public void setProcurementMethod(int procurementMethod) {
        this.procurementMethod = procurementMethod;
    }

    public int getProcurementApproach() {
        return procurementApproach;
    }

    public void setProcurementApproach(int procurementApproach) {
        this.procurementApproach = procurementApproach;
    }

    public int getDistribution() {
        return distribution;
    }

    public void setDistribution(int distribution) {
        this.distribution = distribution;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public int getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(int organizationType) {
        this.organizationType = organizationType;
    }

    public int getGoStatus() {
        return goStatus;
    }

    public void setGoStatus(int goStatus) {
        this.goStatus = goStatus;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }
}
