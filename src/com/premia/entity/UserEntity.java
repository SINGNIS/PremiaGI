package com.premia.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Table;

import com.premia.model.UserAddress;

@Entity(name = "User_Details")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int user_id;
	private String user_type;
	private java.sql.Date user_joining_on;
	private String user_first_name;
	private String user_middle_name;
	private String user_last_name;
	private java.sql.Date user_dob;
	private String user_gender;
	@Embedded
	private UserAddress user_address1;
	private long user_contact1;
	private String user_occupation;
	private String user_qualification;
	private String user_maritalstatus;
	private String user_emailid;
	private String user_password;
	private String user_confirmpassword;
	private int user_experience;
	private String user_domain_id;
	private String user_sub_domain_id;

	// Following code alone is used to create "0ne to many" mapping with
	// PolicyEntity class .
	// three table will get created
	// User_details,Pgit_policy,user_details_pgit_policy
	/*
	 * @OneToMany Collection<PolicyEntity> policy =new
	 * ArrayList<PolicyEntity>();
	 * 
	 * public Collection<PolicyEntity> getPolicy() { return policy; } public
	 * void setPolicy(Collection<PolicyEntity> policy) { this.policy = policy; }
	 */

	@OneToMany(mappedBy = "user")
	private Collection<PolicyEntity> policy = new ArrayList<PolicyEntity>();
	
	@OneToMany(mappedBy = "usersec_id")
	private Collection<PolicySectionEntity> user_sections = new ArrayList<PolicySectionEntity>();

	public Collection<PolicySectionEntity> getUser_sections() {
		return user_sections;
	}

	public void setUser_sections(Collection<PolicySectionEntity> user_sections) {
		this.user_sections = user_sections;
	}

	public Collection<PolicyEntity> getPolicy() {
		return policy;
	}

	public void setPolicy(Collection<PolicyEntity> policy) {
		this.policy = policy;
	}

	public UserAddress getUser_address1() {
		return user_address1;
	}

	public void setUser_address1(UserAddress user_address1) {
		this.user_address1 = user_address1;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public java.sql.Date getUser_joining_on() {
		return user_joining_on;
	}

	public void setUser_joining_on(java.sql.Date user_joining_on) {
		this.user_joining_on = user_joining_on;
	}

	public String getUser_first_name() {
		return user_first_name;
	}

	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}

	public String getUser_middle_name() {
		return user_middle_name;
	}

	public void setUser_middle_name(String user_middle_name) {
		this.user_middle_name = user_middle_name;
	}

	public String getUser_last_name() {
		return user_last_name;
	}

	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}

	public java.sql.Date getUser_dob() {
		return user_dob;
	}

	public void setUser_dob(java.sql.Date user_dob) {
		this.user_dob = user_dob;
	}

	public long getUser_contact1() {
		return user_contact1;
	}

	public void setUser_contact1(long user_contact1) {
		this.user_contact1 = user_contact1;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_occupation() {
		return user_occupation;
	}

	public void setUser_occupation(String user_occupation) {
		this.user_occupation = user_occupation;
	}

	public String getUser_qualification() {
		return user_qualification;
	}

	public void setUser_qualification(String user_qualification) {
		this.user_qualification = user_qualification;
	}

	public String getUser_maritalstatus() {
		return user_maritalstatus;
	}

	public void setUser_maritalstatus(String user_maritalstatus) {
		this.user_maritalstatus = user_maritalstatus;
	}

	public String getUser_emailid() {
		return user_emailid;
	}

	public void setUser_emailid(String user_emailid) {
		this.user_emailid = user_emailid;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_confirmpassword() {
		return user_confirmpassword;
	}

	public void setUser_confirmpassword(String user_confirmpassword) {
		this.user_confirmpassword = user_confirmpassword;
	}

	public int getUser_experience() {
		return user_experience;
	}

	public void setUser_experience(int user_experience) {
		this.user_experience = user_experience;
	}

	public String getUser_domain_id() {
		return user_domain_id;
	}

	public void setUser_domain_id(String user_domain_id) {
		this.user_domain_id = user_domain_id;
	}

	public String getUser_sub_domain_id() {
		return user_sub_domain_id;
	}

	public void setUser_sub_domain_id(String user_sub_domain_id) {
		this.user_sub_domain_id = user_sub_domain_id;
	}
}
