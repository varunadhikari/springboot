package com.first.model;

public class FirstModel {

	public FirstModel(String name,int id){
		this.name = name;
		this.id= id;
	}
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "FirstModel [nam=" + name + ", id=" + id + "]";
	}
	
	
}
