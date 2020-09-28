package com.prince.supplier;

import java.util.Date;
import java.util.function.Supplier;

// supplier is a predefined interface, it have only one abstract method i.e get() - it wont take any arguments but always return something..
public class SupplierEx {
	
	public static void main(String[] args) {
		
	
	Supplier<Date> s = ()->new Date();

	System.out.println(s.get());
	
}}
