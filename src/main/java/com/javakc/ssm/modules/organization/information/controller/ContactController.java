package com.javakc.ssm.modules.organization.information.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.organization.information.entity.ContactEntity;
import com.javakc.ssm.modules.organization.information.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    /**
     * 带分页的条件查询-联系人信息
     * @param contactEntity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/queryContact")
    public ModelAndView queryTest(ContactEntity contactEntity, HttpServletRequest request, HttpServletResponse response){
        // ##调用service的查询方法
        ModelAndView modelAndView = new ModelAndView("organization/information/contactlist");
        Page<ContactEntity> page = contactService.queryContact(contactEntity, new Page<ContactEntity>(request, response));
        modelAndView.addObject("page",page);
        return modelAndView;
    }

    /**
     * 通过前端传进来的联系人的id进行数据的查询，然后返回页面进行数据的展示
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping("checkContact/{id}")
    public String checkOrganization(@PathVariable int id, ModelMap modelMap){
        ContactEntity entity = contactService.checkContact(id);
        modelMap.put("entity",entity);
        return "organization/information/checkcontact";
    }

    /**
     * 通过前端传进来的联系人的id进行数据的查询，然后将数据返回到修改页面，供操作者查看和修改
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping("editorContact/{id}")
    public String editorOrganization(@PathVariable int id, ModelMap modelMap){
        ContactEntity entity = contactService.checkContact(id);
        modelMap.put("entity",entity);
        return "organization/information/editorcontact";
    }

    /**
     * 前端的异步请求，后台到数据库中查询员工表中的所有员工姓名，封装到List中返回
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("queryEmployee")
    public List<String> queryEmployee(){
        List<String> list = contactService.queryEmployee();
        return list;
    }

    /**
     * 联系人信息编辑时提交，传输过来，把数据库中该联系人的数据进行修改，之后分页查询重定向到分页展示页面
     * @param contactEntity
     * @return
     */
    @RequestMapping("update")
    public String update(ContactEntity contactEntity){

        contactService.update(contactEntity);
        return "redirect:/contact/queryContact.do";
    }

    /**
     * 根据前端发过来的数据来创建联系人，然后返回到分页展示页面
     * @param contactEntity
     * @return
     */
    @RequestMapping("createcontact")
    public String createcontact(ContactEntity contactEntity){
        contactService.createcontact(contactEntity);
        return "redirect:/contact/queryContact.do";
    }

    /**
     * 根据前端传过来的联系人的id，去数据库中删除想过的数据，包括联系人表和机构表
     * @param id
     * @return
     */
    @RequestMapping("deleteContact/{id}")
    public String deleteContact(@PathVariable int id){
        contactService.deleteContact(id);
        return "redirect:/contact/queryContact.do";
    }

    @ResponseBody
    @RequestMapping("queryContactbynull")
    public List<String> queryContactbynull(){
        List<String> list = contactService.queryContactbynull();
        return list;
    }

    @ResponseBody
    @RequestMapping("querycontactbyname")
    public Map<String,String> querycontactbyname(String contactname){
        System.out.println(contactname);
        Map<String, String> map = contactService.querycontactbyname(contactname);
        return map;
    }
}
