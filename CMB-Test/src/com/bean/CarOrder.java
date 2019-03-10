package com.bean;

public class CarOrder {
	
    private Integer user_id;
    
    private Integer order_id;

    private String order_model;

    private Double product_money;

    private String product_agency;

	public CarOrder() {
		super();
	}

	public CarOrder(Integer user_id,Integer order_id,  String order_model, Double product_money, String product_agency) {
		super();
		this.user_id = user_id;
		this.order_id = order_id;
		this.order_model = order_model;
		this.product_money = product_money;
		this.product_agency = product_agency;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public String getOrder_model() {
		return order_model;
	}

	public Double getProduct_money() {
		return product_money;
	}

	public String getProduct_agency() {
		return product_agency;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public void setOrder_model(String order_model) {
		this.order_model = order_model;
	}

	public void setProduct_money(Double product_money) {
		this.product_money = product_money;
	}

	public void setProduct_agency(String product_agency) {
		this.product_agency = product_agency;
	}


}