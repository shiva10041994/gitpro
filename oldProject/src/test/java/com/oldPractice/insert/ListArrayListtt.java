package com.oldPractice.insert;

import java.util.ArrayList;

public class ListArrayListtt {
	public static void main(String[] args) {
		
		ArrayList at = new ArrayList();
		
		at.add("shiva");
		at.add("surekha");
		System.out.println(at.size());
		ArrayList att = new ArrayList();
		att.add("nani");
		att.add("mom");
		System.out.println(att.size());
		att.add(at);
		for(int i=0;i<att.size();i++) {
			System.out.println(att.get(i));
		}
		at.remove(att);
		for(int j=0; j<at.size();j++) {
			System.out.println(at.get(j));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
