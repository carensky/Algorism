package part6;

public class Q6 {

	public static void main(String[] args) 
	{
		int[] num = {6,4,8,3,1,9,7};
		
		selectionSort(num);
		
		System.out.println("--------------------------");
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + "   ");
		}
	}
	
	static void selectionSort(int[] num)
	{
		for (int i = 0; i < num.length - 1; i++) 
		{
			int min = i; 
			
			for (int j = i + 1; j < num.length; j++)
			{
				if (num[j] < num[min])
				{
					min = j;
				}
			}
			
			for (int k = 0; k < num.length; k++)
			{
				if(k==i)
				{
					System.out.print("*   ");
				}
				else if(k == min)
				{
					System.out.print("+   ");
				}
				else
				{
					System.out.print("    ");
				}
			}
			System.out.println();
			
			for (int q = 0; q < num.length; q++)
			{
				System.out.print(num[q] + "   ");
			}
			System.out.println();
			swap(num, i, min); // 미정렬된 부분 머리요소와 최소 요소를 교환
		}
	}
	static void swap(int[] num, int j, int min)
	{
		int temp;
		
		temp = num[j];
		num[j] = num[min];
		num[min] = temp;
	}

}
