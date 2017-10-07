package com.coderlong.bean;

public class Persion {
	public int age;
	public String name;
	public Persion(int age,String name){
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Persion [age=" + age + ", name=" + name + "]";
	}
	
}
