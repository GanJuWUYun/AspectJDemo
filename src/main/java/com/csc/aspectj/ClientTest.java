package com.csc.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        //定义目标对象
       // UserDao userDao = new UserDaoIpml();
        //定义切面对象
       // MyAspect myAspect = new MyAspect();
        //定义AspectJ工厂对象
       // AspectJProxyFactory factory = new AspectJProxyFactory();
        //设置目标对象
        //factory.setTarget(userDao);
        //设置切面对象
        //factory.addAspect(myAspect);
        //定义代理对象
       // UserDao proxy = factory.getProxy();
       // proxy.add();

        //不用写测试代码的方式

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserDao proxy = (UserDao) applicationContext.getBean("userDao");
        proxy.add();
    }
}
