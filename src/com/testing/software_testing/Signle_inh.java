package com.testing.software_testing;

 
		
		class Single1st 	{
			//System.out.println("Parent child relationship");
			
			public void A(){
				System.out.println("HI I am parent class method");
			}
			
			public void B(){
				System.out.println("Hello");
			}
			
		}
	
	
	public class Signle_inh extends Single1st {
		
		public void test() {
			System.out.print("Child class method");
		}
		
		public static void test2()
		{
			System.out.println("This is staic method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Signle_inh s=new Signle_inh();
			s.A();
			s.test();
			Signle_inh.test2();//static method must have to call with the class name only
		
			
	}
 }

