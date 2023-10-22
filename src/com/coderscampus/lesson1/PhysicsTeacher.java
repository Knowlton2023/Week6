package com.coderscampus.lesson1;

public class PhysicsTeacher extends Teacher{
	
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevalOfEducation("Masters of Science");
	}

	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics");
	}

}
