package part2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		
		int count = sc.nextInt();
		
		int[] b = new int[count];
		
		boolean result = reverseCopy(a,b);
		
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
	
	static boolean reverseCopy(int[]a, int[]b)
	{
		int temp;
		
		if(a.length == b.length)
		{
			for(int j=0; j<a.length/2; j++)
			{
				temp = a[a.length-1-j];
				a[a.length-1-j] = a[j];
				a[j] = temp;
			}
			
			for(int k=0; k<a.length; k++)
			{
				b[k] = a[k];
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}

}
