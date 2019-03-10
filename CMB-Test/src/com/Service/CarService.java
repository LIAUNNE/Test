package com.Service;

import java.util.List;

import com.bean.CarConfig;
import com.bean.CarOrder;
import com.bean.ProductInfo;

public interface CarService {
	//返回车辆配置信息
	CarConfig carconfig(String model);
	//显示库存量
	ProductInfo storage(String model);
	//生成订单
	int createOrder(CarOrder order);
	//列出用户订单
	CarOrder selectOrder(int order_id);
}
