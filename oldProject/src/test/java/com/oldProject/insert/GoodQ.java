package com.oldProject.insert;

public class GoodQ implements Rice,Bags {

	@Override
	public void weight() {
		System.out.println("38 kgs");
		
	}

	@Override
	public void length() {
		System.out.println("6 feet");
		
	}

	public void quality() {
		System.out.println("good product");
		
	}

	public void quantity() {
		System.out.println("best in world");
		
	}
	public static void main(String[] args) {
		GoodQ gq = new GoodQ();
		gq.weight();
		gq.length();
		gq.quantity();
		gq.quality();
	}
	
	
	

}
