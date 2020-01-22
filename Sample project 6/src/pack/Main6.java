package pack;
import java.util.*;

public class Main6 {

	public static void main(String[] args) {
/*		Set s = new HashSet();  // no duplicates, random indexing
		s.add(77);
		s.add(new String("hi"));
		s.add(new Boolean(true));
		s.add(4);
		System.out.println(s);
		System.out.println(s.contains(77));
		System.out.println(s.isEmpty());
		System.out.println(s.remove(4));
		System.out.println(s);
		System.out.println(s.size());
*/
/*		Set s = new TreeSet();  // same data types
		s.add(77);
		s.add(23);
		s.add(123);
		s.add(4);
		System.out.println(s);
		System.out.println(s.contains(77));
		System.out.println(s.isEmpty());
		System.out.println(s.remove(4));
		System.out.println(s);
		System.out.println(s.size());
*/
//		Set s = new LinkedHashSet();  // can also be used
/*		LinkedHashSet s = new LinkedHashSet();  
		s.add(77);
		s.add(new String("hi"));
		s.add(new Boolean(true));
		s.add(4);
		System.out.println(s);
		System.out.println(s.contains(77));
		System.out.println(s.isEmpty());
		System.out.println(s.remove(4));
		System.out.println(s);
		System.out.println(s.size());
*/
/*
		List s = new ArrayList(); 
		s.add(77);
		s.add(new String("hi"));
		s.add(new Boolean(true));
		s.add(4);
		s.add("hi");
		System.out.println(s);
		System.out.println(s.contains(77));
		System.out.println(s.isEmpty());
		System.out.println(s.remove(3));  // removes the 4th index element
		System.out.println(s);
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
*/
/*		List ll = new LinkedList(); 
		ll.add(77);
		ll.add(new String("hi"));
		ll.add(new Boolean(true));
		ll.add(4);
		ll.add("hi");
		System.out.println(ll);
		//System.out.println(ll.contains(77));
		//System.out.println(ll.isEmpty());
		System.out.println(ll.remo);  // removes the 3rd index element
		System.out.println(ll);
		ListIterator i = ll.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next() + ";");
		}
		while(i.hasPrevious()) {
			System.out.println("-->" + i.previous());
		}
		
*/
/*		Map m = new HashMap();  // key-value pairs , no duplicates
		m.put("one", 1);  //  m.put(key, value);
		m.put("2", "blue");
		m.put(3, "sat");
		m.put(3, "mon"); // value at 3 is now 'mon'
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println(m.get(3));
*/
		Map m = new TreeMap();  // key-value pairs 
		m.put("one", 1);  //  m.put(key, value);
		m.put("2", "blue");
		m.put("3", "sat");  // same datatypes for key
		m.put("3", "mon"); // value at 3 is now 'mon'
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.get("3"));
		System.out.println(m.entrySet());
		
		
	}

}
