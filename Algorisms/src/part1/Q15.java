package part1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형을 출력합니다.");
		
		System.out.println("단수 : ");
		
		int n = sc.nextInt();

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
