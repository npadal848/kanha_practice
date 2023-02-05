package com.java.practice.oop;

class ClassExample{
	
	//Concrete/fully implemented  class
	
	public String name="Kanha";

	public void m1() {
		System.out.println("ClassExample.m1() ");
	}

	public void m2() {
		System.out.println(" m2() ");
	}
	
	public ClassExample() {
	}

}

public class TestClassExample extends ClassExample {
	
	@Override
	public void m1() {
		System.out.println("TestClassExample.m1() ");
	}
	
	public static void main(String[] args) {
		ClassExample classExample = new ClassExample(); //super class object
		TestClassExample testClassExample = new TestClassExample(); //sub class object
		
		System.out.println(classExample.name);
		System.out.println(testClassExample.name);
	}
	
}


