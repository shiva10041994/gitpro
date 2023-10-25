package com.oldProject.insert;

public class InstanceVariables3 {
//	int mycompanyid;
//	String mycompanyname;
	
	public InstanceVariables3() {
//		int mycompanyid = 383;
//		mycompanyname = "our rules";
	}
	public InstanceVariables3(int j) {
		System.out.println("single parameteriaze");
		System.out.println(j);
	}
	public InstanceVariables3(int k,String l) {
		System.out.println("two parameteriaze");
		System.out.println(k);
		System.out.println(l);
	}
	public static void main(String[] args) {
		InstanceVariables3 dk = new InstanceVariables3();
		InstanceVariables3 dk1 =new InstanceVariables3(4848);
		InstanceVariables3 dk2 =new InstanceVariables3(73343429,"our rules");
	}
}
