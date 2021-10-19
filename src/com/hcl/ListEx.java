package com.hcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Om");
		l.add("Namah");
		l.add("Shivay");
		for(String s:l) {
			System.out.print(s);
		}
	}

}
