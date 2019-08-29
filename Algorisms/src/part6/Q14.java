package part6;

import java.util.Scanner;

import part4.IntStack;

public class Q14 {

	public static void main(String[] args) 
	{
		int[] a = {5,8,4,2,6,1,3,9,7};
		
		System.out.println("-----------------퀵정렬-----------------");
		
		System.out.println("----------0은 재귀, 1은 비재귀 선택----------");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if(choice == 0)
		{
			// quick sort
			if(a.length > 9)
			{
				quickSort(a, 0, a.length-1);
			}
			// insert sort
			else
			{
				Q8 q8 = new Q8();
				q8.insertSort(a);
				
				for(int i=0; i<a.length; i++)
				{
					System.out.print(a[i] + "   ");
				}
			}
		}
		else
		{
			// quick sort
			if(a.length > 9)
			{
				quickSortRES(a, 0, a.length-1);
			}
			// insert sort
			else
			{
				Q8 q8 = new Q8();
				q8.insertSort(a);
				
				for(int i=0; i<a.length; i++)
				{
					System.out.print(a[i] + "   ");
				}
			}
		}
	}
	
	static void quickSort(int[] a, int left, int right)
	{
		int pl = left;
		int pr = right;
		int x = version1(a[pl], a[(pl+pr)/2], a[pr]);

		do 
		{
			while (a[pl] < x)
			{
				pl++;
			}
			while (a[pr] > x)
			{
				pr--;
			}
			if (pl <= pr)
			{
				swap(a, pl++, pr--);
			}
		} 
		while (pl <= pr);

		if (left < pr) 
		{
			quickSort(a, left, pr);
		}
		if (pl < right)
		{
			quickSort(a, pl, right);
		}
	}
	
	static void quickSortRES(int[] a, int left, int right)
	{
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true)
		{
			int pl    = left  = lstack.pop(); // 초기값 a[0]
			int pr 	  = right = rstack.pop(); // 초기값 a[8]
			int pivot = version1(a[pl], a[(pl+pr)/2], a[pr]);   // 초기값 a[4]
			
			do
			{
				while(a[pl] < pivot) 
				{
					pl++;
				}
				
				while(a[pr] > pivot)
				{
					pr--;
				}

				if(pl <= pr)
				{
					swap(a,pl++, pr--);
				}
			}
			while(pl <= pr);
		
			if(left < pr)
			{
				lstack.push(left);
				rstack.push(pr);
			}
		
			if(pl < right)
			{
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) 
	{
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static int version1(int pl, int pivot, int pr)
	{
		if(pl>= pivot)
		{
			if(pivot >= pr)
			{
				return pivot;
			}
			else if(pl <= pr)
			{
				return pl;
			}
			else
			{
				return pr;
			}
		}
		else if(pl > pr)
		{
			return pl;
		}
		else if(pivot > pr)
		{
			return pr;
		}
		else
		{
			return pivot;
		}
	}
}
