package com.oldProject.insert;

public class Operator {
	
	public static void main(String[] args) {
		
		//arithmatic operation
		
		int x = 35;
		int y = 94;
		
		System.out.println("sum of x and y is :" +(x+y));
		System.out.println("sum of x and y is :" +(x-y));
		System.out.println("sum of x and y is :" +(x*y));
		System.out.println("sum of x and y is :" +(y/x));
		
		//relation operator
		
		System.out.println(x==y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x!=y);
		
		//increament or decreament
		x =x+1;
		y = y-2;
		System.out.println(x);
		System.out.println(y);
	}

}
