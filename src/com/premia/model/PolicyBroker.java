package com.premia.model;

public class PolicyBroker {
	private Integer pbrk_sys_id;
	private String pbrk_comm_code;
	private Float pbrk_comm_perc;
	private Double pbrk_comm_fc;
	private Double pbrk_comm_lc_1;

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

	public Float getPbrk_comm_perc() {
		return pbrk_comm_perc;
	}

	public void setPbrk_comm_perc(Float pbrk_comm_perc) {
		this.pbrk_comm_perc = pbrk_comm_perc;
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