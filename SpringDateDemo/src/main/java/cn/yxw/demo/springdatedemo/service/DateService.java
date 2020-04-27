package cn.yxw.demo.springdatedemo.service;


import cn.yxw.demo.springdatedemo.pojo.Student;

import java.util.List;

public interface DateService {
    List<Student> findByUser();
    String AddByUser(Student student);
    String UpdateUser(Student student);
    String DelUser(Integer id);
}
