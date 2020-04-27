package cn.bdqn.shiro;

public interface UserService {

    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    User queryUserByUserNmae(String username);

}
