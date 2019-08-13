package part5;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) 
	{
		int[] num = {1000,80,20,120};
		
		int result = gcdArray(num);
		
		System.out.println("최대공약수는 : " + result);
		
	}
	
	static int gcdArray(int[] num)
	{
		Arrays.sort(num);
		
		int num1 = num[1];
		int num2 = num[0];
		
		while(true)
		{
			int temp;
			
			if(num1 % num2 == 0)
			{
				return num2;
			}
			else
			{
				temp = num2;
				num2 = num1 % num2;
				num1 = temp;
			}
		}
	}
}
