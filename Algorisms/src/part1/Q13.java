package part1;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) 
	{
		System.out.println("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("   |");
		for(int j=1; j<=n; j++)
		{
			System.out.printf("%4d", j);
		}
		System.out.println();
		
		System.out.print("---+");
		
		for(int k = 1; k<=n; k++)
		{
			System.out.print("----");
		}
		
		System.out.println();
		
		for(int i=1; i<=n; i++)
		{
			System.out.printf("%2d |",i);
			for(int j=1; j<=n; j++)
			{
				System.out.printf("%4d", i+j );
			}
			System.out.println();
		}
		
	}

}
