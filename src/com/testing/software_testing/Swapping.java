package com.testing.software_testing;

public class Swapping {

	
	public void swap()
	{
		int S=40;
		int C=20;
		/*
		 * int r; r=S; S=C; C=r;
		 * 
		 * //QSystem.out.println(r); System.out.println(S); System.out.println(C);
		 */
		S=S+C;
		C=S-C;
		S=S-C;
		System.out.println(S);
		System.out.println(C);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping s=new Swapping();
		s.swap();
	}

}
