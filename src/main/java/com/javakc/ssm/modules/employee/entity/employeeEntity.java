package com.javakc.ssm.modules.employee.entity;

import com.javakc.ssm.base.entity.BaseEntity;

public class employeeEntity extends BaseEntity<employeeEntity> {

    private int id;//员工主键id
    private int department;//部门
    private String employeeName;//员工姓名
    private String employeeCord;//员工工号
    private String positionName;//岗位名称
    private String positionResponsibility;//岗位职责
    private int sex;//性别  1：男、2：女
    private String jobPhone;//电话号码
    private String phone;//手机号码
    private String email;//邮箱
    private String jobQq;//工作qq
    private String shortCord;//短号
    private int responsibilityLevel;//职责级别
    private int responsibilityCategory;//职责类别
    private int employeeStatus;//员工状态  1：正常、2；异常
    private int quit;//是否离职  1：是、2：否
    private int allocationStatus;//分配状态  1：未分配、2：已分配
    private String remake;//备注

}
