package part1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		
		System.out.println("a�� �� : ");
		
		int a = sc.nextInt();
		
		int b;
		
		while(true)
		{
			System.out.println("b�� �� : ");
			
			b = sc.nextInt();
			
			if(b>a)
			{
				break;
			}
		
			System.out.println("a���� ū ���� �Է��ϼ��� !");
		}
		
		System.out.println("b - a�� ���� : " + (b-a));
	}

}
