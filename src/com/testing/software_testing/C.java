package com.testing.software_testing;

class A{
	int a;
	static int  v=2;
	public int add(int a,int b) {
		int c=a+b;
		System.out.println(c+ " " +v);
		return c;
	} 
}

class B extends A {
	void Test() {
	System.out.println("Test");
}
}
public class C extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.add(20, 90);
		c.Test();
	}

}
