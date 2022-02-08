package Program;
import java.util.*;
class Array_list
{
	public static void main(String[] args) {
		// Creating a list and adding elements(names) to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Uvashri");
		list_Strings.add("Sweetly");
		list_Strings.add("Raji");
		list_Strings.add("Nandhini");
		list_Strings.add("Meenakshi");
		// Printing the list
		for (String element : list_Strings) {
			System.out.println(element);
  }
}
}