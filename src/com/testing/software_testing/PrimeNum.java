package com.testing.software_testing;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1;i<=10;i++) { if(i%2==1) { System.out.println(i); } }
		 * 
		 * for(int i=1;i<=50;i++) { if(i%2==1) { System.out.println("Prime numbers are "
		 * +i); } }
		 */
		
		for(int i=100;i>=50;i--)
		{
			if(i%2==1)
			{
				System.out.println("Prime numbers are " +i);
			}
		}
	}

}
