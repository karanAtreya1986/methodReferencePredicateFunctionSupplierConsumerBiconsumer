package com.learnings;

public class MethodReferenceWithClass {

	@FunctionalInterface
	static interface Converter<firstArgument, secondArgument> {
		secondArgument convert(firstArgument f1);
	}

	public static void main(String[] args) {

		Something s2=new Something();
		Converter<String, String> object3=s2::startsWith;
		String output=object3.convert("Method reference");
		System.out.println(output);
	}

	static class Something {

		// this method returns the value at zero index
		String startsWith(String s1) {
			return String.valueOf(s1.charAt(0));
		}
	}

}
