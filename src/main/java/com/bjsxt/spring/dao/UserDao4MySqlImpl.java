package com.bjsxt.spring.dao;

public class UserDao4MySqlImpl implements UserDao {

	@Override
	public void save(String username, String password) {
		System.out.println("--------UserDao4MySqlImpl.save()-------");
	}

}
