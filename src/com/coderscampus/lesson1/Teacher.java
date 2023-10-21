package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levalOfEducation;

	public Teacher () {
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
