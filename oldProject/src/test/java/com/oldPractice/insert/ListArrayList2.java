package com.oldPractice.insert;

import java.util.ArrayList;

public class ListArrayList2 {
	public static void main(String[] args) {
		
		ArrayList<String> alt = new ArrayList<String>();
		alt.add("blue");
		alt.add("red");
		alt.add("green");
		alt.add("blue");
		
		ArrayList<String> altt = new ArrayList<String>();
		altt.add("yellow");
		altt.add("brown");
		altt.add("red");
		altt.add("blue");
		
		altt.retainAll(alt);
		for(int i=0;i<altt.size();i++) {
			System.out.println(altt.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
