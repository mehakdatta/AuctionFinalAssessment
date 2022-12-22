package com.project1.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Seller")
public class Seller {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long sellerID;
	
	//@Column(name="SellerName",nullable=false)
	private String sellerName;
	//@Column(name="SellerEmail",nullable=false)
	private String sellerEmail;
	//@Column(name="SellerPassword",nullable=false)
	//private String sellerPassword;
	
	//@Column(name="Address",nullable=false)
	private String sellerAddress;
	
	//@Column(name="SellerNumber",nullable=false)
	private long sellerNumber;
	private String productID;
	private String productName;
	private String productDescription;
	private long productStartamt;
	private long productPrice;
	private String productBiddingdate;
	private String productCategory;
	public Seller() {
		
	}
	public long getSellerID() {
		return sellerID;
	}
	public void setSellerID(long sellerID) {
		this.sellerID = sellerID;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	
public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	//	public String getSellerPassword() {
//		return sellerPassword;
//	}
//	public void setSellerPassword(String sellerPassword) {
//		this.sellerPassword = sellerPassword;
//	}
	public String getSellerAddress() {
		return sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public long getSellerNumber() {
		return sellerNumber;
	}
	public void setSellerNumber(long sellerNumber) {
		this.sellerNumber = sellerNumber;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public long getProductStartamt() {
		return productStartamt;
	}
	public void setProductStartamt(long productStartamt) {
		this.productStartamt = productStartamt;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductBiddingdate() {
		return productBiddingdate;
	}
	public void setProductBiddingdate(String productBiddingdate) {
		this.productBiddingdate = productBiddingdate;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Seller(long sellerID, String sellerName, String sellerEmail, String sellerAddress, long sellerNumber,
			String productID, String productName, String productDescription, long productStartamt, long productPrice,
			String productBiddingdate, String productCategory) {
		super();
		this.sellerID = sellerID;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerAddress = sellerAddress;
		this.sellerNumber = sellerNumber;
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productStartamt = productStartamt;
		this.productPrice = productPrice;
		this.productBiddingdate = productBiddingdate;
		this.productCategory = productCategory;
	}
	
	
	
	
	


}
