package module_2;

import java.util.Stack;
public class Stackop {
	static Stack<Integer> stack= new Stack<>();
	
	static int n=stack.size();
	
	
	//stack operations...
	
	//pushing the elements into stack
	
	public static void push() {
	for(int i=0;i<5;i++) {
		stack.push(i);
	}
	System.out.println("stack:"+stack);
	System.out.println("size of the stack:"+stack.size());

}
	

	public static void pop() {
		int x= stack.pop();
		System.out.println("poped element:"+x);
		System.out.println(stack);
		System.out.println("size of the stack:"+stack.size());
	}
	public static void peek() {
		int top = stack.peek();
		System.out.println("peek element of the stack:"+top);
		
		System.out.println("size of the stack:"+stack.size());

	}
	public static void main(String[] args) {
		System.out.println("initial size of the stack:"+n);
		
		push();
		pop();
		peek();
	}}


