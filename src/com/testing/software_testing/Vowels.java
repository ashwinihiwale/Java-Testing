package com.testing.software_testing;

public class Vowels {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String str ="ashwini";
		char  [] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' ||ch[i]=='e' || ch[i]=='u' || ch[i]=='o' || ch[i]=='i') {
				count++;
				System.out.println("vowel are :" + ch[i]);
			}
		}
       System.out.println(count);
	}

}
