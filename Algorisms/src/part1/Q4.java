package part1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
		{
			Scanner sc = new Scanner(System.in);
			int a, b, c, d;

			System.out.println("세 정수의 중간값을 구합니다.");
				
			System.out.print("a의 값：");
			a = sc.nextInt();
				
			System.out.print("b의 값：");
			b = sc.nextInt();
				
			System.out.print("c의 값：");
			c = sc.nextInt();
				
			// a, b, c의 중간값
			int cen = cen(a, b, c); 	

			System.out.println("중간값은 " + cen + "입니다.");
		}
	}

	static int cen(int a, int b, int c) 
	{
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
}
