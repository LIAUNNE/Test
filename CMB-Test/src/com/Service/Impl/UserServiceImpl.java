package com.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.Service.UserService;
import com.bean.CarConfig;
import com.bean.User;
import com.dao.IUserDao;

public class UserServiceImpl implements UserService {
	private IUserDao dao;
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	@Override
	public int register(User user) {
		int count = dao.insertUser(user);
		return count;
	}
	@Override
	public String Login(String username, String password) {
		String name = dao.selectUserByIdentity(username,password);
		return name;
	}
	@Override
	public int CheckUsername(String username) {
		username = dao.selectUser(username);
		if(username!=null&&username!="") {
			return 0;
		}
		return 1;
	}
	@Override
	public int SelectUserId(String username) {
		int id = dao.selectUserId(username);
		return id;
	}
	
}
