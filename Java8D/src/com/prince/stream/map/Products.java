package com.prince.stream.map;

import java.util.List;

public class Products {
	
	public Products(int id, List<String> parts) {
		super();
		this.id = id;
		this.parts = parts;
	}
	private int id;
	private List<String> parts;
	int getId() {
		return id;
	}
	List<String> getParts() {
		return parts;
	}

}
