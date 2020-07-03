package com.javakc.ssm.modules.organization.information.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.organization.information.dao.ContactDao;
import com.javakc.ssm.modules.organization.information.entity.ContactEntity;
import com.javakc.ssm.modules.organization.information.entity.TempEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = false)
public class ContactService extends BaseService<ContactDao, ContactEntity> {

    /**
     * 带分页的条件查询
     * @param contactEntity 查询条件
     * @param page 分页参数
     * @return
     */
    public Page<ContactEntity> queryContact(ContactEntity contactEntity, Page<ContactEntity> page) {

        // ##设置分页参数
        contactEntity.setPage(page);
        List<ContactEntity> list = dao.findContact();

        // ##设置查询的集合数据
        page.setList(list);

        return page;
    }

    /**
     * 通过联系人的id查看机构的全部信息
     * @param id
     * @return
     */
    public ContactEntity checkContact(int id){
        ContactEntity entity = dao.checkContact(id);
        return entity;
    }

    /**
     * 查询员工表中所有员工的姓名
     * @param
     * @return
     */
    public List<String> queryEmployee(){
        List<String> list = dao.queryEmployee();
        return list;
    }

    /**
     * 前端的编辑页面保存时，对数据进行保存，并更改机构其他信息的经办人
     * @param contactEntity
     */
    public void update(ContactEntity contactEntity){

        Map<String, String> one = new HashMap<>();
        one.put("id",contactEntity.getId()+"");
        one.put("institution",contactEntity.getInstitution());
        one.put("name",contactEntity.getName());
        one.put("sex",contactEntity.getSex()+"");
        one.put("duty",contactEntity.getDuty());
        one.put("mobilePhone",contactEntity.getMobilePhone());
        one.put("phone",contactEntity.getPhone());
        one.put("fax",contactEntity.getFax());
        one.put("mail",contactEntity.getMail()+"");
        one.put("qq",contactEntity.getQq());
        one.put("wechat",contactEntity.getWechat());
        one.put("address",contactEntity.getAddress()+"");
        one.put("importantGrade",contactEntity.getImportantGrade());
        one.put("followStatus",contactEntity.getFollowStatus()+"");
        one.put("agent",contactEntity.getAgent());
        one.put("ifAccept",contactEntity.getIfAccept()+"");
        one.put("acceptReason",contactEntity.getAcceptReason());
        one.put("origin",contactEntity.getOrigin()+"");
        one.put("rank",contactEntity.getRank()+"");
        dao.updateone(one);

        String id = dao.queryempByname(contactEntity.getAgent());
        dao.updateotherempid(id,contactEntity.getInstitution());
    }

    /**
     * 创建联系人
     * @param contactEntity
     */
    public void createcontact(ContactEntity contactEntity){
        Map<String, String> map = new HashMap<>();

        map.put("name",contactEntity.getName());
        map.put("sex",contactEntity.getSex()+"");
        map.put("duty",contactEntity.getDuty());
        map.put("mobilePhone",contactEntity.getMobilePhone());
        map.put("phone",contactEntity.getPhone());
        map.put("fax",contactEntity.getFax());
        map.put("mail",contactEntity.getMail()+"");
        map.put("qq",contactEntity.getQq());
        map.put("wechat",contactEntity.getWechat());
        map.put("address",contactEntity.getAddress()+"");
        map.put("importantGrade",contactEntity.getImportantGrade());
        map.put("followStatus",contactEntity.getFollowStatus()+"");
        map.put("agent",contactEntity.getAgent());
        map.put("ifAccept",contactEntity.getIfAccept()+"");
        map.put("acceptReason",contactEntity.getAcceptReason());
        map.put("origin",contactEntity.getOrigin()+"");
        map.put("rank",contactEntity.getRank()+"");
        dao.createcontact(map);

    }

    /**
     * 根据联系人id查询该联系人的机构，如果该机构不为null并且长度大于0，那么把机构的联系人、手机、电话、经办人置空，然后删除该联系人
     * @param id
     */
    public void deleteContact(int id){
        ContactEntity contactEntity = dao.checkContact(id);
        String institution = contactEntity.getInstitution();
        if (institution != null && institution.length()>0){
            dao.deleteOrgbyname(institution);
        }
        dao.deleteContact(id);
    }

    public List<String> queryContactbynull(){
        List<String> list = dao.queryContactbynull();
        return list;
    }

    public Map<String,String> querycontactbyname(String contactname){
        TempEntity entity = dao.querycontactbyname(contactname);
        Map<String, String> map = new HashMap<>();
        map.put("mobilePhone",entity.getMobilePhone());
        map.put("phone",entity.getPhone());
        map.put("agent",entity.getAgent());
        return map;
    }

}
