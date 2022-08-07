package com.csc.aspectj;

import org.springframework.stereotype.Repository;

//目标类
@Repository("userDao")
public class UserDaoIpml implements  UserDao{

    @Override
    public void add() {
        System.out.println("这是添加方法");
        //int i = 1/0;
    }
}
