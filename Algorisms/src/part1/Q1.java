package part1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		
		System.out.print("a�� ����");
		a = sc.nextInt();
		
		System.out.print("b�� ����");
		b = sc.nextInt();
		
		System.out.print("c�� ����");
		c = sc.nextInt();
		
		System.out.print("d�� ����");
		d = sc.nextInt();

		// a, b, c, d�� �ִ�
		int max = max(a, b, c, d); 	

		System.out.println("�ִ��� " + max + "�Դϴ�.");
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
