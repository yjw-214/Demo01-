package cn.yxw.demo.springdatedemo.dao;



import cn.yxw.demo.springdatedemo.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DateMapper {
    //查询所有
    List<Student> findByUser();
    // 增加
    int AddByUser(Student student);
    // 更新
    int UpdateUser(Student student);
    //  删除
    int DeleteUser(@Param("id")Integer id);

    int  a(int a);

    public  enum aa{
       a,b,c
    }

    

}
