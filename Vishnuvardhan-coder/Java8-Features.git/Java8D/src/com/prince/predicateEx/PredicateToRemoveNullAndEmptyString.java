package com.prince.predicateEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToRemoveNullAndEmptyString {

	public static void main(String[] args) {
		
		String names[] = {"kalpana",null,"kishore","","mahender","mahesh"};
		
		Predicate<String> p = s -> (s != null) && (s.length()!=0);
		
		List<String> alist = new ArrayList();
		
		for(String e : names){
			
			if(p.test(e)){
				
				alist.add(e);
				
			}
			
		}
		System.out.println(alist);
		
		
		
		
		
	}
}
