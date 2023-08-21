package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		
		//Adding elements add() offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer(100); //Not allowed in Queue(ONly homogeneous data)
		q.offer(100);
		
		//System.out.println(q); //PQ - [A, B, C, C] //insertion order preserved and duplicates allowed
		System.out.println(q); //LL - [A, B, C, 100, 100] //insertion order preserved and duplicates allowed
		
		
		//get head element element() peek()
		System.out.println(q.element()); //A Returns Head Element, if empty returns NoSuchElementException
		System.out.println(q.peek()); //A //null Returns Head Element, if empty returns null
		
		//Return and remove element from queue remove() poll()
		//System.out.println(q.remove()); //A //Returns the element
		//System.out.println(q); //[B, C, C] //Removes the element
		
		//System.out.println(q.poll()); //A //Returns the element
		//System.out.println(q); //[B, C, C] //Removes the element
		
		//Iterator it = q.iterator();
		//while(it.hasNext()) {
		//	System.out.println(it.next());
		//}
		
//		for(Object o: q) {
//			System.out.println(o);
//		}
		
	}

}
