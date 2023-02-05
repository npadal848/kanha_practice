package com.java.practice.oop;

abstract class AbstractClassExample {

	public String name = "Kanha";

//	Semi-Concrete/semi-implemented  class
	public abstract void m1();

	public void m2() {
		System.out.println("m2()");
	}

	public AbstractClassExample() {
		// TODO Auto-generated constructor stub
	}

	public AbstractClassExample(String name) {
		this.name = name;
	}
}

public class AbstractClassExampleTest extends AbstractClassExample {
 
	@Override
	public void m1() {
		System.out.println("AbstractClassExampleTest m2()");
	}

	public static void main(String[] args) {

		AbstractClassExampleTest abstractClassExampleTest = new AbstractClassExampleTest();
		System.out.println(abstractClassExampleTest.name);
	}
}
