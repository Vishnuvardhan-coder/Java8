package com.prince.supplier;

import java.util.function.Supplier;

public class SupplierProgramToGetRandomNames {

	public static void main(String[] args) {
		
		Supplier s= ()-> {
			
			String [] s1 = {"naruto","saske","hinata","sakura"};
			
			int x = (int) (Math.random()*4);
			
			return s1[x]; 
		
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}
} 
