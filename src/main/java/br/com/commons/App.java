package br.com.commons;

import java.util.LinkedHashMap;

import org.apache.commons.lang3.StringUtils;

public class App {

	public static char firstChar(Stream input) {

		LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();

		while (input.hasNext()) {
			Character next = input.getNext();
			if (countMap.containsKey(next)) {
				Integer count = countMap.get(next);
				countMap.put(next, ++count);
			} else {
				countMap.put(next, 1);
			}
		}

		for (Character c : countMap.keySet()) {
			if (countMap.get(c) == 1) {
				return c;
			}
		}

		return 0;

	}

	public static void main(String[] args) {
		String input = args[0];
		Stream stream = new StreamImpl(input);
		System.out.println("Entrada: " + input);
		char firstChar = firstChar(stream);
		System.out.println("Output: "+ (firstChar == 0 ? "Nenhum número repetido" : firstChar));
	}
}
