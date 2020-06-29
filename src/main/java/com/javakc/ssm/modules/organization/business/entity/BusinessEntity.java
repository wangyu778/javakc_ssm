package com.javakc.ssm.modules.organization.business.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.Date;

public class BusinessEntity extends BaseEntity<BusinessEntity> {
    private int id;//主键ID
    private String agent;//经办人
    private int annualFee;//年费
    private int resourceFee;//电子资源经费
    private Date purchaseTime;//采购时间
    private int purchaseRank;//采购级别 1:不确定2:重要3:一般4:跟进
    private int purchaseWay;//采购方式 1:不确定2:单独采购3:联合采购
    private int purchaseApproach;//采购途径 1:不确定2:直接采购3:招标采购4:代理采购
    private int allocationCondition;//分配情况 1:未分配2:已分配
    private int audit_condition;//审核状态 1:未审核2:审核中3:已审核
    private int followCondition;//跟进状态 1:初访2:意向3:潜在4:报价5:成交6:暂时搁置
    private int stageCondition;//阶段状态 1:初步接洽2:需求确定.3:方案/报价4:谈判/合同5:赢单
    private int businessRemind;//商机提醒 1:是2:否
    private String remarkMessage;//备注信息
    private int organizationId;//外键：机构的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(int annualFee) {
        this.annualFee = annualFee;
    }

    public int getResourceFee() {
        return resourceFee;
    }

    public void setResourceFee(int resourceFee) {
        this.resourceFee = resourceFee;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public int getPurchaseRank() {
        return purchaseRank;
    }

    public void setPurchaseRank(int purchaseRank) {
        this.purchaseRank = purchaseRank;
    }

    public int getPurchaseWay() {
        return purchaseWay;
    }

    public void setPurchaseWay(int purchaseWay) {
        this.purchaseWay = purchaseWay;
    }

    public int getPurchaseApproach() {
        return purchaseApproach;
    }

    public void setPurchaseApproach(int purchaseApproach) {
        this.purchaseApproach = purchaseApproach;
    }

    public int getAllocationCondition() {
        return allocationCondition;
    }

    public void setAllocationCondition(int allocationCondition) {
        this.allocationCondition = allocationCondition;
    }

    public int getAudit_condition() {
        return audit_condition;
    }

    public void setAudit_condition(int audit_condition) {
        this.audit_condition = audit_condition;
    }

    public int getFollowCondition() {
        return followCondition;
    }

    public void setFollowCondition(int followCondition) {
        this.followCondition = followCondition;
    }

    public int getStageCondition() {
        return stageCondition;
    }

    public void setStageCondition(int stageCondition) {
        this.stageCondition = stageCondition;
    }

    public int getBusinessRemind() {
        return businessRemind;
    }

    public void setBusinessRemind(int businessRemind) {
        this.businessRemind = businessRemind;
    }

    public String getRemarkMessage() {
        return remarkMessage;
    }

    public void setRemarkMessage(String remarkMessage) {
        this.remarkMessage = remarkMessage;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return "BusinessEntity{" +
                "id=" + id +
                ", agent='" + agent + '\'' +
                ", annualFee=" + annualFee +
                ", resourceFee=" + resourceFee +
                ", purchaseTime=" + purchaseTime +
                ", purchaseRank=" + purchaseRank +
                ", purchaseWay=" + purchaseWay +
                ", purchaseApproach=" + purchaseApproach +
                ", allocationCondition=" + allocationCondition +
                ", audit_condition=" + audit_condition +
                ", followCondition=" + followCondition +
                ", stageCondition=" + stageCondition +
                ", businessRemind=" + businessRemind +
                ", remarkMessage='" + remarkMessage + '\'' +
                ", organizationId=" + organizationId +
                '}';
    }
}
