package com.hcl;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Shubhangi");
		al.add("Sudhakar");
		al.add("Chankhore");
		System.out.println(al);
		
		Iterator<String> itr= al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
