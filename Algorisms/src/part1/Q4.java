package part1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
		{
			Scanner sc = new Scanner(System.in);
			int a, b, c, d;

			System.out.println("�� ������ �߰����� ���մϴ�.");
				
			System.out.print("a�� ����");
			a = sc.nextInt();
				
			System.out.print("b�� ����");
			b = sc.nextInt();
				
			System.out.print("c�� ����");
			c = sc.nextInt();
				
			// a, b, c�� �߰���
			int cen = cen(a, b, c); 	

			System.out.println("�߰����� " + cen + "�Դϴ�.");
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
