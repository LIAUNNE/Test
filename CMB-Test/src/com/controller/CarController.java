package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Service.CarService;
import com.Service.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bean.CarConfig;
import com.bean.CarOrder;
import com.bean.ProductInfo;

@Controller
@RequestMapping("/Car")
public class CarController {
	@Autowired
	private CarService service ;
	@Autowired
	private UserService userservice;
	
	//返回车辆配置信息
	@RequestMapping("/carconfig.do")
	@ResponseBody
	public CarConfig SelectCarConfig(String info_model) {
//		System.out.println(info_model);
		info_model = info_model.substring(1, info_model.length()-1);
		CarConfig config = service.carconfig(info_model);
//		System.out.println("1111111111");
		return config;
	}
	//返回库存量
	@RequestMapping("/carpay.do")
	@ResponseBody
	public ProductInfo SelectStorage(String info_model) {
		ProductInfo product = service.storage(info_model);
		return product;
	}
	@RequestMapping("/carorder.do")
	@ResponseBody
	public CarOrder CreateOrder(@RequestParam String info_model,HttpServletRequest request) throws IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String name = (String) session.getAttribute("name");
		if(name==null||name=="") {
			CarOrder order = new CarOrder(0,0," ",100.0,"1");
			return order;
		}else {
		int user_id = userservice.SelectUserId(username);
		ProductInfo product = service.storage(info_model);
		Date curDate = new Date();
		long d = curDate.getTime()/10000;
		CarOrder order = new CarOrder(user_id,(int)d,info_model,product.getProduct_money(),"1");
		service.createOrder(order);
		return service.selectOrder((int)d);
		}
	}
}
