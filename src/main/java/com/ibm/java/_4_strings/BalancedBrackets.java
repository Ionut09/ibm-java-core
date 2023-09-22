package com.ibm.java._4_strings;

public class BalancedBrackets {
	
	public static void main(String[] args) {
		String[] inputs = {
			"[]",  //yes
			"{[()]}",  //yes -> {[]} -> {} ->
			"ads{[()]}", //yes -> ads{[]} -> ads{} -> a]ds
			")ads{[()]}", //yes -> )ads{[]} -> )ads{} -> )ads
			"{{{[](){}}}}", //yes
			"()(([))]", //no
		};
		for (String input : inputs) {
			String result = input + (isBalanced(input) ? " is balanced" : " is not balanced");
			System.out.println(result);
		}
	}
	
	private static boolean isBalanced(String input) {
		
		while (input.contains("()") || input.contains("[]") || input.contains("{}")) {
			input = input.replace("()", "");
			input = input.replace("[]", "");
			input = input.replace("{}", "");
		}
		//		return !input.matches("[\\(\\)\\[\\]{}]+"); //[a-z]+
		return !(input.contains("(") ||
			         input.contains("[") ||
			         input.contains("{") ||
			         input.contains(")") ||
			         input.contains("]") ||
			         input.contains("}"));
		
	}
	
}
