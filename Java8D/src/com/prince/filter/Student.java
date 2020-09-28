package com.prince.filter;

public class Student {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name; 
	
	

}
