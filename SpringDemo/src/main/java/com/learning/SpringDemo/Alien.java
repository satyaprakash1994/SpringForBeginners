package com.learning.SpringDemo;

public class Alien {
	
	private int age;
	
	private Laptop laptop;
	
	public int getAge() {
		System.out.println("Retriving..age value..");
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age assigned.");
		this.age = age;
	}
	public Alien() {
		System.out.println("Alien Object Created.....");
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void code() {
		System.out.println("I am coding...");
		laptop.compile();
	}
	

}
