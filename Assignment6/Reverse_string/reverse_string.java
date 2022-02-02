package Example;

public class reverse_string {

	public static void main(String[] args){
		String word="UVASHRI";
		for(int i=word.length()-1;i>=0;i--)
		{
		System.out.print(word.charAt(i));
		}
	}
}