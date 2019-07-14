package part1;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피라미드를 출력합니다.");
		
		System.out.println("단수 : ");
		
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2-1); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
