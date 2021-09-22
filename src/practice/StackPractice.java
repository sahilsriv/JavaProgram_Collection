package practice;

import java.util.*;

public class StackPractice {
	public static void main(String[] args) {
	Stack<Integer> stack  = new Stack<>();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(5);
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
	
	//all list function are also applicable here 
	stack.add(2);
	System.out.println(stack);
	stack.remove(2);
	System.out.println(stack);
	stack.remove((Integer)2);
	System.out.println(stack);
	System.out.println(stack.get(1));
	}
}
