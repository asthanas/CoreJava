package com.jdbcdemo;

public class Student {
	private int std_id;
	private String std_name;
	private int std_class;
	private float std_marks;
	public Student() {}
	
	public Student(int std_id, String std_name, int std_class, float std_marks ) {
		this.std_id=std_id;
		this.std_name=std_name;
		this.std_class=std_class;
		this.std_marks=std_marks;
		
	}
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public int getStd_class() {
		return std_class;
	}
	public void setStd_class(int std_class) {
		this.std_class = std_class;
	}
	public float getStd_marks() {
		return std_marks;
	}
	public void setStd_marks(float std_marks) {
		this.std_marks = std_marks;
	}
	@Override
	public String toString() {
		return "Student [" + std_id + "," + std_name + "," + std_class + ", "+ std_marks + "]";
	}
	
	

}
