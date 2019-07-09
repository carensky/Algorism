package part1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		
		System.out.println("a의 값 : ");
		
		int a = sc.nextInt();
		
		System.out.println("b의 값 : ");
		
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i=a; i<=b; i++)
		{
			sum += i;
		}
		
		System.out.println("합은 : " + sum);
		
	}

}
