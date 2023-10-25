package com.oldProject.insert;

public abstract class NewBank {
	
	public abstract void credit();
	public abstract void debit();
	
	public void loans() {
		System.out.println("new bank loans");
	}
	public void mutualFunds() {
		System.out.println("new bank mutual funds");
	}
}
