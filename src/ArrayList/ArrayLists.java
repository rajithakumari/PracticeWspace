package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Object> arrali = new ArrayList<Object>();
		arrali.add("Aryahjm");
		arrali.add(8);
		arrali.add(22.0);
		arrali.add(9);
		arrali.add(3, 5);
		arrali.remove(3);
		System.out.println(arrali);
		for(int i=0; i<arrali.size(); i++) {
			//System.out.println(arrali.get(i));
		}
		//arrali.add(3, 5);
		for(Object result : arrali ) {
			//System.out.println(result);
		}
		
		
		Iterator it = arrali.iterator();
        while(it.hasNext()) {
       	 System.out.println(it.next());
        }
		 
		ArrayList al1 = new ArrayList();
		al1.add(5);
		al1.add("wer");
		al1.add(22);
		al1.add(9);
		for(Object res : arrali ) {
			//System.out.println(res);
		}
		ArrayList arrali1 = new ArrayList();
		arrali1.add(5);
		arrali1.add(4);
		arrali1.add(22);
		arrali1.add(9);
		
				Iterator it1 = arrali1.iterator();
		         while(it1.hasNext()) {
		        	 System.out.println(it1.next());
		         }
	
		        	 //System.out.println(itr);
		
		
		
		
	}
}
