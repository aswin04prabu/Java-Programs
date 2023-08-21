package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		//HashMap m = new HashMap();
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "X"); //Old value will be replaced with new value
		m.put(106, "David");
		
		System.out.println(m); //{101=John, 102=David, 103=Scott, 104=Mary, 105=Tye}
		
		System.out.println(m.get(105)); //Tye
		
		m.remove(106); //Remove pair from Hashmap
		System.out.println(m); //{101=John, 102=David, 103=X, 104=Mary, 105=Tye}
		
		System.out.println(m.containsKey(101)); //true
		System.out.println(m.containsKey(106)); //false
		
		System.out.println(m.containsValue("Mary")); //true
		System.out.println(m.containsValue("Y")); //false
		
		System.out.println(m.isEmpty()); //false
		
		for(Object o: m.keySet()) {
			System.out.println(o);
		}
		
		for(Object o: m.values()) {
			System.out.println(o);
		}
		
		System.out.println(m.keySet()); //[101, 102, 103, 104, 105] //Returns all keys as Set
		
		/*for(Object o :m.keySet()) {
			System.out.println(o+ "  " +m.get(o));
		}*/
		
		//System.out.println(m.values()); //Returns all values as a collection //[John, David, X, Mary, Tye]
		
		//System.out.println(m.entrySet()); //Returns all the entries as Set Object
		
		//Entry Methods
		//****************
		
		/*for(Map.Entry  e : m.entrySet()) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}*/
		
		//Iterator()
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next(); 
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}

}
