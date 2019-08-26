package com.premia.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Pgit_Pol_Risk_Cover")
public class PolicyRiskCoverEntity{
	@Id
	private int prc_pol_sys_id;
	private int prc_prai_sys_id;
	private String prc_div_code;
	private String prc_dept_code;
	private String prc_class_code;
	private Date prc_fm_dt;
	private Date prc_to_date;
	private long prc_cvr_si_fc;
	private long prc_cvr_si_lc_1;
	private long prc_cvr_prem_fc;
	private long prc_cvr_prem_lc_1;
	
	/*@ManyToOne
	@JoinColumn(name="prc_pol_risk_id")
	private PolicySectionEntity prc_pol_risk_id ;

	public PolicySectionEntity getPrc_pol_risk_id() {
		return prc_pol_risk_id;
	}

	public void setPrc_pol_risk_id(PolicySectionEntity prc_pol_risk_id) {
		this.prc_pol_risk_id = prc_pol_risk_id;
	}*/

	public int getPrc_pol_sys_id() {
		return prc_pol_sys_id;
	}

	public void setPrc_pol_sys_id(int prc_pol_sys_id) {
		this.prc_pol_sys_id = prc_pol_sys_id;
	}

	public int getPrc_prai_sys_id() {
		return prc_prai_sys_id;
	}

	public void setPrc_prai_sys_id(int prc_prai_sys_id) {
		this.prc_prai_sys_id = prc_prai_sys_id;
	}

	public String getPrc_div_code() {
		return prc_div_code;
	}

	public void setPrc_div_code(String prc_div_code) {
		this.prc_div_code = prc_div_code;
	}

	public String getPrc_dept_code() {
		return prc_dept_code;
	}

	public void setPrc_dept_code(String prc_dept_code) {
		this.prc_dept_code = prc_dept_code;
	}

	public String getPrc_class_code() {
		return prc_class_code;
	}

	public void setPrc_class_code(String prc_class_code) {
		this.prc_class_code = prc_class_code;
	}

	public Date getPrc_fm_dt() {
		return prc_fm_dt;
	}

	public void setPrc_fm_dt(Date prc_fm_dt) {
		this.prc_fm_dt = prc_fm_dt;
	}

	public Date getPrc_to_date() {
		return prc_to_date;
	}

	public void setPrc_to_date(Date prc_to_date) {
		this.prc_to_date = prc_to_date;
	}

	public long getPrc_cvr_si_fc() {
		return prc_cvr_si_fc;
	}

	public void setPrc_cvr_si_fc(long prc_cvr_si_fc) {
		this.prc_cvr_si_fc = prc_cvr_si_fc;
	}

	public long getPrc_cvr_si_lc_1() {
		return prc_cvr_si_lc_1;
	}

	public void setPrc_cvr_si_lc_1(long prc_cvr_si_lc_1) {
		this.prc_cvr_si_lc_1 = prc_cvr_si_lc_1;
	}

	public long getPrc_cvr_prem_fc() {
		return prc_cvr_prem_fc;
	}

	public void setPrc_cvr_prem_fc(long prc_cvr_prem_fc) {
		this.prc_cvr_prem_fc = prc_cvr_prem_fc;
	}

	public long getPrc_cvr_prem_lc_1() {
		return prc_cvr_prem_lc_1;
	}

	public void setPrc_cvr_prem_lc_1(long prc_cvr_prem_lc_1) {
		this.prc_cvr_prem_lc_1 = prc_cvr_prem_lc_1;
	}
}
