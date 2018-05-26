package com.example.demo.nutity;

public class User {
	private int age;
	private  String name,tel;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(int age, String name, String tel) {
		super();
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", tel=" + tel + ", name=" + name + "]";
	}
	
	
}
