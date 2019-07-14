package part1;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피라미드를 출력합니다.");
		
		System.out.println("단수 : ");
		
		int n = sc.nextInt();
		
		int temp = n;
		int b=0;
		
		while(temp > 0)
		{
			temp /=10;
			b++;
		}
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=((n-i)*b); j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=((i*2-1)*b) && i<10; k++)
			{
				System.out.print(i);
			}
			for(int h=1; h<=(i*2-1) && i>=10; h++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
