package com.prince.functionEx;

import java.util.function.Function;

public class LengthOfStringUsingFunction {
	
	public static void main(String[] args) {
		
		
		Function<String,Integer> f = s->s.length();
		
		System.out.println(f.apply("Vishnu vardhan"));
		
		Function<Integer,Integer> f1 = i->i*i ;
		
	System.out.println(f1.apply(5));
		
		
		
	}

}
