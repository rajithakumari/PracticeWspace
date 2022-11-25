package Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHash1 {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(20);
		lhs.add(15);
		lhs.add(30);
		lhs.add(30);
		lhs.add(45);
		lhs.add(15);
		lhs.add(null);		
		lhs.add("abc");
		lhs.add(40.2);
		lhs.add(null);
		//ts.add("abc");
		for(Object ob:lhs)
			System.out.println(ob);


	}

}
