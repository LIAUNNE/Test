package com.dao;

import java.util.List;

import com.bean.CarConfig;
import com.bean.User;

public interface IUserDao {
	//查询用户返回用户名
	String selectUserByIdentity(String username, String password);
	//添加用户
	int insertUser(User user);
	//查找用户
	String selectUser(String username);
	//查询用户id
	int selectUserId(String username);
}
