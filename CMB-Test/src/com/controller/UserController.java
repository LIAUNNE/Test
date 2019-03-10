package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Service.UserService;
import com.bean.User;

@Controller
@RequestMapping("/User")
public class UserController{
	@Autowired
	private UserService service;
	
	@RequestMapping("/addUser.do")
	public void addUser(@RequestParam String username,
			@RequestParam String password,
			@RequestParam String name,
			@RequestParam String phone,
			@RequestParam String email,
			HttpServletResponse response) throws IOException {
		User user = new User(name,username,password,phone,email);
		System.out.println(username);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(service.CheckUsername(username)==1) {
			service.register(user);
			System.out.println("注册成功");
			out.print("<script type='application/javascript'>alert('注册成功');window.location.href='http://localhost:8080/CMB-Test/login.html'</script>");
		}else {
			out.print("<script type='application/javascript'>alert('用户名已存在');window.location.href='http://localhost:8080/CMB-Test/regist.html'</script>");
			System.out.println("注册失败");
		}
	}
	
	@RequestMapping("/Login.do")
	public String Login(@RequestParam String username,@RequestParam String password,HttpServletRequest request) {
		String name = service.Login(username, password);
		if(name!=null&&name!="") {
			System.out.println("登录成功");
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("username", username);
			return "redirect:../main.html";
		}else {
			System.out.println("登录失败");
		}
		return "redirect:../login.html";
	}
	@RequestMapping("/Check.do")
	public void CheckLogin(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		PrintWriter out = response.getWriter();
		if(name!=null&&name!="") {
			System.out.println("true");
			out.print("{\"status\":true}");
		}else {
			System.out.println("false");
			out.print("{\"status\":false}");
		}
	}
	
	@RequestMapping("/out.do")
	public void LoginOut(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("name");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = (String) session.getAttribute("name");
		PrintWriter out = response.getWriter();
		if(name!=null&&name!="") {
			out.print("false");
		}else {
			out.print("<script type='application/javascript'>alert('退出成功');window.location.href='../main.html'</script>");
		}
	}
}
