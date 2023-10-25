package com.oldProject.insert;

public class MethodOverriding1 extends MethodOverriding{
	
	public void loans() {
		System.out.println("sbi loans");
	}
	public void credit() {
		System.out.println("sbi credit");
	}
	public void deposit() {
		System.out.println("sbi deposit");
	}
	public static void main(String[] args) {
		MethodOverriding me = new MethodOverriding();
		me.loans();
		me.credit();
		me.deposit();
		MethodOverriding1 ma = new MethodOverriding1();
		ma.loans();
		ma.credit();
		ma.deposit();
		
	}
}
