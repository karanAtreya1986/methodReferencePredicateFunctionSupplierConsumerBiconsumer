package com.learnings;

public class MethodReferenceWithConstructor {

	@FunctionalInterface
	static interface Converter<firstArgument, secondArgument> {
		secondArgument convert(firstArgument f1);
	}

	public static void main(String[] args) {

		// this is the way to invoke constructor using method reference.
		PersonFactory<Person> object1 = Person::new;
		Person object2 = object1.create("Method", "reference");

		// when we print the object name, we get memory address as this is basic classes
		// and objects.
		System.out.println(object2);
		
		String s1=object2.firstName;
		System.out.println(s1);
		
		String s2=object2.lastName;
		System.out.println(s2);

	}

}

//using generics, anything child of person class is allowed.
interface PersonFactory<P extends Person> {
	// create method which will give person object back
	P create(String firstname, String lastname);
}

class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
