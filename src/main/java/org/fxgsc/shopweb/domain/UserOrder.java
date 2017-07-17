package org.fxgsc.shopweb.domain;

import java.io.Serializable;

public class UserOrder implements Serializable {
	
	private Integer id;			// id
	private String userName;
	private Integer goodId;
	private String goodName;
	private String goodPicture;
	private String goodPrice;
	private String goodNum;
	private String userAdress; 
	private Integer orderPrice;	
	private String orderStatus;
	private String goodRemark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getGoodId() {
		return goodId;
	}
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodPicture() {
		return goodPicture;
	}
	public void setGoodPicture(String goodPicture) {
		this.goodPicture = goodPicture;
	}
	public String getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(String goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodNum() {
		return goodNum;
	}
	public void setGoodNum(String goodNum) {
		this.goodNum = goodNum;
	}
	public String getUserAdress() {
		return userAdress;
	}
	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}
	public Integer getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getGoodRemark() {
		return goodRemark;
	}
	public void setGoodRemark(String goodRemark) {
		this.goodRemark = goodRemark;
	}   
	@Override
	public String toString() {
		return "UserOrder [id=" + id + ", userName=" + userName + ", goodId=" + goodId + ", goodName=" + goodName
				+ ", goodPicture=" + goodPicture + ", goodPrice=" + goodPrice + ", goodNum=" + goodNum + ", userAdress="
				+ userAdress + ", orderPrice=" + orderPrice + ", orderStatus=" + orderStatus + ", goodRemark="
				+ goodRemark + "]";
	}
}
