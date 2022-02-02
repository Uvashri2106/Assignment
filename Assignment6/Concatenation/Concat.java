package Example;

public class Concat {

	public static void main(String[] args) {
		String a="uvashri";
		String b="selvam".concat("2106");
		String c=a.concat(b);
		String d="gmail";
		String e="com";
		String f=c.concat("@").concat(d).concat(".").concat(e);
		System.out.println("Enter the mail Id:"+f);
	}

}
