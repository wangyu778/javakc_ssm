package com.javakc.ssm.modules.organization.information.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.organization.information.entity.AllEntity;
import com.javakc.ssm.modules.organization.information.entity.ContactEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.information.entity.OrganizationOtherEntity;
import com.javakc.ssm.modules.organization.information.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    /**
     * 带分页的条件查询-机构信息
     * @param allEntity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/queryOrganization")
    public ModelAndView queryTest(AllEntity allEntity, HttpServletRequest request, HttpServletResponse response){
        System.out.println("--------------------我进来了----------------------");
        // ##调用service的查询方法
        ModelAndView modelAndView = new ModelAndView("organization/information/organizationlist");
        Page<AllEntity> page = organizationService.queryOrganization(allEntity, new Page<AllEntity>(request, response));
        modelAndView.addObject("page",page);
        System.out.println("--------------------我调用了了----------------------");
        return modelAndView;
    }

    /**
     * 通过前端传进来的机构的id进行数据的查询，然后返回页面进行数据的展示
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping("checkOrganization/{id}")
    public String checkOrganization(@PathVariable int id, ModelMap modelMap){
        OrganizationOtherEntity entity = organizationService.checkOrganization(id);
        modelMap.put("entity",entity);
        return "organization/information/checkorganization";
    }

    /**
     * 通过前端传进来的机构的id进行数据的查询，然后将数据返回到修改页面，供操作者查看和修改
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping("editorOrganization/{id}")
    public String editorOrganization(@PathVariable int id, ModelMap modelMap){
        OrganizationOtherEntity entity = organizationService.checkOrganization(id);
        modelMap.put("entity",entity);
        return "organization/information/editororganization";
    }

    @RequestMapping("queryCity")
    public String queryCity(String shengfen){
        String city = "城市";
        return city;
    }
}
