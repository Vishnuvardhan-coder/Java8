package com.prince.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		
		List<Student> alist = new ArrayList<>();
		
		alist.add(new Student (25, "ak"));
		alist.add(new Student(32, "gk"));
		alist.add(new Student(24, "rk"));
		
		Stream s1 = alist.stream().filter(s->s.getId()>25);
		
		s1.forEach(System.out::println);
		
		System.out.println("============================");
		
		boolean b = alist.stream().allMatch(s->s.getName().contains("k"));
		
		System.out.println(b);
		
		System.out.println("=============================");
		
		
       boolean anyMatch = alist.stream().anyMatch(s->s.getName().equals("k"));
		
       System.out.println(anyMatch);
		
		System.out.println("=================");
		boolean noneMatch = alist.stream().noneMatch(s->s.getId()>25);
		
		System.out.println(noneMatch);
		
	}
}
