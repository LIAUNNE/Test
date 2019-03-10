package com.bean;

public class CarInfo {
    private String info_model;

    private String info_type;

    @SuppressWarnings("unused")
	private String info_series;

    private String info_style;

	public CarInfo() {
		super();
	}

	public CarInfo(String info_model, String info_type, String info_series, String info_style) {
		super();
		this.info_model = info_model;
		this.info_type = info_type;
		this.info_series = info_series;
		this.info_style = info_style;
	}

	public String getInfo_model() {
		return info_model;
	}

	public String getInfo_type() {
		return info_type;
	}

	public String getInfo_series() {
		return info_series;
	}

	public String getInfo_style() {
		return info_style;
	}

	public void setInfo_model(String info_model) {
		this.info_model = info_model;
	}

	public void setInfo_type(String info_type) {
		this.info_type = info_type;
	}

	public void setInfo_series(String info_series) {
		this.info_series = info_series;
	}

	public void setInfo_style(String info_style) {
		this.info_style = info_style;
	}


}