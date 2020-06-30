package com.javakc.ssm.modules.organization.information.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.Date;

/**
 * 在列表中查看单个机构的信息是用到的实体类
 */
public class OrganizationOtherEntity extends BaseEntity<OrganizationOtherEntity> {

    private String organizationName;//机构名称
    private String organizationAddress;//机构地址
    private String contacts;//联系人
    private String phone;//手机
    private String telephone;//电话
    private int country;//国家   1：国内   2：海外
    private String province;//省份
    private String city;//市名
    private String zipCode;//邮编
    private String website;//网站
    private int organizationLevel;//机构类别  1：政党、2：企业、3：学校、4：政府、5：其他
    private int industryCategory;//行业类别  1：政党军企、2：高职高专、3：211高校、4：民办独立
    private int importanceLevel;//重要级别  1：一般、2：重要、3:很重要、4：非常重要
    private int companyLevel;//单位等级  1：一级、2：二级、3：三级、4：四级
    private int areaLevel;//区域等级  1：省级、2：市级、3:区级、4：县级

    private String employeeName;//员工的姓名
    private int annuaFee;//年费
    private int resourcesFund;//电子资源经费
    private Date procurementTime;//采购时间
    private int procurementLevel;//采购级别  1：不确定、2：重要、3：一般、4：跟进
    private int procurementMethod;//采购方式  1：不确定、2：单独采购、3：联合采购
    private int organizationType;//机构类型  1：重要客户、2：普通客户、3：低价值客户
    private int procurementApproach;//采购途径  1:不确定、2：直接采购、3：招标采购、4：代理采购
    private int distribution;//分配情况  1：未分配、2：已分配
    private int auditStatus;//审核状态  1：未审核、2：审核中、3：已审核
    private String remake;//备注信息
    private int goStatus;//跟进状态  1：初访、2：意向、3：潜在、4：报价、5：成交、6：暂时搁置

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(int organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public int getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(int industryCategory) {
        this.industryCategory = industryCategory;
    }

    public int getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(int importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    public int getCompanyLevel() {
        return companyLevel;
    }

    public void setCompanyLevel(int companyLevel) {
        this.companyLevel = companyLevel;
    }

    public int getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(int areaLevel) {
        this.areaLevel = areaLevel;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public int getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(int organizationType) {
        this.organizationType = organizationType;
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

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public int getGoStatus() {
        return goStatus;
    }

    public void setGoStatus(int goStatus) {
        this.goStatus = goStatus;
    }

    @Override
    public String toString() {
        return "OrganizationOtherEntity{" +
                "organizationName='" + organizationName + '\'' +
                ", organizationAddress='" + organizationAddress + '\'' +
                ", contacts='" + contacts + '\'' +
                ", phone='" + phone + '\'' +
                ", telephone='" + telephone + '\'' +
                ", country=" + country +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", website='" + website + '\'' +
                ", organizationLevel=" + organizationLevel +
                ", industryCategory=" + industryCategory +
                ", importanceLevel=" + importanceLevel +
                ", companyLevel=" + companyLevel +
                ", areaLevel=" + areaLevel +
                ", employeeName='" + employeeName + '\'' +
                ", annuaFee=" + annuaFee +
                ", resourcesFund=" + resourcesFund +
                ", procurementTime=" + procurementTime +
                ", procurementLevel=" + procurementLevel +
                ", procurementMethod=" + procurementMethod +
                ", organizationType=" + organizationType +
                ", procurementApproach=" + procurementApproach +
                ", distribution=" + distribution +
                ", auditStatus=" + auditStatus +
                ", remake='" + remake + '\'' +
                ", goStatus=" + goStatus +
                '}';
    }
}
