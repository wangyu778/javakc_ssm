package com.javakc.ssm.modules.organization.information.dao;

import com.javakc.ssm.base.dao.BaseDao;
import com.javakc.ssm.modules.organization.information.entity.ContactEntity;

public interface ContactDao extends BaseDao<ContactEntity> {

    public ContactEntity queryContactById(int i);
}
