package com.learnings;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predefinedfunctionalinterfacebiconsumer {

	// now we wont need functional interface separately due to the four interface we
	// will study.

	@FunctionalInterface
	interface sample {
		void sample();
	}

	// biconsumer has accept method.
	// used for key-value pairs.
	public static void main(String[] args) {
		BiConsumer<String, Integer> object1 = (key, value) -> System.out.println(key + " " + value);
		object1.accept("tiger", 123213213);
		object1.accept("alex", 3434);
	}
}
