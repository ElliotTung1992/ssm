package com.github.dge1992.ssm.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.dge1992.ssm.domain.ConfigBean;
import com.github.dge1992.ssm.domain.Person;
import com.github.dge1992.ssm.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dong
 * @since 2018-02-08
 */
@Controller
@RequestMapping("/person")
public class PersonController extends BaseController{

    @Autowired
    private IPersonService personService;

    @Value("${my.name}")
    private String myName;

    @Autowired
    private ConfigBean configBean;

    /**
     * 添加用户
     * @return
     */
    @RequestMapping("/insertPerson")
    @ResponseBody
    public Object insertPerson(){
        Person person = new Person();
        person.setUserName("dong");
        person.setAge(12);
        person.setAddress("宁波");
        person.setSex(1);
        personService.insert(person);
        return "success";
    }

    /**
     * 查询person列表
     * @return
     */
    @RequestMapping("queryPersonList")
    @ResponseBody
    public Object queryPersonList(){
        List<Person> people = personService.selectList(new EntityWrapper<Person>());
//        return json(people);
//        return people;
        return success("大功告成").setData(people);
    }

    /**
     * 根据id查询Person
     * @param id
     * @return
     */
    @RequestMapping("queryPersonById")
    @ResponseBody
    public Object queryPersonById(@RequestParam Integer id){
        Person person = personService.selectById(id);
        return person;
//        return "hello";
    }

    /**
     * 根据UserName和age查询person
     * @return
     */
    @RequestMapping("queryPersonByUserNameAndAge/{用户名}/{年龄}")
    @ResponseBody
    public Object queryPersonByUserNameAndAge(@PathVariable String 用户名, @PathVariable Integer 年龄){
        EntityWrapper<Person> entityWrapper = new EntityWrapper<>();
        entityWrapper.where("user_name = {0}", 用户名);
        entityWrapper.where("age = {0}", 年龄);
        Person person = personService.selectOne(entityWrapper);
        return person;
    }

    @RequestMapping("addPerson")
    @ResponseBody
    public Object addPerson(Person person){
        personService.insert(person);
        return "success";
    }

    /**
     * 测试自定义属性值
     * @return
     */
    @RequestMapping("testValue")
    @ResponseBody
    public Object testValue(){
        return myName;
    }

    /**
     * 测试自定义属性映射到对象
     * @return
     */
    @RequestMapping("/testValueBean")
    @ResponseBody
    public Object testValueBean(){
        return configBean;
    }
}

