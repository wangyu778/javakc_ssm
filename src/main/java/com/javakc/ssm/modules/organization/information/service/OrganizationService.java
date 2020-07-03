package com.javakc.ssm.modules.organization.information.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.organization.information.dao.OrganizationDao;
import com.javakc.ssm.modules.organization.information.entity.AllEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationOtherEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = false)
public class OrganizationService extends BaseService<OrganizationDao, OrganizationEntity> {

    /**
     * 带分页的条件查询
     * @param allEntity 查询条件
     * @param page 分页参数
     * @return
     */
    public Page<AllEntity> queryOrganization(AllEntity allEntity, Page<AllEntity> page) {

        System.out.println("--------------------我又进来了----------------------");
        // ##设置分页参数
        allEntity.setPage(page);
        List<AllEntity> list = dao.findOrganization();

        for (AllEntity entity : list) {
            System.out.println(entity.toString());
        }

        // ##设置查询的集合数据
        page.setList(list);

        System.out.println("--------------------我又调用了了----------------------");
        return page;
    }

    /**
     * 通过机构的id查看机构的全部信息
     * @param id
     * @return
     */
    public OrganizationOtherEntity checkOrganization(int id){
        OrganizationOtherEntity entity = dao.checkOrganization(id);
        return entity;
    }

    /**
     * 通过省份名称查看该省份下的所有城市
     * @param data
     * @return
     */
    public List<String> queryCity(String data){
        System.out.println("service的"+data);
        List<String> list = dao.queryCity(data);
        for (String s : list) {
            System.out.println("service的"+s);
        }
        return list;
    }

    /**
     * 前端的编辑页面保存时，对数据进行保存
     * @param organizationOtherEntity
     */
    public void update(OrganizationOtherEntity organizationOtherEntity){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(organizationOtherEntity.getProcurementTime());

        Map<String, String> one = new HashMap<>();
        one.put("organizationName",organizationOtherEntity.getOrganizationName());
        one.put("organizationAddress",organizationOtherEntity.getOrganizationAddress());
        one.put("country",organizationOtherEntity.getCountry()+"");
        one.put("province",organizationOtherEntity.getProvince());
        one.put("city",organizationOtherEntity.getCity());
        one.put("zipCode",organizationOtherEntity.getZipCode());
        one.put("website",organizationOtherEntity.getWebsite());
        one.put("organizationLevel",organizationOtherEntity.getOrganizationLevel()+"");
        one.put("industryCategory",organizationOtherEntity.getIndustryCategory()+"");
        one.put("importanceLevel",organizationOtherEntity.getImportanceLevel()+"");
        one.put("companyLevel",organizationOtherEntity.getCompanyLevel()+"");
        one.put("areaLevel",organizationOtherEntity.getAreaLevel()+"");
        dao.updateone(one);

        Map<String, String> two = new HashMap<>();
        two.put("organizationName",organizationOtherEntity.getOrganizationName());
        two.put("annuaFee",organizationOtherEntity.getAnnuaFee()+"");
        two.put("resourcesFund",organizationOtherEntity.getResourcesFund()+"");
        two.put("procurementTime",format);
        two.put("procurementLevel",organizationOtherEntity.getProcurementLevel()+"");
        two.put("procurementMethod",organizationOtherEntity.getProcurementMethod()+"");
        two.put("organizationType",organizationOtherEntity.getOrganizationType()+"");
        two.put("procurementApproach",organizationOtherEntity.getProcurementApproach()+"");
        two.put("distribution",organizationOtherEntity.getDistribution()+"");
        two.put("auditStatus",organizationOtherEntity.getAuditStatus()+"");
        two.put("remake",organizationOtherEntity.getRemake()+"");
        two.put("goStatus",organizationOtherEntity.getGoStatus()+"");
        dao.updatetwo(two);
    }


    public OrganizationEntity search(String names) {
        OrganizationEntity entity = dao.get(names);
        System.out.println("entity.getZipCode() = " + entity.getZipCode());
        return entity;
    }

    public String queryorgbyname(String name){
        String queryorgbyname = dao.queryorgbyname(name);
        System.out.println(queryorgbyname);

        //如果能查得到该机构的名称那么返回2
        if (queryorgbyname != null && queryorgbyname.length()>0){
            return "2";
        }else {
            //如果查不到该机构的名称那么返回1
            return "1";
        }
    }

    public void createorganization(OrganizationOtherEntity organizationOtherEntity){

        String id = dao.queryempidbyname(organizationOtherEntity.getEmployeeName());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(organizationOtherEntity.getProcurementTime());

        Map<String, String> one = new HashMap<>();
        one.put("organizationName",organizationOtherEntity.getOrganizationName());
        one.put("organizationAddress",organizationOtherEntity.getOrganizationAddress());
        one.put("contacts",organizationOtherEntity.getContacts());
        one.put("phone",organizationOtherEntity.getPhone());
        one.put("telephone",organizationOtherEntity.getTelephone());
        one.put("country",organizationOtherEntity.getCountry()+"");
        one.put("province",organizationOtherEntity.getProvince());
        one.put("city",organizationOtherEntity.getCity());
        one.put("zipCode",organizationOtherEntity.getZipCode());
        one.put("website",organizationOtherEntity.getWebsite());
        one.put("organizationLevel",organizationOtherEntity.getOrganizationLevel()+"");
        one.put("industryCategory",organizationOtherEntity.getIndustryCategory()+"");
        one.put("importanceLevel",organizationOtherEntity.getImportanceLevel()+"");
        one.put("companyLevel",organizationOtherEntity.getCompanyLevel()+"");
        one.put("areaLevel",organizationOtherEntity.getAreaLevel()+"");
        dao.createone(one);

        HashMap<String, String> two = new HashMap<>();
        two.put("organizationName",organizationOtherEntity.getOrganizationName());
        two.put("employeeId",id);
        two.put("annuaFee",organizationOtherEntity.getAnnuaFee()+"");
        two.put("resourcesFund",organizationOtherEntity.getResourcesFund()+"");
        two.put("procurementTime",format);
        two.put("procurementLevel",organizationOtherEntity.getProcurementLevel()+"");
        two.put("procurementMethod",organizationOtherEntity.getProcurementMethod()+"");
        two.put("organizationType",organizationOtherEntity.getOrganizationType()+"");
        two.put("procurementApproach",organizationOtherEntity.getProcurementApproach()+"");
        two.put("distribution",organizationOtherEntity.getDistribution()+"");
        two.put("auditStatus",organizationOtherEntity.getAuditStatus()+"");
        two.put("remake",organizationOtherEntity.getRemake()+"");
        two.put("goStatus",organizationOtherEntity.getGoStatus()+"");
        dao.createtwo(two);

        dao.updatebynameandname(one);

        String otherid = dao.queryotheridbyname(organizationOtherEntity.getOrganizationName());
        String contactid = dao.querycontactidbyname(organizationOtherEntity.getOrganizationName());
        Map<String, String> map = new HashMap<>();
        map.put("otherid",otherid);
        map.put("contactid",contactid);
        map.put("organizationName",organizationOtherEntity.getOrganizationName());
        dao.updateorgbyidid(map);

    }

    public void deleteOrganization(int id){
        OrganizationOtherEntity entity = dao.checkOrganization(id);

        System.out.println("id========================="+id);
        System.out.println("OrganizationName========================="+entity.getOrganizationName());

        dao.deleteorganization(id);
        dao.deleteother(entity.getOrganizationName());
        dao.deletecontact(entity.getOrganizationName());
    }
}
