package com.zigma.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {



		
		private int CRN;
		private String name;
		private String address;
		private String emailId;
		private String mobileNo;
		private LocalDateTime logoutTime;
		private int tPin;
		private String password;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cRN, String name, String address, String emailId, String mobileNo, LocalDateTime logoutTime,
			int tPin, String password) {
		super();
		CRN = cRN;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.logoutTime = logoutTime;
		this.tPin = tPin;
		this.password = password;
	}

	public int getCRN() {
		return CRN;
	}

	public void setCRN(int cRN) {
		CRN = cRN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDateTime getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(LocalDateTime logoutTime) {
		this.logoutTime = logoutTime;
	}

	public int gettPin() {
		return tPin;
	}

	public void settPin(int tPin) {
		this.tPin = tPin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [CRN=" + CRN + ", name=" + name + ", address=" + address + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", logoutTime=" + logoutTime + ", tPin=" + tPin + ", password=" + password
				+ "]";
	}


}





	
