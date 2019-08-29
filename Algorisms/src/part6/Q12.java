package part6;

import part4.IntStack;

public class Q12 {

	public static void main(String[] args) 
	{
		int[] a = {5,8,4,2,6,1,3,9,7};
		
		System.out.println("--------비재귀 퀵정렬--------");
		System.out.println();
		
		quickSort(a, 0, a.length-1);
		
		System.out.println("*************오름차순 정렬**************");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
	}

	static void quickSort(int[] a, int left, int right)
	{
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true)
		{
			int pl    = left  = lstack.pop(); // 초기값 a[0]
			int pr 	  = right = rstack.pop(); // 초기값 a[8]
			int pivot = a[(left+right)/2];    // 초기값 a[4]
			
			System.out.println("------------------------------------------");
			System.out.print("a[" + left + "] ~ " + "a[" + right + "] : ");
			
			for(int i=left; i<=right; i++)
			{
				System.out.print(a[i] + "   ");
			}
			
			System.out.println();
			
			System.out.println("========SWAP PROCESS========");
			
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
					
					System.out.print("              ");
					
					for(int i=0; i<9; i++)
					{
						System.out.print(a[i] + "   ");
					}
					System.out.println();
				}
			}
			while(pl <= pr);
		
			if (pr - left < right - pl) 
			{
				swap2(left, pl);
				swap2(right, pr);
			}
			
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
	
	static void swap2(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
}
