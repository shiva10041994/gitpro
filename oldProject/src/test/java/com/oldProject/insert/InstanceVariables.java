package com.oldProject.insert;

public class InstanceVariables {
	
	int employeeid=4848;
	String employeename="shvia";
	
	void display() {
		System.out.println(employeeid);
		System.out.println(employeename);
//		System.out.println(employeeid);
//		System.out.println(employeename);
	}
	
	public static void main(String[] args) {
		
		InstanceVariables vi = new InstanceVariables();
		vi.display();
		
	}

}
