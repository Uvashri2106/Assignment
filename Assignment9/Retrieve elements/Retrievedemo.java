package Program;

import java.util.*;
class Retrievedemo
{
	public static void main(String[] args) {
		// Creating a list and adding some elements(colors) to the list
		List<String> uList = new ArrayList<String>();
		uList.add("Violet");
		uList.add("Green");
		uList.add("Blue");
		uList.add("Pink");
		uList.add("Black");
		//Printing the list
		
		System.out.println(uList);
		
		// Now retrieving the 3rd and 5th element
		String element = uList.get(2);
		System.out.println("Third element: "+element);
		element = uList.get(4);
		System.out.println("Fifth element: "+element);
		}
}