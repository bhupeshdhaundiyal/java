package com.Java8Features;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		numbers.forEach(System.out::println);
		
		
	}

}
