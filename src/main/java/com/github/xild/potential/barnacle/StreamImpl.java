package com.github.xild.potential.barnacle;

import java.util.LinkedHashMap;

public class StreamImpl implements Stream {

	private String input;
	private int count;

	public StreamImpl(String input) {
		
		if(input == null){
			throw new IllegalArgumentException("input não pode ser nulo");
		}
		
		this.input = input;
		count = 0;
	}

	public char getNext() {
		return this.input.charAt(count++);
	}

	public boolean hasNext() {
		return count < input.length();
	}
	
}
