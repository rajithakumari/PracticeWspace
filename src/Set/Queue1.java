package Set;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue1 {
	
	public static void main(String[] args) {	
		Queue<String> q = new LinkedList<String>() ;
		q.add("Abc");
		q.add("Xyz");
		q.add("pqr");
		q.add("uvw");
		
//		 System.out.println(q.peek());
//		 System.out.println(q.poll()); 
//	     System.out.println(q.peek());
//	     System.out.println(q.poll()); 
//	     System.out.println(q.peek());
		 
		int queueSize = q.size();
		
		for(int i=0; i<queueSize ; i++) {
		System.out.println(q.poll());
		System.out.println(q.peek());
		}
	}

}