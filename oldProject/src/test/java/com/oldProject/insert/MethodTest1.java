package com.oldProject.insert;

public class MethodTest1 {
	
	public int add(int x , int y) {
		int z = x-y;
		return z;
		
	}
	public static void main(String[] args) {
		MethodTest1 mn = new MethodTest1();
		int jat =mn.add(48, 87);
		System.out.println(jat);
	}

}
