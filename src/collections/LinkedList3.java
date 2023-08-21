package collections;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l); //[Dog, dog, cat, horse]
		
		l.addFirst("Tiger");
		l.addLast("Elephant");
		System.out.println(l); //[Tiger, Dog, dog, cat, horse, Elephant]
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first and last elements: "+l);
		
	}

}
