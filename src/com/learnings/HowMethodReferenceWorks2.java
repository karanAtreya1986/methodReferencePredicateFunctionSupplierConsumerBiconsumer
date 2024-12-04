package com.learnings;

public class HowMethodReferenceWorks2 {

	// interfaces can be static also.
	// we use generics.
	// we convert the first argument to second argument.
	@FunctionalInterface
	static interface Converter<firstArgument, secondArgument> {
		secondArgument convert(firstArgument f1);
	}

	public static void main(String[] args) {

		// now we will replace lambda expressions
		// we will use method reference
		// we can directly call method name of the class if it exists.
		// We can access methods of class directly for example valueof() from integer
		// class.
		//Method reference is replacement for lambda.
		Converter<String, Integer> object2 = Integer::valueOf;
		Integer i2 = object2.convert("234234");
		System.out.println(i2);
	}

}
