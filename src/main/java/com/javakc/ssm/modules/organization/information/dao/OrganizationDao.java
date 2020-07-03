package com.javakc.ssm.modules.organization.information.dao;

import com.javakc.ssm.base.dao.BaseDao;
import com.javakc.ssm.modules.organization.information.entity.AllEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationOtherEntity;

import java.util.List;
import java.util.Map;

public interface OrganizationDao extends BaseDao<OrganizationEntity> {

    /**
     * 机构信息的分页展示
     * @return
     */
    public List<AllEntity> findOrganization();

    /**
     * 通过机构id查询机构的详细信息
     * @param id
     * @return
     */
    public OrganizationOtherEntity checkOrganization(int id);

    /**
     * 通过省份名称查询该省份下的所有城市
     * @param data
     * @return
     */
    public List<String> queryCity(String data);

    /**
     * 对机构的基本信息进行保存，其中不包括机构的名称、联系人、手机号、电话
     * @param map
     */
    public void updateone(Map<String,String> map);

    /**
     * 对机构的其他信息进行保存，其中不包括经办人名称
     * @param map
     */
    public void updatetwo(Map<String,String> map);

    public void createone(Map<String,String> map);
    public void createtwo(Map<String,String> map);

    public String queryorgbyname(String name);

    public String queryempidbyname(String name);

    public void updatebynameandname(Map<String,String> map);

    public String queryotheridbyname(String name);
    public String querycontactidbyname(String name);

    public void updateorgbyidid(Map<String,String> map);

    public void deleteorganization(int id);
    public void deleteother(String name);
    public void deletecontact(String name);
}
