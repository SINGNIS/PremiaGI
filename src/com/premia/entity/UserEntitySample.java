package com.premia.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Table;

@Entity (name="User_Details")
public class UserEntitySample {
	
	@Id @GeneratedValue()
	@Column (name="USER_ID")
	private int id;
	
	
	@Column (name="USER_NAME")
	private String name;
	
	//private Date dob=new Date();
	
	private String deptName;
	
	private long mobNo;
	
	/*public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}*/
	

	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return  name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
