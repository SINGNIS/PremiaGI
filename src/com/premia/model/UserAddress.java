package com.premia.model;

import javax.persistence.Embeddable;

@Embeddable
public class UserAddress {

	private String address1;
	private String address2;
	private Integer pincode;
	private String address3;
	private String city;
	private String state;
	private String country;

	public UserAddress() {
	}

	/*public UserAddress(String address1, String address2, Integer pincode, String address3, String city, String state,
			String country) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.country = country;
	}*/

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return address3;
	}

	public void setStreet(String address3) {
		this.address3 = address3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
