package com.oldProject.insert;

public class MethodOverloadding {
	
	public void me() {
		System.out.println("default MethodOverloadding");
	}
	public void me(int k) {
		System.out.println("single MethodOverloadding");
		System.out.println(k);
	}
	public void me(int j, int l) {
		System.out.println("double parameter MethodOverloadding");
		System.out.println(j+l);
	}
	public static void main(String[] args) {
		MethodOverloadding ma = new MethodOverloadding();
		ma.me();
		ma.me(67);
		ma.me(89, 98);
	}
}
