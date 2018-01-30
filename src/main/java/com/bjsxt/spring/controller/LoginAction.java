package com.bjsxt.spring.controller;

import com.bjsxt.spring.dao.UserDao;

public class LoginAction {
	/**
	 * 1 setter 注入
	 * */
	private UserDao userDao;
	
	public void setuserDao(UserDao userDao){
		this.userDao = userDao ;
	}
}
