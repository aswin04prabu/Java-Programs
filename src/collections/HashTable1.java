package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {
		
		//Hashtable t = new Hashtable(); //capacity is 11, load factor 0.75
		
		//Hashtable t = new(intital capcity); //create hashtable object with some capacity
		//Hashtable t = new Hashtable(initial capacity,fillratio/load factor);
		Hashtable<Integer,String> t = new Hashtable<Integer, String>();
		
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
		//t.put(null,"X"); //NullPointerException
		//t.put(104, null); //NullPointerException
		
		System.out.println(t); //{103=Smith, 102=David, 101=John}
		
		System.out.println(t.get(103)); //Smith
		
		t.remove(103);
		System.out.println(t); //{102=David, 101=John}
		
		System.out.println(t.containsKey(101)); //true
		System.out.println(t.containsKey(104)); //false
		
		System.out.println(t.containsValue("David")); //true
		System.out.println(t.containsValue("Y")); //false
		
		System.out.println(t.isEmpty()); //false
		
		System.out.println(t.keySet()); //[102, 101]
		System.out.println(t.values()); //[David, John]
		
		/*for(int k : t.keySet()) {
			System.out.println(k+"   "+t.get(k));
		}*/
		
		//Entry Specific Methods
		/*
		for(Map.Entry e : t.entrySet()) {
			System.out.println(e.getKey()+"   "+e.getValue());
		}*/
		
		//iterator()
		
		Set s = t.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println(e.getKey()+"    "+e.getValue());
		}
				
		
	}

}
