package part1;

import java.util.Scanner;

public class Q5 {

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
		if((b >= a && c <= a) || (b <= a && c >= a))
		{
			return a;
		}
		else if((a > b && c < b) || (a < b && c > b))
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}
