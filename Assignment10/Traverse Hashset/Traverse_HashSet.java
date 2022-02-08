package Program;

import java.util.*;
class Traverse_HashSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Dog");
		set.add("Cat");
		set.add("Parrot");
		set.add("Rabbit");
		Iterator<String>iterator=set.iterator();
		System.out.println("The elements are:"+set);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
