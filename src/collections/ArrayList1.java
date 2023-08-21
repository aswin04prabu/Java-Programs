package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
		//ArrayList al = new ArrayList(); // stores heterogeneous data
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<String> al = new ArrayList<String>();	// stores homogeneous data
		//List al = new ArrayList();
		
		ArrayList al = new ArrayList();
		
		//Add new elemets to the array list
		
		al.add(100);
		al.add("Hello");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//size()
		System.out.println("Number of elements in ArrayLIst :" +al.size());
		
		//remove()
		System.out.println(al.remove(1)); // 1 is index
		//al.remove("Hello"); // Hello is element & Case sensitive
		System.out.println("After Removing element from Array List: "+al);
		
		//insert a new element
		//add(index,object)
		al.add(2, "Aswin");
		System.out.println("After Insertion: "+al);
		
		//retrieve a specific element
		System.out.println(al.get(2));   // 2 is index of element
		
		//change element/replace
		al.set(2, "Prabu");
		System.out.println("After Replacing the element: " +al);
		
		//search - contains - true or false
		System.out.println(al.contains(15.5)); //true
		System.out.println(al.contains('B')); // false
		
		//isEmpty()
		System.out.println(al.isEmpty()); // false
		
		//for loop
		System.out.println("Reading elements using for loop.......");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//for each loop
		System.out.println("Reading elements using Enhanced for loop.......");
		for(Object e:al) {
			System.out.println(e);
		}
		
		//iterator
		System.out.println("Reading elements using Iterator method");
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //printing the element and move to next
		}
	}

}
