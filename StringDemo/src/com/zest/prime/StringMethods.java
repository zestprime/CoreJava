package com.zest.prime;

public class StringMethods {

	public static void main(String[] args) {
		
		String s ="Zest";
		
		//length
		
		//int l = s.length();
		//boolean f = s.isEmpty();
		//String sn = s.trim();
		//String sn = s.toLowerCase();
		//String sn = s.toUpperCase();
		//String sn = s.substring(1,4);
		//String sn = s.replace('e', 'X');
		//String sn = s.replaceFirst("e", "X");
		
		//boolean sn = s.startsWith("abc");
		//boolean sn = s.endsWith("PrimeXXXX");
		//char sn = s.charAt(4);
		//int sn = s.indexOf('e');
		//int sn = s.lastIndexOf('m');
		
		String s2 = "zest";
		
		//boolean sn = s.equals(s2);
		if(s != null) {
			boolean sn = s.equalsIgnoreCase(s2);
			System.out.println(sn);
		}else {
			System.out.println("Obj is null");
		}
		
	}

}
