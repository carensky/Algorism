package part1;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int a = sc.nextInt();
		
		int n=0;
		
		while(a > 0)
		{
			a /=10;
			n++;
		}
		
		System.out.println("�ڸ� ���� : " + n + "�ڸ� �Դϴ�.");
	}

}
