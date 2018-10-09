package com.jc.entity;

public class Detail {
	 private int detailid;	
	 private int oid ;	
	 private int  num;	
	 private int  pid;
	public Detail(int detailid, int oid, int num, int pid) {
		super();
		this.detailid = detailid;
		this.oid = oid;
		this.num = num;
		this.pid = pid;
	}
	public Detail(int oid, int num, int pid) {
		super();
		this.oid = oid;
		this.num = num;
		this.pid = pid;
	}
	public Detail() {
		super();
	}
	public int getDetailid() {
		return detailid;
	}
	public void setDetailid(int detailid) {
		this.detailid = detailid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Detail [detailid=" + detailid + ", oid=" + oid + ", num=" + num + ", pid=" + pid + "]";
	}	
	 
	 

}
