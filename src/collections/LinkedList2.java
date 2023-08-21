package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l); //[X, Y, Z, A, B, C]
		
		new_l.removeAll(l);
		System.out.println(new_l); //[]
		
		//sort() Collections.sort(collection type)
		System.out.println("Before Sorting: "+l); //[X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("After Sorting: "+l); //[A, B, C, X, Y, Z]
		
		System.out.println("Before Reverse Order: "+l); //[A, B, C, X, Y, Z]
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After Reverse Order: "+l); //[Z, Y, X, C, B, A]
		
		//Shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling: "+l); //[A, Y, B, Z, C, X]
	}

}
