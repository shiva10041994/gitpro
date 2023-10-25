package com.oldProject.insert;

public class IfElseHiggestNumber {

	public static void main(String[] args) {

		int x = 9300;
		int y = 800;
		int z = 30080;
		int t = 8244;
		

		if(x>y & x>z & x>t) {
			System.out.println("x is a higgest number");
		}
		else if(y>z & y>t) {
			System.out.println("y is a higgest number");
		}
		else if (z>t){
			System.out.println("z is a higgest number");
		}
		else {
			System.out.println("t is a higgest number");
		}
	}

}
