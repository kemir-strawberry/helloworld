package com.wkm;

public class Factorial {

	/*
	 * 递归求n！
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(foo(5));
	}
	
	public static int foo(int n) {
		if(n == 1) 
			return 1;
		int s = n;
		n = n-1;  
		return s*foo(n);
	}
	
}
