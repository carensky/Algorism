package part1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�. ");
		
		System.out.println("n�� �� : ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<n; i++)
		{
			sum += i;
		}
		
		System.out.println("���� : " + sum);
		
	}

}
