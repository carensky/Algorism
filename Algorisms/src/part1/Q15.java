package part1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ﰢ���� ����մϴ�.");
		
		System.out.println("�ܼ� : ");
		
		int n = sc.nextInt();
		
		System.out.println("-----���� �Ʒ� ���� �ﰢ��-----");
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----���� �� ���� �ﰢ��-----");
		for(int i=0; i<n; i++)
		{
			for(int j=n-i; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----������ �� ���� �ﰢ��-----");
		for(int i=0; i<n; i++)
		{
			for(int k=0; k<i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=n-i; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----������ �Ʒ� ���� �ﰢ��-----");
		for(int i=1; i<=n; i++)
		{
			for(int k=n; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
