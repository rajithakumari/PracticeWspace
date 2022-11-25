package Set;

import java.util.Stack;

public class Stack1 {
	
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();

		
		
		st.add("tom");  //First In will be Last Out
		st.add("jim");
		st.add("zam");
		st.add("kim"); // Last IN will be First Out. 
		st.push("john");
		System.out.println(st.pop());
		System.out.println(st.peek());
		
		int stacksize = st.size();
		
		for(int i=0; i<stacksize;i++) {
			System.out.println(st.pop());
		}
		
		
	}

		
	}


