package com.syntax.class05;

public class Calculator {
	/*
	 * Use this method when you need to add two numbers 
	 * you need first number and second number.
	 * Returns the result of addition
	 */
	public static int add(int x, int y) {
		return x+y;
	}
	
	/*
	 * 
	 * Use this method when you need to subtract one number from another 
	 * you need first number and second number.
	 * Returns the result of subtraction
	 */
	public static int subtract(int x, int y) {
		return x-y;
	}
	
	/*
	 * 
	 * Use this method when you need to multiple two numbers 
	 * you need first number and second number.
	 * Returns the result of multiplication
	 */
	public static int multiply(int x, int y) {
		return x*y;
	}
	
	/*
	 * 
	 * Use this method when you need to divide one number by another 
	 * you need first number and second number.
	 * Returns the result of division
	 */
	public static void divide(int x, int y) {
		
	}
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		System.out.println(Calculator.add(2, 4));
		
		System.out.println(Calculator.subtract(10, 5));
		
		System.out.println(Calculator.multiply(12, 11));
		
		
		
		
	}

}
