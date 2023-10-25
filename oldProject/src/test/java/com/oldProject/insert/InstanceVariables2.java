package com.oldProject.insert;

public class InstanceVariables2 {
	
	int employeeid;
	String employeename;
	
	//default variables 
	public InstanceVariables2() {
//		System.out.println(employeeid);
//		System.out.println(employeename);
	}
	public InstanceVariables2(int x , String y) {
		employeeid =x;
		employeename = y;
//		System.out.println(employeeid);
//		System.out.println(employeename);
	}
	void show() {
		System.out.println(employeeid);
		System.out.println(employeename);
	}
	public static void main(String[] args) {
		
		InstanceVariables2 pe = new InstanceVariables2();
		InstanceVariables2 pe1 = new InstanceVariables2(47476,"raju");
		pe.show();
		pe1.show();
		
	}
}
