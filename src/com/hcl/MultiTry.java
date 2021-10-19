package com.hcl;

public class MultiTry {
	public static void main(String[] args) {
		
				
				try {
					
						int a=(10/0);
				}catch(ArithmeticException e) {
					System.out.println(e);
				}
				
				try {
					int a[]=new int[4];
					a[5]=4;
				}catch(Exception e) {
					System.out.println(e);
		}
	}
}
				
		
		
	


