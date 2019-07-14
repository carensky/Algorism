package part1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		System.out.println("n의 값 : ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=(n+1)/2; i++)
		{
			if(n%2 == 1 && i == (n+1)/2) // n이 홀수일 때
			{
				sum += i;
			}
			else
			{
				sum += i+(n-i+1);
			}
		}
		// [1,10],[2,9],[3,8],[4,7],[5,6] => 10
		// [1,9] ,[2,8],[3,7],[4,6],[5] => 9
		int result = sum ;
		
		System.out.println("값은 : " + result);
	}

}
