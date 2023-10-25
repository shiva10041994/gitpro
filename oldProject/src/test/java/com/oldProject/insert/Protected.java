package com.oldProject.insert;

public class Protected {
	
	protected int s = 484;
	protected String n = "is";
	
	protected void show () {
		System.out.println(s+n);
	}
	public static void main(String[] args) {
		
		Protected pe = new Protected();
		pe.show();
	}
}