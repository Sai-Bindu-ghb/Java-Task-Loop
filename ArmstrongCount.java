package com.example.program;

public class ArmstrongCount {

	
	public static void getArmstrong(int num) {
		int temp=num;
		int count=0;
		int sum=0;
		if(num<0) 
		   System.out.println("Invalid Input");
		while(num!=0)
		{
			int rem=num%10;
			sum +=rem*rem*rem;
			num/=10;
			count++;	
		}
		System.out.println((temp==sum)?temp+" is Armstrong":temp+" is Not armstrong");
		
	}
	public static void main(String[] args) {
		getArmstrong(153);

	}

}
