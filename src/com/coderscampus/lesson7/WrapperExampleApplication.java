package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {
		/**
		 * byte		-> Byte
		 * short	-> Short
		 * int		-> Integer
		 * float	-> Float
		 * double	-> Double
		 * char		-> Character
		 * boolean	-> Boolean
		 * 
		 **/
		
		int primitiveInt = 9;
		Integer wrapperInt = 9;  // auto-boxing

		String someNumber = "123";
		String someOtherNumber = "456";
		System.out.println(someNumber + someOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(someOtherNumber));
		
		Integer anotherIntWrapper = Integer.valueOf(9);

	}

}
