package com.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Service.CarService;
import com.Service.UserService;
import com.bean.CarConfig;
import com.bean.CarOrder;
import com.bean.User;
import com.dao.ICarDao;
import com.dao.IUserDao;

public class Mytest {
	private SqlSession sqlSession;
	private IUserDao dao1;
	private ICarDao dao;
	private UserService service;
	private CarService carservice;
	@Before
	public void before() {
		String resources = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resources);
		service = (UserService)context.getBean("UserService");
		carservice = (CarService) context.getBean("CarService");
	}
	
	/*public void test01() {
		Student stu = new Student(1,"LJJ",21,100);
		dao.insertStu(stu);
	}*/
	
	public void test02() {
		User user = new User("ljj","123","123","123","123");
		if(service.CheckUsername(user.getUsername())==1) {
			service.register(user);
		}else {
		System.out.println("用户名已存在");
		}
	}
	
	public void test03() {
		String name = service.Login("123", "123");
		System.out.println(name);
	}
	
	public void test04() {
		CarConfig carconfig = carservice.carconfig("S 320 L");
		System.out.println(carconfig.toString());
	}
	/*@Test
	public void test05() {
		CarOrder order = new CarOrder(9,"A 180",100.35,"1");
		int i = carservice.createOrder(order);
		System.out.println(i);
	}*/
}
