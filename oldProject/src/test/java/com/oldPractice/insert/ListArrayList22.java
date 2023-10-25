package com.oldPractice.insert;

import java.util.ArrayList;

public class ListArrayList22 {
	public static void main(String[] args) {
		
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("tea");
		ll.add("coffee");
		ll.add("milk");
		ll.add("black");
		
		ArrayList<String> lll =new ArrayList<String>();
		lll.add("milk");
		lll.add("tea");
		lll.add("joy");
		lll.add("gun");
		
		lll.retainAll(ll);
		for(int i=0;i<lll.size();i++) {
			System.out.println(lll.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
