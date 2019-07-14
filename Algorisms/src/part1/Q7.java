package part1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다. ");
		
		System.out.println("n의 값 : ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
		{
			sum += i;
		}
		
		System.out.print("합은 : ");
		System.out.print("'");
		
		for(int j=1; j<=n; j++)
		{
			System.out.print(j + " + ");
			
			if(j == n)
			{
				System.out.print(j + " = ");
			}
		}
		System.out.print(sum + "'");
	}

}
