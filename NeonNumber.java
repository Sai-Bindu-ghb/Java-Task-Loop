package com.example.program;

public class NeonNumber {
	
 public static void getNeonNumber(int num) {
	 
		int temp=num;
		int sum=0;
		int result=0;
		result=num*num;
		
		while(result!=0)
		{
			sum+=result%10;
			result=result/10;
			
		}
		System.out.println((temp==sum)?num+" is a Neon number":num+" is not a Neon Number");
 }
	public static void main(String[] args) {
			
		getNeonNumber(9);

	}

}
