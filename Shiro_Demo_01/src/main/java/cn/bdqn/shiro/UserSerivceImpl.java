package cn.bdqn.shiro;

import java.util.Date;

public class UserSerivceImpl implements UserService {
    public User queryUserByUserNmae(String username) {
        User  user = null;
        switch (username){
            case "zhangsan":
                System.out.println("aa");
                user = new User(username,"123456","张三","武汉",new Date());
            break;
            case "lisi":
                user = new User(username,"123456","李四","武汉",new Date());
                break;
            case "wangwu":
                user = new User(username,"123456","王五","武汉",new Date());
                break;
            case "zhaoliu":
                user = new User(username,"123456","赵六","武汉",new Date());
                break;
        }


        return user;
    }
}
