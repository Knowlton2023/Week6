package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compsci.CompSciTeacher;
import com.coderscampus.lesson1.phys.PhysicsTeacher;
import com.coderscampus.lesson1.qphy.QuantumPhysicsTeacher;

public class Lesson1Application {

	// Access modifiers in Java are: public, protected, package, private
	public static void main(String[] args) {
		PackageAccessModifierExample example = new PackageAccessModifierExample();
		System.out.println(example.someValue);
		System.out.println("----");
		
		Teacher physicsTeacher = new PhysicsTeacher();
		
		// This is an alternative way of casting, but it's more verbose
//		PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;
//		castedPhysicsTeacher.teach("Trevor Page");
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevalOfEducation());
		((PhysicsTeacher)physicsTeacher).teach("Trevor Page");
		((PhysicsTeacher)physicsTeacher).markPapers();
		System.out.println("----");

		Teacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevalOfEducation());
		compSciTeacher.teach(36);
		System.out.println("----");
		
		Teacher quantumTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantumTeacher.getClasses());
		System.out.println(quantumTeacher.getLevalOfEducation());
		quantumTeacher.teach();
		System.out.println("----");
	}

}
