package main.java;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Lambdas {
	
	public static void main(String ar[]){
		final String greeting = "hello";
		
		// Java 7
		Greeter greeter = new Greeter() {
			
			@Override
			public String createGreeting(String whom) {
				return greeting + whom + "!";
			}
		};
		
		System.out.println(greeter.createGreeting("hello"));
		
		// Java 8
		Function<String, String> greeter8 = whom -> { // lambdas with one argument
			return greeting + whom + "!!";
		};
		greetWorld(greeter8);
		
		//partial function application
		BiFunction<String, String, String> concat = (a, b) -> a + b; // lambdas with two arguments
		greetFolks(whom -> concat.apply("Hello, ", whom));	
				
		// partial function application with appending /api to each of the routes
		
		// lambdas with no return values
		
		Consumer<String> consumerFunction = name -> System.out.println("Name is :- " + name);		
		consumerFunction.accept("Sanket Maru");
		
		BiConsumer<String, String> biConsumer = (firstName, lastName) -> {
			System.out.println("FirstName is " + firstName);
			System.out.println("lastName is " + lastName);
		};
		
		biConsumer.accept("Sanket", "Maru");
		
		// .toUpperCase() exists in String, but not on CharSequence
	    String transform = transform("Sanket", (String str) -> str.toUpperCase());
		System.out.println(transform);
		
		// Using operators to capture Familiar Lambdas
		
		UnaryOperator<String> upperCase = str -> str.toUpperCase();
		System.out.println(upperCase);
		BinaryOperator<String> concat1 = (left,right) -> left + right;
		System.out.println(concat1);
		
		// lambdas as predicates
		Predicate<String> predicate = s -> s != null && s.length() > 0;
		boolean test = predicate.test("");
		boolean test1 = predicate.test("Sanket");
		
		System.out.println("Empty String result" + test + " String with length result" + test1);
		
		Predicate<Integer> predicate1 = s -> s != null && s > 0;
		boolean integerTest = predicate1.test(2);
		System.out.println("Integer Test " + integerTest);
		
		//lambdas with Primitive arguments
		
		methodBeingCalled((int i) -> Integer.toString(i));
		
		//making methods into lambdas
		IntFunction<String> intToString = Integer::toString;
		ToIntFunction<String> parseInt = Integer::valueOf;
		
		String apply = intToString.apply(1);
		System.out.println(apply);
		int applyAsInt = parseInt.applyAsInt("1");
		System.out.println(applyAsInt);
		
	}
	
	private static void methodBeingCalled(Function<Integer, String> ger) {
		String apply = ger.apply(1);
		
	}
	
	private static void methodBeingCalled(IntFunction<String> ger) {
		String apply = ger.apply(1);
		
	}

	public static String transform(String str,Function<String, String> transformer) {
		return transformer.apply(str);
	}

	public static CharSequence transform(CharSequence str,Function<CharSequence, CharSequence> transformer) {
		return transformer.apply(str);
	}
	
	public static void greetFolks(Function<String, String> greeter) {
	    for(String name : Arrays.asList("Bob", "John", "Rob")) {
	      System.out.println(greeter.apply(name));
	    }
	  }
	
	public static void greetWorld(Function<String, String> greeter) {
		System.out.println(greeter.apply("World"));
	}

}


interface Greeter{
	String createGreeting(String whom);
}