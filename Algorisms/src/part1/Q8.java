package part1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ �� * 5�� ���մϴ�.");
		
		System.out.println("n�� �� : ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<n; i++)
		{
			sum += i;
		}
		
		int result = sum * 5;
		
		System.out.println("���� : " + result);
	}

}
