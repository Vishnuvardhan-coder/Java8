package com.prince.predicateEx;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
	

	String names[] = {"aman" , "amar", "rakesh", "ramesh", "kishore", "rahul"}; 
	
	Predicate<String> p = s->s.charAt(0)=='r' ;
	
	for(String e : names)
			
	if(p.test(e)){
		
		System.out.println(e);
	}
}}
