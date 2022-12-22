package com.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Customer")
public class Customer {
//	customerID!: number;
//	customerName!: string;
//    customerEmail!: string;
//    customerPassword!: number;
//	customerAddress!: string;
//	customerNumber!: number;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customerID;
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	private String customerAddress;
	private String customerNumber;
	
	public Customer() {
		
	}
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Customer(long customerID, String customerName, String customerEmail, String customerPassword,
			String customerAddress, String customerNumber) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
		this.customerNumber = customerNumber;
	}
	
	

}
