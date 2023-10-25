package com.oldProject.insert;

public class Sbi1 extends NewBank1 {
	
	public void bava() {
		System.out.println("hello bava");
	}
	public void mardal() {
		System.out.println("hai mardal");
	}
	
	@Override
	public void cat() {
		System.out.println("hello cat");
		
	}
	@Override
	public void rat() {
		System.out.println("hello rAT");
	}
	public static void main(String[] args) {
		
		Sbi1 se = new Sbi1();
		se.bava();
		se.dog();
		se.cat();
		se.rat();
		se.mardal();
		se.meom();
		
	}

}
