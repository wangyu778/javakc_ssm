package com.javakc.ssm.modules.organization.business.dao;

import com.javakc.ssm.base.dao.BaseDao;
import com.javakc.ssm.base.dao.MyBatisDao;
import com.javakc.ssm.modules.organization.business.entity.BusinessEntity;

import java.util.List;

/**
 * 机构模块-商机管理数据层
 * @author wangyu
 * @version 1.0
 */
@MyBatisDao
public interface BusinessDao extends BaseDao<BusinessEntity> {

}
