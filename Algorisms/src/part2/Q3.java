package part2;

public class Q3 {

	public static void main(String[] args) 
	{
		int[] num = {1,3,5,7,9};
		
		int total = sumOf(num);
		
		System.out.println(total);
		
	}
	
	static int sumOf(int[] a)
	{
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
		}
		
		return sum;
	}

}
