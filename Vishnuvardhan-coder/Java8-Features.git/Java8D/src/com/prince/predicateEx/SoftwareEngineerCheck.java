package com.prince.predicateEx;

import java.util.function.Predicate;

public class SoftwareEngineerCheck {

	public static void main(String[] args) {

		SoftwareEngineer[] a = { new SoftwareEngineer("ram",25,false),
				                 new SoftwareEngineer("mahesh",27,true),
				                 new SoftwareEngineer("sanjeev",28,true)
				
		} ;
		
		Predicate<SoftwareEngineer> p = se->se.age >= 18 && se.isHavingGf == true ;
		
		System.out.println("The Alowed Members In The Pub are");
		for(SoftwareEngineer s : a){
			
			if(p.test(s)){
				
				System.out.println(s);
			}
		}
		
		
		
		
		
	}
}
