package com.testing.software_testing;

public class oddNum {
		int a=5;
		void odd()
		{
			if(a%2==0)
			{
				System.out.println("number is odd");
			}
			else {
				System.out.println("number is not odd");
			}

		}

		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddNum od=new oddNum();
		od.odd();
	}
}
