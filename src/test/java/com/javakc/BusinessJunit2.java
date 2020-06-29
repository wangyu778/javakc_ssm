package com.javakc;

import com.javakc.ssm.modules.organization.business.entity.BusinessEntity;
import com.javakc.ssm.modules.organization.business.service.BusinessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath*:/mybatis-config.xml","classpath*:/spring-mvc.xml","classpath*:/spring-mybatis.xml","classpath*:mapping/modules/dictionary/BusinessDao.xml","classpath*:/spring-shiro.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BusinessJunit2 {

    @Autowired
    private BusinessService businessService;

    @Test
    public void test(){
        BusinessEntity entity = new BusinessEntity();
        entity.setAgent("张三");
        entity.setAnnualFee(100);
        entity.setResourceFee(200);

        businessService.save(entity);
    }

}
