package part6;

public class Q13 {

	public static void main(String[] args) 
	{
		int[] a = {5,8,4,2,6,1,3,9};
		
		// quick sort
		if(a.length > 9)
		{
			Q12 q12 = new Q12();
			q12.quickSort(a, 0, a.length-1);
		}
		// insert sort
		else
		{
			Q8 q8 = new Q8();
			q8.insertSort(a);
			
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + "   ");
			}
		}
	}
}
