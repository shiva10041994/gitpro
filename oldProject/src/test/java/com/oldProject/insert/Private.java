package com.oldProject.insert;

public class Private {
		
		private int k = 49;
		private int j = 33;
	
		private void display() {
			
			System.out.println(k + j);
		}
		public static void main(String[] args) {
			
			Private pe = new Private();
			pe.j = 33;
			pe.display();
			
		}
		
		
	
	

}
