package part6;

import java.util.Scanner;

public class Q18 
{
	public static void main(String[] args) 
	{
		int[] x = {3,4,2,5,6,7,1,9,10};
		int nx = x.length;
		
		int max = x[0];
		for (int i = 1; i < nx; i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		
		fSort(x, nx, max);

		for (int i = 0; i < nx; i++)
		{
			System.out.println("x[" + i + "]＝" + x[i]);
		}
	}
	static void fSort(int[] a, int n, int max) 
	{
		int[] f = new int[max + 1];
		int[] b = new int[n];

		System.out.println("1단계"); // 1단계
		
		for (int i = 0; i < n; i++) 
		{
			for (int k = 0; k <= max; k++)
			{
				System.out.print("   " + f[k]);
			}
			System.out.println();
			f[a[i]]++;
		}
		for (int k = 0; k <= max; k++)
		{
			System.out.print("   " + f[k]);
		}
		System.out.println();

		System.out.println("2단계"); // 2단계
		
		for (int i = 1; i <= max; i++) 
		{
			for (int k = 0; k <= max; k++)
			{
				System.out.print("   " + f[k]);
			}
			System.out.println();
			f[i] += f[i - 1];
		}
		
		for (int k = 0; k <= max; k++)
		{
			System.out.print("   " + f[k]);
		}
		System.out.println();

		System.out.println("3단계"); // 3단계
		for (int i = n - 1; i >= 0; i--) 
		{
			for (int k = 0; k < n; k++)
			{
				System.out.print("   " + b[k]);
			}
			System.out.println();
			b[--f[a[i]]] = a[i];
		}
		for (int k = 0; k < n; k++)
		{
			System.out.print("   " + b[k]);
		}
		System.out.println();

		for (int i = 0; i < n; i++)
		{
			a[i] = b[i]; // 4단계
		}
	}
}
