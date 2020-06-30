package com.javakc.ssm.modules.organization.information.dao;

import com.javakc.ssm.base.dao.BaseDao;
import com.javakc.ssm.modules.organization.information.entity.AllEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationOtherEntity;

import java.util.List;

public interface OrganizationDao extends BaseDao<OrganizationEntity> {

    public List<AllEntity> findOrganization();

    public OrganizationOtherEntity checkOrganization(int id);
}
