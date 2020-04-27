package cn.bdqn.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;


import java.lang.reflect.Array;
import java.util.*;

/**
 * 用户认证
 */
public class TestApp {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String username="zhangsan";

        String password="123456";

        //1.创建一个安全管理器的工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //2. 从工厂里面得到SecurityManager
        DefaultSecurityManager securityManager = (DefaultSecurityManager) factory.getInstance();

        Realm realm = new UserRealm();
        securityManager.setRealm(realm);
        //3. 把当前的securityManager绑定到当前线程
        SecurityUtils.setSecurityManager(securityManager);
        //4.取出当前的Subject
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        //6. 进行认证

        try{
            subject.login(token);
            System.out.println("是否认证成功"+subject.isAuthenticated());
        }catch (AuthenticationException e){
            System.out.println("用户名或者密码出错");

        }
















        /*//判断用户是否有某些权限
        boolean role1 = subject.hasRole("role2");
        System.out.println(username="是否有role1的权限"+role1);
        //2.判断用户是否同时拥有集合里的所有角色
        List<String> roleIdentifiers = new ArrayList<String>();
        roleIdentifiers.add("role1");
        roleIdentifiers.add("role2");
        roleIdentifiers.add("role3");
        boolean b = subject.hasAllRoles(roleIdentifiers);
        System.out.println(b);


        //判断用户是否有集合里面的角色
        boolean[] hasRoles = subject.hasRoles(roleIdentifiers);
        System.out.println(Arrays.toString(hasRoles));

        //4.权限判断是否有某一个权限
        boolean permitted = subject.isPermitted("user:query");
        System.out.println(username+"是否有user:query的权限:"+permitted );
        //5.分别判断用户是否有数组里面的权限
        String[] permissions = {"user:query","user:add","user:xxx"};
        boolean[] permitted2 = subject.isPermitted(permissions);
        System.out.println("分别判断用户是否有数组里面的权限"+Arrays.toString(permitted2));
        //6.判断用户是否有数组里面的所有权限
        boolean permitted1 = subject.isPermittedAll(permissions);
        System.out.println("判断用户是否有数组里面的所有权限"+permitted1);
        //7.
        boolean permitted3 = subject.isPermitted("user :*");
        System.out.println(permitted3);
*/
    }
}
