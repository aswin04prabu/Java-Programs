package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {

		String arr[] ={"Dog","Cat","Elephant"};
		
		for(String value: arr) {
			System.out.println(value);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
		/*for(Object value: al) {
			System.out.println(value);
		}*/
		
	}

}
