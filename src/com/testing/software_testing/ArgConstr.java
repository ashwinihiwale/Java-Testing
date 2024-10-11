package com.testing.software_testing;

public class ArgConstr {
	
		int x;
		int y;
		
		public ArgConstr(int a, int b)
		{
			x=b;
			y=a;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgConstr ac=new ArgConstr(13,15);
		System.out.println(ac.x);
		System.out.println(ac.y);
		
		
	}

}
