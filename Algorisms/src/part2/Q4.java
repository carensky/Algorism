package part2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		
		int count = sc.nextInt();
		
		int[] b = new int[count];
		
		boolean result = copy(a,b);
		
		if(result == true)
		{
			for(int i=0; i<b.length; i++)
			{
				System.out.println("�迭 b : " + b[i]);
			}
		}
		else
		{
			System.out.println("�迭 ����� ������ �ٸ��ϴ�.");
		}
		
	}
	
	static boolean copy(int[]a, int[]b)
	{
		if(a.length == b.length)
		{
			for(int j=0; j<a.length; j++)
			{
				b[j] = a[j];
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}

}
