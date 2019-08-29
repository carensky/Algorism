package part6;

public class Q10 {

	public static void main(String[] args) 
	{
		int[] a = {5,8,4,2,6,1,3,9,7};
		
		System.out.println("-----퀵정렬-----");
		
		quickSort(a, a.length);
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("a[" + i + "]＝" + a[i]);
		}
	}
	
	static void quickSort(int[] a, int n) 
	{
		quickSort(a, 0, n - 1);
	}

	static void quickSort(int[] a, int left, int right)
	{
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

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
		
	static void swap(int[] a, int idx1, int idx2) 
	{
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}	
	
	
}
