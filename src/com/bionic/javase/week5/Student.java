package com.bionic.javase.week5;

import java.io.Serializable;

public class Student implements Serializable {
	public Student(double java, double prolog, String name) {
		super();
		this.java = java;
		this.prolog = prolog;
		this.name = name;
	}
	private double java;
	private double prolog;
	private String name;
	
	private Student() {
		System.out.println("It's alive!");
	}
	
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	public double getProlog() {
		return prolog;
	}
	public void setProlog(double prolog) {
		this.prolog = prolog;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
