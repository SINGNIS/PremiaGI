package com.premia.model;

import java.util.*;

public class Policy {
	private Integer PolSysId = 0;
	private String PolNo = "";
	private Double PolSum = 0.0;
	private Double PolPremium = 0.0;
	private Date frmdate;
	private Date todate;
	private Float rate;
	private String createdBy;

	public Integer getPolSysId() {
		return PolSysId;
	}

	public void setPolSysId(Integer polSysId) {
		PolSysId = polSysId;
	}

	public String getPolNo() {
		return PolNo;
	}

	public void setPolNo(String polNo) {
		PolNo = polNo;
	}

	public Double getPolSum() {
		return PolSum;
	}

	public void setPolSum(Double polSum) {
		PolSum = polSum;
	}

	public Double getPolPremium() {
		return PolPremium;
	}

	public void setPolPremium(Double polPremium) {
		PolPremium = polPremium;
	}

	public Date getFrmdate() {
		return frmdate;
	}

	public void setFrmdate(Date frmdate) {
		this.frmdate = frmdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}