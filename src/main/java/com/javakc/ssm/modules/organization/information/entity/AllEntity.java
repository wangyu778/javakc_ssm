package com.javakc.ssm.modules.organization.information.entity;

import com.javakc.ssm.base.entity.BaseEntity;

/**
 * 在机构的分页展示时用到的实体类
 */
public class AllEntity extends BaseEntity<AllEntity> {

    private int id;//机构的id
    private String organizationName;//机构的名称
    private int organizationLevel;//机构的级别
    private String organizationProvince;//省份
    private String employeeName;//经办人的姓名
    private String contactName;//联系人的姓名
    private int auditStatus;//机构其他表中的审核状态

    @Override
    public String toString() {
        return "AllEntity{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", organizationLevel=" + organizationLevel +
                ", organizationProvince='" + organizationProvince + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", auditStatus=" + auditStatus +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public int getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(int organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public String getOrganizationProvince() {
        return organizationProvince;
    }

    public void setOrganizationProvince(String organizationProvince) {
        this.organizationProvince = organizationProvince;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }
}
