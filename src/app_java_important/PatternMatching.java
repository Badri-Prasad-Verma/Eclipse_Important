package app_java_important;

import java.util.Stack;

public class PatternMatching {

	public static void main(String[] args) {
		String str="(){}[]";
		boolean status=isBoolean(str);
		System.out.println(str);
		System.out.println(status);
	}

	private static boolean isBoolean(String str) {
		Stack<Character> stack=new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					return false;
				}
			}
			else if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					return false;
				}
			}
			else if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}else {
				stack.push(ch);
			}
		}if(stack.size()==0) {
			return true;
		}
		return false;
	}
}
