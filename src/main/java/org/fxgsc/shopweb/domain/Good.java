package org.fxgsc.shopweb.domain;

import java.io.Serializable;

public class Good implements Serializable {
	private int id;
	private Integer goodId;			// id
	private String goodName;	// 商品名
	private Integer goodPrice;	// 商品价格
	private String goodPicture;
	private String goodPicture1;
	private String goodPicture2;// 商品图片
	private Integer goodSavenum; // 商品库存
	private String goodCategory;
	private String goodDescription;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Integer getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(Integer goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodPicture() {
		return goodPicture;
	}
	public void setGoodPicture(String goodPicture) {
		this.goodPicture = goodPicture;
	}
	public Integer getGoodSavenum() {
		return goodSavenum;
	}
	public void setGoodSavenum(Integer goodSavenum) {
		this.goodSavenum = goodSavenum;
	}
	public String getGoodCategory() {
		return goodCategory;
	}
	public void setGoodCategory(String goodCategory) {
		this.goodCategory = goodCategory;
	}
	public String getGoodDescription() {
		return goodDescription;
	}
	public void setGoodDescription(String goodDescription) {
		this.goodDescription = goodDescription;
	}
	public String getGoodPicture1() {
		return goodPicture1;
	}
	public void setGoodPicture1(String goodPicture1) {
		this.goodPicture1 = goodPicture1;
	}
	public String getGoodPicture2() {
		return goodPicture2;
	}
	public void setGoodPicture2(String goodPicture2) {
		this.goodPicture2 = goodPicture2;
	}



}
