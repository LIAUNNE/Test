package com.dao;

import java.util.List;

import com.bean.CarConfig;
import com.bean.CarOrder;
import com.bean.ProductInfo;

public interface ICarDao {
	//查询车辆配置信息
	CarConfig selectCarConfigByModel(String model);
	//查询库存表
	ProductInfo selectProductByModel(String model);
	//查询用户订单
	CarOrder selectOrderById(int user_id);
	//添加订单
	int createOrder(CarOrder order);
}
