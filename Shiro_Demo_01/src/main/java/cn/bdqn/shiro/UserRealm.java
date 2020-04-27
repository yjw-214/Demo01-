package cn.bdqn.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Arrays;

public class UserRealm extends AuthorizingRealm {

    public  String getName(){
        // 获取类名
        return this.getClass().getSimpleName();
    }

    private  UserService userService = new UserSerivceImpl();

    /**
     * 完成认证的方法
     * @return
     * @throws AuthenticationException
     */

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = token.getPrincipal().toString();
        Object credentials = token.getCredentials();
        System.out.println(Arrays.toString((char[]) credentials ));
        //根据用户名查询用户是否存在
        User user = this.userService.queryUserByUserNmae(username);

        if (null!=user){
            //匹配密码
            /**
             * 参数1  用户身份
             * 参数2  用户在数据库里的密码
             * 参数3  当前类名
             */
             SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username,user.getPassword(),this.getName());


            return info;
        }



        return null;
    }

    /*
    授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权测试");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //添加角色
        info.addRole("role1");
        info.addRole("role2");
        info.addRole("role3");

        info.addStringPermission("user:query");
        info.addStringPermission("user:update");
        info.addStringPermission("user:delete");
        info.addStringPermission("user:add");

        return info;
    }
}
