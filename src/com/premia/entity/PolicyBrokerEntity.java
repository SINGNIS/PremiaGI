package com.premia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Pgit_Pol_Broker")
public class PolicyBrokerEntity {
	@Id @GeneratedValue(strategy =GenerationType.SEQUENCE)
	private Integer pbrk_sys_id;
	private String pbrk_comm_code;
	private Double pbrk_comm_perc;
	private Double pbrk_comm_fc;
	private Double pbrk_comm_lc_1;

	@OneToOne
	@JoinColumn(name="pbrk_pol_sys_id")
	private PolicyEntity pbrk_pol_sys_id;
	

	public PolicyEntity getPbrk_pol_sys_id() {
		return pbrk_pol_sys_id;
	}

	public void setPbrk_pol_sys_id(PolicyEntity pbrk_pol_sys_id) {
		this.pbrk_pol_sys_id = pbrk_pol_sys_id;
	}

	public Integer getPbrk_sys_id() {
		return pbrk_sys_id;
	}

	public void setPbrk_sys_id(Integer pbrk_sys_id) {
		this.pbrk_sys_id = pbrk_sys_id;
	}

	public String getPbrk_comm_code() {
		return pbrk_comm_code;
	}

	public void setPbrk_comm_code(String pbrk_comm_code) {
		this.pbrk_comm_code = pbrk_comm_code;
	}

	public Double getPbrk_comm_perc() {
		return pbrk_comm_perc;
	}

	public void setPbrk_comm_perc(Double d) {
		this.pbrk_comm_perc = d;
	}

	public Double getPbrk_comm_fc() {
		return pbrk_comm_fc;
	}

	public void setPbrk_comm_fc(Double pbrk_comm_fc) {
		this.pbrk_comm_fc = pbrk_comm_fc;
	}

	public Double getPbrk_comm_lc_1() {
		return pbrk_comm_lc_1;
	}

	public void setPbrk_comm_lc_1(Double pbrk_comm_lc_1) {
		this.pbrk_comm_lc_1 = pbrk_comm_lc_1;
	}

}