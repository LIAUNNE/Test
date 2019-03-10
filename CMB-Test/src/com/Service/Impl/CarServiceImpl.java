package com.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Service.CarService;
import com.bean.CarConfig;
import com.bean.CarOrder;
import com.bean.ProductInfo;
import com.dao.ICarDao;
import com.dao.IUserDao;

public class CarServiceImpl implements CarService {
	private ICarDao dao;
	public void setDao(ICarDao dao) {
		this.dao = dao;
	}

	@Override
	public CarConfig carconfig(String model) {
		CarConfig Carconfig = new CarConfig();
		Carconfig = dao.selectCarConfigByModel(model);
		return Carconfig;
	}

	@Override
	public ProductInfo storage(String model) {
		ProductInfo productinfo = dao.selectProductByModel(model);
		return productinfo;
	}

	@Override
	public int createOrder(CarOrder order) {
		int check = dao.createOrder(order);
		return 1;
	}

	@Override
	public CarOrder selectOrder(int order_id) {
		CarOrder order = dao.selectOrderById(order_id);
		return order;
	}
	
}
