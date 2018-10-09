package com.jc.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int oid;
	private int uid ;
	private String createtime ;
	private String address ;
	private List<Detail> details = new ArrayList<Detail>();
	public List<Detail> getDetails() {
		return details;
	}
	public void setDetails(List<Detail> details) {
		this.details = details;
	}
	
	public Order(int oid, int uid, String createtime, String address, List<Detail> details) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.createtime = createtime;
		this.address = address;
		this.details = details;
	}
	public Order(int uid, String createtime, String address, List<Detail> details) {
		super();
		this.uid = uid;
		this.createtime = createtime;
		this.address = address;
		this.details = details;
	}
	public Order() {
		super();
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", uid=" + uid + ", createtime=" + createtime + ", address=" + address
				+ ", details=" + details + "]";
	}
	
	
	
}
