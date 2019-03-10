package com.bean;

public class ProductInfo {
    private String product_name;

    private String info_model;

    private Double product_money;

    private Integer product_storage;

	public ProductInfo() {
		super();
	}

	public ProductInfo(String product_name, String info_model, Double product_money, Integer purduct_storage) {
		super();
		this.product_name = product_name;
		this.info_model = info_model;
		this.product_money = product_money;
		this.product_storage = purduct_storage;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getInfo_model() {
		return info_model;
	}

	public Double getProduct_money() {
		return product_money;
	}

	public Integer getProduct_storage() {
		return product_storage;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setInfo_model(String info_model) {
		this.info_model = info_model;
	}

	public void setProduct_money(Double product_money) {
		this.product_money = product_money;
	}

	public void setProduct_storage(Integer purduct_storage) {
		this.product_storage = purduct_storage;
	}

}