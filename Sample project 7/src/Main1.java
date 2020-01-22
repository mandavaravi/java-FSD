import java.util.*;
public class Main1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		Vector v = new Vector();
		v.add("d");
		v.add("a");
		v.add("g");
		v.add("m");
		v.add("j");
		System.out.println(v);
 */

/*
		Hashtable v = new Hashtable();
		v.put("1","2");
		v.put("3","4");
		v.put("6","9");
		v.put("5","7");
		v.put("8","1");
		System.out.println(v);
 
		
		
*/  
		
		/*Q1)))
		    given a method with a hashmap, the hasmap should have (int, string)
			as input. write code to remove all the entries having keys: multipleof 4
			and return size of final hashmap
		 */
		HashMap m = new HashMap();  // key-value pairs , no duplicates
		m.put(1, 1);  //  m.put(key, value);
		m.put(400, "blue");
		m.put(3, "sat");
		m.put(7, "mon");
		m.put(8, "sdt");
		m.put(120, "satbf");
		int i=0;
		int n= (int)m.size();
		int a[] = new int[n];
		Iterator hmIterator = m.entrySet().iterator(); // iterator
		while (hmIterator.hasNext()) {  
            HashMap.Entry mapElement = (HashMap.Entry)hmIterator.next(); //
             int kk = 0;
             kk = (int)mapElement.getKey();
            if (kk % 4 ==0) {
            	a[i]+= kk;
            	i++;
            } 
        }
		for(int j=0;j<n;j++) {
			m.remove(a[j]);
		}
		System.out.println(m);
	}

}
