package com.javakc.ssm.modules.organization.business.service;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.organization.business.dao.BusinessDao;
import com.javakc.ssm.modules.organization.business.entity.BusinessEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 机构模块-商机管理逻辑层
 * @author wangyu
 * @version 1.0
 */
@Service
@Transactional(readOnly = true)
public class BusinessService extends BaseService<BusinessDao, BusinessEntity> {

    @Autowired
    private BusinessDao businessDao;


    @Transactional(readOnly = false)
    public void save(BusinessEntity entity){
        businessDao.insert(entity);
    }

}
