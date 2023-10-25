package com.oldPractice.insert;

import java.util.ArrayList;

public class ListArrayListt {
	 public static void main(String[] args) {
		
		 ArrayList<String> ar = new ArrayList<String>();
		 ar.add("nepal");
		 ar.add("india");
		 
		 ArrayList<String> arr = new ArrayList<String>();
		 arr.add("katamandu");
		 arr.add("delhi");
		 
		 ar.addAll(arr);
		 for(int i =0;i<ar.size();i++) {
			 System.out.println(ar.get(i));
			 
		 }
		 ar.remove(arr);
		 for(int i=0; i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
