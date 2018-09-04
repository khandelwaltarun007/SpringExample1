package com.spring.example1;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String displayName() {
		return "Hello "+name;
	}
}
