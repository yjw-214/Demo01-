package cn.yxw.demo.springdatedemo.controller;

import cn.yxw.demo.springdatedemo.pojo.Student;
import cn.yxw.demo.springdatedemo.service.DateService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DateController {

    @Autowired
    private DateService dateService;

    @ResponseBody
    @RequestMapping(value = "find")
    public List<Student> findUser(){
        List<Student> byUser = dateService.findByUser();
        return byUser;
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public String add(){
        Student stu = new Student("admin","123456");
        return  dateService.AddByUser(stu);
    }
    @RequestMapping(value = "update")
    @ResponseBody
    public String update(){
        Student stu = new Student(5,"小姚","123456");
        return  dateService.UpdateUser(stu);
    }

    @RequestMapping(value = "del/{id}")
    @ResponseBody
    public String update(@PathVariable("id") int id) {
        return  dateService.DelUser(id);
    }
}
