package com.horasan.cs_design_patterns.structural.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private static List<String> nameList = new ArrayList<String>();
	
	private int[] names;
	
	public User(String name, String lastName) {
		if(nameList.indexOf(name) == 0) {
			nameList.add(name);
		}
		
		if(nameList.indexOf(lastName) == 0) {
			nameList.add(lastName);
		}
		
		names[0] = nameList.indexOf(name);
		names[1] = nameList.indexOf(lastName);
	}
}
