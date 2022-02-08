package Program;

public class Maximum_Minimum {

	public static void main(String[] args) {
		int a[]= {65,10,51,77,42};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number in array is:"+max);
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number in array is:"+min);
	}

}
