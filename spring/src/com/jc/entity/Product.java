package com.jc.entity;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private Double price;
	
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public Product(String pname, Double price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	//一定要生成空的构造，一般初始化的使用
	public Product() {
		super();
	}

	
}