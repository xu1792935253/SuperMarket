package com.java.model;

public class GoodsType {
	private int id;
	private String goodsType;
	private String goodsDesc;
	
	public GoodsType(String goodsType, String goodsDesc) {
		super();
		this.goodsType = goodsType;
		this.goodsDesc = goodsDesc;
	}
	
	public GoodsType() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public GoodsType(int id, String goodsType, String goodsDesc) {
		super();
		this.id = id;
		this.goodsType = goodsType;
		this.goodsDesc = goodsDesc;
	}
	
}