package cn.yxw.demo.springdatedemo.service.impl;

import cn.yxw.demo.springdatedemo.dao.DateMapper;
import cn.yxw.demo.springdatedemo.pojo.Student;
import cn.yxw.demo.springdatedemo.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateServiceImpl implements DateService {

    @Autowired
    private DateMapper dateMapper;
    @Override
    public List<Student> findByUser() {
        List<Student> byUser = dateMapper.findByUser();
        for (Student user : byUser) {
            System.out.println(user);
        }

        return byUser;
    }

    @Override
    public String AddByUser(Student student) {
        int a = dateMapper.AddByUser(student);
        if (a>0){
            System.out.println("");
            return "增加成功";
        }else {
            return "增加失败";
        }

    }

    @Override
    public String UpdateUser(Student student) {
        int a = dateMapper.UpdateUser(student);
        if(a>0){
            return "增加成功";
        }else {
            return "增加失败";
        }
    }

    @Override
    public String DelUser(Integer id) {
        int a = dateMapper.DeleteUser(id);
        if(a>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
