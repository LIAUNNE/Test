package com.bean;

public class Agency {
	private String agency_name;
	private String agency_addr;
	private String agency_phone;
	public Agency() {
		super();
	}
	public Agency(String agency_name, String agency_addr, String agency_phone) {
		super();
		this.agency_name = agency_name;
		this.agency_addr = agency_addr;
		this.agency_phone = agency_phone;
	}
	public String getAgency_name() {
		return agency_name;
	}
	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}
	public String getAgency_addr() {
		return agency_addr;
	}
	public void setAgency_addr(String agency_addr) {
		this.agency_addr = agency_addr;
	}
	public String getAgency_phone() {
		return agency_phone;
	}
	public void setAgency_phone(String agency_phone) {
		this.agency_phone = agency_phone;
	}
	
}
