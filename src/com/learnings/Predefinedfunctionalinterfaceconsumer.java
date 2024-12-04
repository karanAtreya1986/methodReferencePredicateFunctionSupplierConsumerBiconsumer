package com.learnings;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predefinedfunctionalinterfaceconsumer {

	// now we wont need functional interface separately due to the four interface we
	// will study.

	@FunctionalInterface
	interface sample {
		void sample();
	}

	//consumer has only one argument.
	public static void main(String[] args) {
		Consumer<Person2> object1=(p)->System.out.println("abcd" + " " + p.firstname);
		//has accept method
		object1.accept(new Person2("alex", "tiger"));

	}
}

class Person2 {
	String firstname;
	String lastname;

	public Person2() {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Person2(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
}
