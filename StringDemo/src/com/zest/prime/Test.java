package com.zest.prime;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer name1 = new StringBuffer("Manohar-1");
		int hashCode = System.identityHashCode(name1);// 1175962212
		System.out.println("Identity Hash Code 1: " + hashCode);
		StringBuffer name2 = name1.append("ok");
		hashCode = System.identityHashCode(name2);// 1175962212
		System.out.println("Identity Hash Code 2: " + hashCode);
		System.out.println(name1 == name2);

	}
}
