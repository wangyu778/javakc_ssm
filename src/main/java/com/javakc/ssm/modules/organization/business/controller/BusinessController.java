package com.javakc.ssm.modules.organization.business.controller;

import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.modules.organization.business.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 信息管理-商机管理
 * @author wangyu
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;



}
