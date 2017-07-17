package org.fxgsc.shopweb.domain;

import java.io.Serializable;

public class ShopCart implements Serializable {
     private Integer id;
     private String userName;
     private String goodName;
     private Integer goodId;
     private String goodPicture;
     private Integer goodPrice;
     private Integer goodNum;
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
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public Integer getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(Integer goodPrice) {
		this.goodPrice = goodPrice;
	}
	
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}
	
	public String getGoodPicture() {
		return goodPicture;
	}
	public void setGoodPicture(String goodPicture) {
		this.goodPicture = goodPicture;
	}
	
	@Override
	public String toString() {
		return "ShopCart [id=" + id + ", userName=" + userName + ", goodName=" + goodName + ", goodId=" + goodId
				+ ", goodPicture=" + goodPicture + ", goodPrice=" + goodPrice + ", goodNum=" + goodNum + "]";
	}
	public Integer getGoodNum() {
		return goodNum;
	}
	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}
	
     
}
