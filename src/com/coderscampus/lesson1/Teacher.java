package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levalOfEducation;
	protected int totalNumberOfMarkedPapers;
	
	protected void markPapers () {
		System.out.println("I'm a teacher and I'm now marking papers.");
	}
	
	private void giveARaise () {
		System.out.println("Teacher gets a raise!");
	}
	
	public void teach () {
		System.out.println("I'm a teacher and I'm now teaching");
	}


	public void teach (String teacherName, int age) {
		System.out.println("I'm a " + age + " year old teacher called " + teacherName + " and I'm now teaching");
	}

	public void teach (int age) {
		System.out.println("I'm a " + age + " year old teacher and I'm now teaching");
	}

	
	public Teacher () {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assigned";
		this.levalOfEducation = "No education assigned";
		this.giveARaise();
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
