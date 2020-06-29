package com.javakc.ssm.modules.organization.information.entity;

import com.javakc.ssm.base.entity.BaseEntity;
import com.javakc.ssm.modules.employee.entity.employeeEntity;

public class ContactEntity extends BaseEntity<ContactEntity> {

    private int id;//联系人的id
    private String institution;//机构名称
    private String name;//姓名
    private int sex;//性别  1：男  2：女
    private String duty;//职务
    private String mobilePhone;//手机
    private String phone;//电话
    private String fax;//传真
    private String mail;//邮箱
    private String qq;//QQ
    private String wechat;//微信
    private String address;//地址
    private String importantGrade;//重要等级  1：一般、2：重要、3：非常重要
    private int followStatus;//跟进状态  1：未处理、2：有效、3：无效、4：放弃
    private String agent;//经办人
    private int ifAccept;//是否认可  1：是、2：否
    private String acceptReason;//认可理由
    private String origin;//信息来源
    private String rank;//备注
    private employeeEntity employeeEntity;//联系人中对应着一个员工

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImportantGrade() {
        return importantGrade;
    }

    public void setImportantGrade(String importantGrade) {
        this.importantGrade = importantGrade;
    }

    public int getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(int followStatus) {
        this.followStatus = followStatus;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getIfAccept() {
        return ifAccept;
    }

    public void setIfAccept(int ifAccept) {
        this.ifAccept = ifAccept;
    }

    public String getAcceptReason() {
        return acceptReason;
    }

    public void setAcceptReason(String acceptReason) {
        this.acceptReason = acceptReason;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public com.javakc.ssm.modules.employee.entity.employeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(com.javakc.ssm.modules.employee.entity.employeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "id=" + id +
                ", institution='" + institution + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", duty='" + duty + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", mail='" + mail + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", address='" + address + '\'' +
                ", importantGrade='" + importantGrade + '\'' +
                ", followStatus=" + followStatus +
                ", agent='" + agent + '\'' +
                ", ifAccept=" + ifAccept +
                ", acceptReason='" + acceptReason + '\'' +
                ", origin='" + origin + '\'' +
                ", rank='" + rank + '\'' +
                ", employeeEntity=" + employeeEntity +
                '}';
    }
}
