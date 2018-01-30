package com.bjsxt.spring.dao;

public class UserDao4OracleImpl implements UserDao {

	@Override
	public void save(String username, String password) {
		System.out.println("--------UserDao4OracleImpl.save()-------");
	}

}
