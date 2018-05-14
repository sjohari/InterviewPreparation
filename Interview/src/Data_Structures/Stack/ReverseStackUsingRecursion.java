package Data_Structures.Stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	static Stack<Integer> s ;
	
	public static void main(String[] args) {
		s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		while(!s.empty()){
			System.out.print(s.pop());
		}
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		System.out.println();
		
		reverse(s);
		
		while(!s.empty()){
			System.out.print(s.pop());
		}

	}

	private static void reverse(Stack<Integer> s) {
		if(s.empty()){
			return;
		}
		int x = s.pop();
		reverse(s);
		addToBottom(s,x);
	}

	private static void addToBottom(Stack<Integer> s2, int x) {
		if(s2.empty()){
			s2.push(x);
			return;
		}
		int y = s2.pop();
		addToBottom(s,x);
		s.push(y);
	}

}
