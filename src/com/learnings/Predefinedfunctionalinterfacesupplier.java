package com.learnings;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predefinedfunctionalinterfacesupplier {

	// now we wont need functional interface separately due to the four interface we
	// will study.

	// Supplier for just printing the result.

	// has get() method.
	@FunctionalInterface
	interface sample {
		void sample();
	}

	public static void main(String[] args) {

		Supplier<Person1> object1 = Person1::new;
		Person1 p1 = object1.get();

		// this will print object address.
		System.out.println(p1);

		// this also gives memory address as we are printing object reference and not
		// the field values.
		String s1 = p1.toString();
		System.out.println(s1);

	}
}

class Person1 {
	String firstname;
	String lastname;

	public Person1() {
		this.firstname = firstname;
		this.lastname = lastname;
	}
}
