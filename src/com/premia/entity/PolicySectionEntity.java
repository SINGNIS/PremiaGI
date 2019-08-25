package com.premia.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pgit_Pol_Section")
public class PolicySectionEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private Integer ps_sys_id;
	//private Integer ps_pol_sys_id;
	//private String ps_pol_no;
	private String ps_div_code;
	private String ps_dept_code;
	private String ps_class_code;
	private Date ps_fm_dt;
	private Date ps_to_date;
	private Double ps_tot_si_fc;
	private Double ps_tot_si_lc_1;
	private Double ps_tot_prem_fc;
	private Double ps_tot_prem_lc_1;
	
	@ManyToOne
	private PolicyEntity policysec;

	public PolicyEntity getPolicy() {
		return policysec;
	}

	public void setPolicy(PolicyEntity policysec) {
		this.policysec = policysec;
	}

	/*public Integer getPs_pol_sys_id() {
		return ps_pol_sys_id;
	}

	public void setPs_pol_sys_id(Integer ps_pol_sys_id) {
		this.ps_pol_sys_id = ps_pol_sys_id;
	}

	public String getPs_pol_no() {
		return ps_pol_no;
	}

	public void setPs_pol_no(String ps_pol_no) {
		this.ps_pol_no = ps_pol_no;
	}*/

	public String getPs_div_code() {
		return ps_div_code;
	}

	public void setPs_div_code(String ps_div_code) {
		this.ps_div_code = ps_div_code;
	}

	public String getPs_dept_code() {
		return ps_dept_code;
	}

	public void setPs_dept_code(String ps_dept_code) {
		this.ps_dept_code = ps_dept_code;
	}

	public String getPs_class_code() {
		return ps_class_code;
	}

	public void setPs_class_code(String ps_class_code) {
		this.ps_class_code = ps_class_code;
	}

	public Date getPs_fm_dt() {
		return ps_fm_dt;
	}

	public void setPs_fm_dt(Date ps_fm_dt) {
		this.ps_fm_dt = ps_fm_dt;
	}

	public Date getPs_to_date() {
		return ps_to_date;
	}

	public void setPs_to_date(Date ps_to_date) {
		this.ps_to_date = ps_to_date;
	}

	public Double getPs_tot_si_fc() {
		return ps_tot_si_fc;
	}

	public void setPs_tot_si_fc(Double ps_tot_si_fc) {
		this.ps_tot_si_fc = ps_tot_si_fc;
	}

	public Double getPs_tot_si_lc_1() {
		return ps_tot_si_lc_1;
	}

	public void setPs_tot_si_lc_1(Double ps_tot_si_lc_1) {
		this.ps_tot_si_lc_1 = ps_tot_si_lc_1;
	}

	public Double getPs_tot_prem_fc() {
		return ps_tot_prem_fc;
	}

	public void setPs_tot_prem_fc(Double ps_tot_prem_fc) {
		this.ps_tot_prem_fc = ps_tot_prem_fc;
	}

	public Double getPs_tot_prem_lc_1() {
		return ps_tot_prem_lc_1;
	}

	public void setPs_tot_prem_lc_1(Double ps_tot_prem_lc_1) {
		this.ps_tot_prem_lc_1 = ps_tot_prem_lc_1;
	}

}