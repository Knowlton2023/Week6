package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levalOfEducation;
	
	private void giveARaise () {
		System.out.println("Teacher gets a raise!");
	}
	
	public void teach () {
		System.out.println("I'm a teacher and I'm now teaching");
	}

	public Teacher () {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assigned";
		this.levalOfEducation = "No education assigned";
	}

	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getLevalOfEducation() {
		return levalOfEducation;
	}
	public void setLevalOfEducation(String levalOfEducation) {
		this.levalOfEducation = levalOfEducation;
	}

}
