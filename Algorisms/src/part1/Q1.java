package part1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("네 정수의 최댓값을 구합니다.");
		
		System.out.print("a의 값：");
		a = sc.nextInt();
		
		System.out.print("b의 값：");
		b = sc.nextInt();
		
		System.out.print("c의 값：");
		c = sc.nextInt();
		
		System.out.print("d의 값：");
		d = sc.nextInt();

		// a, b, c, d의 최댓값
		int max = max(a, b, c, d); 	

		System.out.println("최댓값은 " + max + "입니다.");
	}

	static int max(int a, int b, int c, int d)
	{
		int max = a;
		
		if(b > max)
		{
			max = b;
		}
		
		if(c > max)
		{
			max = c;
		}
		
		if(d > max)
		{
			max = d;
		}
		
		return max;
	}
	
	
}
