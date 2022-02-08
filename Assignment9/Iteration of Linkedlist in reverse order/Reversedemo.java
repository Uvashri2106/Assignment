package Program;

import java.util.LinkedList;
import java.util.Iterator;
class Reversedemo {
	public static void main(String[] args) {

		LinkedList<String>g_list = new LinkedList<String>();
	          g_list.add("Apple");
	          g_list.add("Orange");
	          g_list.add("Mango");
	          g_list.add("Banana");
	          g_list.add("Watermelon");
	   System.out.println("Linked list:" + g_list);  
	 
	    Iterator it = g_list.descendingIterator();
	    
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	}
}