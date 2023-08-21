package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		//HashSet hs = new HashSet(100); // initial capacity 100
		//HashSet hs = new HashSet(100,(float)0.90);
		//HashSet<Integer> hs = new HashSet<Integer>();
		
		HashSet hs = new HashSet();// default capacity is 16 & load factor 0.75
		
		//Add objects/elements into HashSet
		hs.add(100);
		hs.add("hello");
		hs.add(14.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); //[null, 14.4, A, 100, hello, true] // Insertion order not preserved
		
		//remove()
		hs.remove(14.4); //value
		System.out.println("After removing element: "+hs); //[null, A, 100, hello, true]
		
		//contains
		System.out.println(hs.contains("hello")); //true
		System.out.println(hs.contains(14.4)); //false
		
		System.out.println(hs.isEmpty()); //false
		
		//Reading objects/elements from hashset using for-each loop
		
		for(Object o : hs) {
			System.out.println(o); //random order
		}
		
		//Reading objects/elements from hashset using iterator
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
