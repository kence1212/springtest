package com.bjsxt.spring.manager;

import com.bjsxt.spring.dao.UserDao;

public class UserManagerImpl implements UserManager {
    /**
     * 两种方式：如果这个类中需要注入对象，先建立对象属性，
     *      在写构造方法或者settet方法。
     * 
     */
    private UserDao userDao;

/*  public UserManagerImpl(UserDao userDao) {
        this.userDao = userDao;
    } */

    public void save(String username, String password) {
        this.userDao.save(username, password);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}