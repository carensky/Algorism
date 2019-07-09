package part1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		
		System.out.println("a의 값 : ");
		
		int a = sc.nextInt();
		
		int b;
		
		while(true)
		{
			System.out.println("b의 값 : ");
			
			b = sc.nextInt();
			
			if(b>a)
			{
				break;
			}
		
			System.out.println("a보다 큰 값을 입력하세요 !");
		}
		
		System.out.println("b - a의 값은 : " + (b-a));
	}

}
