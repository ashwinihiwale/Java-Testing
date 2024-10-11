package com.testing.software_testing;
 abstract class A1{
	 
	 abstract void demo();
	 
	 public void fly()
	 {
		 System.out.println("i can fly");
	 }
	 
	 
 }





public class MyTest extends A1{
	
	

	@Override
	void demo() {
		// TODO Auto-generated method stub
		System.out.println("my first abstract method");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTest t=new MyTest();
		t.demo();
		t.fly();
	}

}
