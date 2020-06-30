package com.javakc.ssm.modules.organization.information.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.organization.information.dao.OrganizationDao;
import com.javakc.ssm.modules.organization.information.entity.AllEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationOtherEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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


}
