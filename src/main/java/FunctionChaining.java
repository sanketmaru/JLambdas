package main.java;

import java.util.function.Function;

public class FunctionChaining {
	
	public static void main(String ar[]){
		
		Function<String, Integer> stringLength = (s) -> s.length();		
		System.out.println(stringLength.apply("Hello World"));
		
		Function<Integer, Boolean> greaterThanFive = (i) -> i > 5;
		System.out.println(stringLength.andThen(greaterThanFive).apply("Hello world")); // Will print true
		
		Function<Integer, Boolean> lowerThanTen = (i) -> i < 10;
		Function<String, Boolean> function = stringLength.andThen(lowerThanTen);

		// Will print false
		Boolean apply = function.apply("Hello world");
		System.out.println(apply);


	}

}
