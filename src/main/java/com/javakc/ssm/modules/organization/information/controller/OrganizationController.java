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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        // ##调用service的查询方法
        ModelAndView modelAndView = new ModelAndView("organization/information/organizationlist");
        Page<AllEntity> page = organizationService.queryOrganization(allEntity, new Page<AllEntity>(request, response));
        modelAndView.addObject("page",page);
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


    /**
     * 通过前端传进来的机构的id进行数据的查询，然后将数据返回到修改页面，供操作者查看和修改
     * @param id
     * @return
     */
    @RequestMapping("deleteOrganization/{id}")
    public String deleteOrganization(@PathVariable int id){
        System.out.println("deleteOrganization=============================="+id);
        organizationService.deleteOrganization(id);
        return "redirect:/organization/queryOrganization.do";
    }

    /**
     * 前端的异步请求，前端传来省份的名称，后台到数据库中查询该省份下的城市，封装到List中返回
     * @param shengfen
     * @return
     */
    @ResponseBody
    @RequestMapping("queryCity")
    public List<String> queryCity(String shengfen){
        System.out.println(shengfen);
        List<String> list = organizationService.queryCity(shengfen);
        for (String s : list) {
            System.out.println(s);
        }
        return list;
    }

    /**
     * 机构信息编辑时提交，传输过来，把数据库中该机构的数据进行修改，之后分页查询重定向到分页展示页面
     * @param organizationOtherEntity
     * @return
     */
    @RequestMapping("update")
    public String update(OrganizationOtherEntity organizationOtherEntity){
        organizationService.update(organizationOtherEntity);
        return "redirect:/organization/queryOrganization.do";
    }
    @ResponseBody
    @RequestMapping("queryorgbyname")
    public String queryorgbyname(String organizationname){
        System.out.println(organizationname);
        String result = organizationService.queryorgbyname(organizationname);
        return result;
    }

    @RequestMapping("createorganization")
    public String createorganization(OrganizationOtherEntity organizationOtherEntity){
        System.out.println(organizationOtherEntity.toString());
        organizationService.createorganization(organizationOtherEntity);
        return "redirect:/organization/queryOrganization.do";
    }
}
