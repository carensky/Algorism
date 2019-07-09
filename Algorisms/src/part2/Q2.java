package part2;

public class Q2 {

	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,5,6};
		int temp;
		
		for(int i=0; i<num.length/2; i++)
		{
			temp = num[i];
			num[i] = num[num.length-i-1];
			num[num.length-i-1] = temp;
		}
		
		for(int j=0; j<num.length; j++)
		{
			System.out.println(num[j]);
		}
	}
}
