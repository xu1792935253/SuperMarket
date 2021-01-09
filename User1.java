package com.java.model;

public class User1 {
	private int id;
	private String userName;
	private String passWord;
	private int age;
	private String sex;
	
	
	public User1(int id, String userName, String passWord, int age, String sex) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User1() {
		super();
	}
	public User1(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
