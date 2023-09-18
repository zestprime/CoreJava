package com.zest.prime;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		//2.Mutable
		StringBuffer sb1 = new StringBuffer("Prime");
		
		int sb1mem = System.identityHashCode(sb1);
		System.out.println("sb1mem:"+sb1mem);
		
		StringBuffer sb2 = sb1.delete(2,3);
		
		int sb2mem = System.identityHashCode(sb2);
		System.out.println("sb2mem:"+sb2mem);
		
		System.out.println(sb1==sb2);
		
		System.out.println(sb2);
		/*
		//1.Immutability
		String s1 = "Zest";
		
		int h1mem = System.identityHashCode(s1);
		String s2 = s1.concat("Test");
		
		int h2mem = System.identityHashCode(s2);
		
		System.out.println("h1mem:"+h1mem);
		System.out.println("h2mem:"+h2mem);
		
		System.out.println(s1 == s2);*/
	}
}
