package com.javakc.ssm.modules.organization.information.dao;

import com.javakc.ssm.base.dao.BaseDao;
import com.javakc.ssm.modules.organization.information.entity.ContactEntity;
import com.javakc.ssm.modules.organization.information.entity.TempEntity;

import java.util.List;
import java.util.Map;

public interface ContactDao extends BaseDao<ContactEntity> {

    public ContactEntity queryContactById(int i);

    /**
     * 联系人信息的分页展示
     * @return
     */
    public List<ContactEntity> findContact();

    /**
     * 通过联系人id查询联系人的详细信息
     * @param id
     * @return
     */
    public ContactEntity checkContact(int id);

    /**
     * 查询员工表的所有员工姓名
     * @param
     * @return
     */
    public List<String> queryEmployee();

    /**
     * 对联系人的基本信息进行保存
     * @param map
     */
    public void updateone(Map<String,String> map);

    /**
     * 根据经办人的姓名去员工表查询该员工的id
     * @param name
     * @return
     */
    public String queryempByname(String name);

    /**
     * 根据机构名称去修改机构的其他信息的经办人id
     * @param id
     * @param name
     */
    public void updateotherempid(String id,String name);

    /**
     * 新增一个联系人
     * @param map
     */
    public void createcontact(Map<String,String> map);

    /**
     * 根据id删除联系人
     * @param id
     */
    public void deleteContact(int id);

    /**
     * 根据机构名称将联系人姓名、手机号、电话、经办人置空
     * @param name
     */
    public void deleteOrgbyname(String name);

    public List<String> queryContactbynull();

    public TempEntity querycontactbyname(String contactname);
}
