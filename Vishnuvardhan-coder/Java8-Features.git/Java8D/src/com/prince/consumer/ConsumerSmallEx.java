package com.prince.consumer;

import java.util.function.Consumer;

public class ConsumerSmallEx {

	public static void main(String[] args) {
		
	
	Consumer<String> c = s->System.out.println(s);
	
	c.accept("Naruto Uzumaki");
}
}