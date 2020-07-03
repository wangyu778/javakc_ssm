package com.javakc.ssm.modules.organization.information.entity;

import com.javakc.ssm.base.entity.BaseEntity;

public class TempEntity extends BaseEntity<TempEntity> {
    private String mobilePhone;//手机
    private String phone;//电话
    private String agent;//经办人

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

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "TempEntity{" +
                "mobilePhone='" + mobilePhone + '\'' +
                ", phone='" + phone + '\'' +
                ", agent='" + agent + '\'' +
                '}';
    }
}
