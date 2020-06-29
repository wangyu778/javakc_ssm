package com.javakc.ssm.modules.organization.information.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.List;


public class OrganizationEntity extends BaseEntity<OrganizationEntity> {

    private int id;//机构的id
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
    private OtherInformationEntity otherInformation;//机构的其他信息
    private ContactEntity contactEntities;//机构中的联系人

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

    public OtherInformationEntity getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(OtherInformationEntity otherInformation) {
        this.otherInformation = otherInformation;
    }

    public ContactEntity getContactEntities() {
        return contactEntities;
    }

    public void setContactEntities(ContactEntity contactEntities) {
        this.contactEntities = contactEntities;
    }

    @Override
    public String toString() {
        return "OrganizationEntity{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
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
                ", otherInformation=" + otherInformation +
                ", contactEntities=" + contactEntities +
                '}';
    }
}
