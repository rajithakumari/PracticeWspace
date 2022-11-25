package Set;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.add(null);
		hs.add("abc");
		hs.add(40.2);
		hs.add(null);
		hs.add("abc");
		for(Object ob:hs)
			System.out.println(ob);
			
		
		
	}

}
