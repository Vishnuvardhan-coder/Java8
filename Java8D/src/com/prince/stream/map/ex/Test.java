package com.prince.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		
		List details = new ArrayList();
		
	
		List<String> part1 = new ArrayList();
		part1.add("first part");
		part1.add("second part");
		part1.add("third part");
		
		

		List<String> part2 = new ArrayList();
		part2.add("first part");
		part2.add("second part");
		part2.add("third part");
		
		
		Products p = new Products(1 , part1);
		Products p2 = new Products(1 , part2);
		
		details.add(p);
		details.add(p2);
		
	Stream<String> ss =	details.stream().flatMap(products->((Products) products).getParts().stream());
	
	ss.forEach(System.out::println);
	}
}
