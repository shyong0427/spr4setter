package pack.controller;

import pack.model.ShowData;

public class MyProcess { // Business Logic 역할
	private int age;
	private String name;
	private ShowData showData;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShowData(ShowData showData) {
		this.showData = showData;
	}
	
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age + ", 별명은 " + showData.dispName() + ", 잘하는 언어는 " + showData.toString();
	}
}