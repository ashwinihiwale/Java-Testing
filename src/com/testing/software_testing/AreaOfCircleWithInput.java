package com.testing.software_testing;

import java.util.Scanner;

public class AreaOfCircleWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area;
		int radius;
		float pie;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius");
		radius = sc.nextInt();
		System.out.println("Enter the value of pie");
		pie = sc.nextFloat();
		area=pie*radius*radius;
		System.out.println(area);
	}

}
