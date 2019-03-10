package com.Service;

import com.bean.User;

import java.util.List;

import com.bean.CarConfig;

public interface UserService {
	//注册
	int register(User user);
	//登陆
	String Login(String username,String password);
	//判断用户名是否存在
	int CheckUsername(String username);
	//获取用户id
	int SelectUserId(String username);
}
