package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		//Declare Linked list
		//LinkedList l = new LinkedList();
		
		//LinkedList<Integer> l = new LinkedList<Integer>();
		//LinkedList<String> l = new LinkedList<String>();
		
		//Add elements to linked list
		
		LinkedList l = new LinkedList();
		l.add(100);
		l.add("hello");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l); //[100, hello, 15.5, A, true, null]
		
		System.out.println("Size of the List: "+l.size()); //Size of the List: 6
		
		//remove
		l.remove(3); //index
		//l.remove('A'); // only index we can remove
		System.out.println("After removing the element: "+l); //[100, hello, 15.5, true, null]

		//Insert/adding element in the middle of linked list
		l.add(3, "AP");
		System.out.println("After inserting element: "+l); //[100, hello, 15.5, AP, true, null]
		
		//retrieve value/object
		System.out.println(l.get(3));
		
		// change the value
		l.set(5, 'X');
		System.out.println("After changing the value: "+l); //[100, hello, 15.5, AP, true, X]
		
		//contains()
		System.out.println(l.contains("AP")); //true
		System.out.println(l.contains("MS")); //false
		
		//isEmpty()
		System.out.println(l.isEmpty()); // false
		
		System.out.println("Reading elements from LL using for loop: /n");
		//Reading elements from LL using for loop
		for (int i = 0; i < l.size(); i++) {
				System.out.println(l.get(i));
		}
		
		//Reading elements from LL using for-each loop
		System.out.println("Reading elements from LL using for-each loop:");
		for (Object e : l) {
			System.out.println(e);
		}
		
		//iterator method
		System.out.println("Reading elements from LL using iterator:");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
