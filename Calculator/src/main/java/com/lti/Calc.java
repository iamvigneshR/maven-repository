package com.lti;

public class Calc {
	
	public static int add(int num1, int num2)
	{
		return num1+num2;
	}
	
	public static int sub(int num1, int num2)
	{
		return num1-num2;
	}
	
	public static int pro(int num1, int num2)
	{
		return num1*num2;
	}

	public static int div(int num1, int num2)
	{
		return num2/num1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ADDITION = " + add(10,20));
		System.out.println("DIFFERENCE = " + sub(10,20));
		System.out.println("Product = " + pro(10,20));
		System.out.println("division = " + div(10,20));
	}

}
