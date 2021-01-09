package com.java.model;

public class Goods {
	private int id;//���
	private String goodsName; //��Ʒ��
	private float price; //�۸�
	private String goodsType;//��Ʒ���
	private int number;  //����
	
	public Goods(int id, String goodsName, float price, String goodsType, int number) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.price = price;
		this.goodsType = goodsType;
		this.number = number;
	}
	
	public Goods(String goodsName, float price, String goodsType, int number) {
		super();
		this.goodsName = goodsName;
		this.price = price;
		this.goodsType = goodsType;
		this.number = number;
	}

	public Goods() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
