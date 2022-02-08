package Program;

import java.util.ArrayList;
class List_Arraydemo {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Positivity");
		list.add("always");
		list.add("wins");
		System.out.println("Elements in the list:"+list);
		String[]newArray=new String[list.size()];
		list.toArray(newArray);
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}

	}

}
