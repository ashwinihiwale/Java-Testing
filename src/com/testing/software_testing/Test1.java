package com.testing.software_testing;

abstract class Demo {
	public int mark =34;
	
	public Demo(int mark) {
		super();
		this.mark = mark;
	}
	abstract void run();  //declaration
     public void test() {
    	 System.out.println("hi");
     }
}
//main class
public class Test1 extends Demo { 
	
	public Test1(int mark) {
		super(mark);
		// TODO Auto-generated constructor stub
	}

// implemention abstract class method in child class or main class using extends keyword

	@Override
	void run() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1(35);
		obj.run();
        obj.test();
        System.out.println(obj.mark);
        
	}

}
