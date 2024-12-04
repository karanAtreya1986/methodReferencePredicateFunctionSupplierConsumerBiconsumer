package com.learnings;

import java.util.function.Predicate;

public class Predefinedfunctionalinterfacepredicate {

	// now we wont need functional interface separately due to the four interface we
	// will study.

	@FunctionalInterface
	interface sample {
		void sample();
	}

	public static void main(String[] args) {

		// Predicate gives true or false as output always.

		// test and negate.test are the methods
		// test for regular scenario
		// negate for negation and testing
		Predicate<String> object1 = (a) -> a.length() > 0;
		boolean b1 = object1.test("core");
		System.out.println(b1);
		boolean b2 = object1.negate().test("core");
		System.out.println(b2);
	}

}
