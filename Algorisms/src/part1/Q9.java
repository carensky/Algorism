package part1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		
		System.out.println("a�� �� : ");
		
		int a = sc.nextInt();
		
		System.out.println("b�� �� : ");
		
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i=a; i<=b; i++)
		{
			sum += i;
		}
		
		System.out.println("���� : " + sum);
		
	}

}
