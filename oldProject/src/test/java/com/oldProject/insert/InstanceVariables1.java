package com.oldProject.insert;

public class InstanceVariables1 {
	
	int studentid;
	String studentname;
	String studentblood;
	
	void show() {
		System.out.println(studentid);
		System.out.println(studentname);
		System.out.println(studentblood);
	}
	
	public static void main(String[] args) {
		
		InstanceVariables1 vpi = new InstanceVariables1();
		vpi.studentid=4848;
		vpi.studentname = "shvia";
		vpi.studentblood = "b+ve";
		vpi.show();
		
		
		
		
		
	}

}
