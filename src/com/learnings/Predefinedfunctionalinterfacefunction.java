package com.learnings;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predefinedfunctionalinterfacefunction {

	// now we wont need functional interface separately due to the four interface we
	// will study.

	@FunctionalInterface
	interface sample {
		void sample();
	}

	public static void main(String[] args) {

		// function has apply() and Andthen() method.
		// we give one argument and it returns the result.

		Function<String, Integer> object1 = Integer::valueOf;
		Integer i1 = object1.apply("234324");
		System.out.println(i1);

		Function<String, Object> object2 = object1.andThen(String::valueOf);
		Object o1 = object2.apply("234234324");

		// this will return the value not memory address as its not inheritance.
		System.out.println(o1);

		// tried to convert to string and then print and it works the same way
		String s2 = o1.toString();
		System.out.println(s2);
	}

}
