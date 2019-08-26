package com.premia.entity;

import java.util.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "PGIT_POLICY")
public class PolicyEntity {
	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="policy_seq")
	@SequenceGenerator(name="policy_seq",initialValue=1,sequenceName="PgiPolSysId", allocationSize=256  )
	//@TableGenerator(name="policy_seq", initialValue=1, table="PGIT_POLICY", allocationSize=50,pkColumnName="PolSysId")
	//@Column(name="PolSysId" ,nullable=false ,updatable=false)
	private int PolSysId = 0;
	@Basic
	private String PolNo = "";
	@Lob
	private String PolDesctiption;
	private Double PolSum_fc = 0.0;
	private Double polSum_lc1 = 0.0;
	private Double PolPremium_fc = 0.0;
	private Double PolPremium_lc1 = 0.0;
	@Transient   // Telling java to ignore below variable
	private Double PolPremium_lc2 = 0.0;
	@Temporal(TemporalType.DATE) //telling hibernate to save only Date and ignore time 
	private Date frmdate;
	@Temporal(TemporalType.DATE)
	private Date todate;
	private Float rate;
	private String createdByUserName;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	@OneToMany(mappedBy="policysec")
	Collection<PolicySectionEntity> policysection=
	new ArrayList<PolicySectionEntity>();

	public Collection<PolicySectionEntity> getPolicysection() {
		return policysection;
	}

	public void setPolicysection(Collection<PolicySectionEntity> policysection) {
		this.policysection = policysection;
	}

	public String getPolDesctiption() {
		return PolDesctiption;
	}

	public void setPolDesctiption(String polDesctiption) {
		PolDesctiption = polDesctiption;
	}

	public String getCreatedByUserName() {
		return createdByUserName;
	}

	public void setCreatedByUserName(String createdByUserName) {
		this.createdByUserName = createdByUserName;
	}

	public int getPolSysId() {
		return PolSysId;
	}

	public void setPolSysId(int polSysId) {
		PolSysId = polSysId;
	}

	public String getPolNo() {
		return PolNo;
	}

	public void setPolNo(String polNo) {
		PolNo = polNo;
	}

	public Double getPolSum_fc() {
		return PolSum_fc;
	}

	public void setPolSum_fc(Double polSum_fc) {
		PolSum_fc = polSum_fc;
	}

	public Double getPolSum_lc1() {
		return polSum_lc1;
	}

	public void setPolSum_lc1(Double polSum_lc1) {
		this.polSum_lc1 = polSum_lc1;
	}

	public Double getPolPremium_fc() {
		return PolPremium_fc;
	}

	public void setPolPremium_fc(Double polPremium_fc) {
		PolPremium_fc = polPremium_fc;
	}

	public Double getPolPremium_lc1() {
		return PolPremium_lc1;
	}

	public void setPolPremium_lc1(Double polPremium_lc1) {
		PolPremium_lc1 = polPremium_lc1;
	}

	public Double getPolPremium_lc2() {
		return PolPremium_lc2;
	}

	public void setPolPremium_lc2(Double polPremium_lc2) {
		PolPremium_lc2 = polPremium_lc2;
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
		return createdByUserName;
	}

	public void setCreatedBy(String createdBy) {
		this.createdByUserName = createdBy;
	}
}