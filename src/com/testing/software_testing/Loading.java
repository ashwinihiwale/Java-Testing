package com.testing.software_testing;

public class Loading {
	
	public void add()
	{
		int a = 0;
		System.out.println(a);
	}
	
	public void add(int c,int b)
	{
		System.out.println(b+c);
	}
	public void add(int x,int y,int z) {
		z=x+y;
		System.out.println("Vaule of z is"  +z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Loading l=new Loading();
			l.add();
			l.add(30, 40);
			l.add(12, 34, 0);
	}

}
