package com.oldProject.insert;

public class Sbi extends NewBank{
	
	public void credit() {
		System.out.println("sbi credit");
	}
	public void debit() {
		System.out.println("sbi debit");
	}
	public static void main(String[] args) {
		
		Sbi s = new Sbi();
		s.credit();
		s.debit();
		s.loans();
		s.mutualFunds();
		
	}
}
