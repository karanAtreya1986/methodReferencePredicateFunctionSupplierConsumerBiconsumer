package com.learnings;

public class HowMethodReferenceWorks {

	// interfaces can be static also.
	// we use generics.
	// we convert the first argument to second argument.
	@FunctionalInterface
	static interface Converter<firstArgument, secondArgument> {
		secondArgument convert(firstArgument f1);
	}
	
	public static void main(String[] args) {
		
		//we will use lambda and try to solve it.
		Converter<String, Integer> object1=(from)->Integer.valueOf(from);
		Integer i1=object1.convert("234234");
		System.out.println(i1);
	}

}
