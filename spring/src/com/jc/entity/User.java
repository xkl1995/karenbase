package com.jc.entity;

public class User {
	private int  uid ;
	private String  uname ;
	private String  password ;
	private String  sex ;
	private Order order;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public User(int uid, String uname, String password, String sex, Order order) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.sex = sex;
		this.order = order;
	}
	public User(String uname, String password, String sex, Order order) {
		super();
		this.uname = uname;
		this.password = password;
		this.sex = sex;
		this.order = order;
	}
	public User() {
		super();
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", sex=" + sex + ", order=" + order
				+ "]";
	}
	
	
	

}
