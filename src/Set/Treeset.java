package Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(20);
		ts.add(30);
		ts.add(30);
		ts.add(45);
		ts.add(15);
		//ts.add(null);      //Null pointer Exception
		//ts.add("abc");     //ClassCast Exception
		//ts.add(40.2);
		//ts.add(null);
		//ts.add("abc");
		for(Object ob:ts)
			System.out.println(ob);

	}

}
