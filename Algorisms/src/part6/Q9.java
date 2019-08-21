package part6;

public class Q9 {

	/* num의 개수가 4의 배수일때만 제대로 작동된다.ㅠㅠ */
	public static void main(String[] args) 
	{
		int[] num = {3,6,8,9,4,5,11,1};
		int[] num2 = {3,6,8,9,4,5,11,1};
		
		int count = shellSort(num);
		int count2 = shellSort2(num2);
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + "   ");
		}
		System.out.println();
		System.out.println("이동횟수는 " + count);
		
		for(int i=0; i<num2.length; i++)
		{
			System.out.print(num2[i] + "   ");
		}
		System.out.println();
		System.out.println("이동횟수는 " + count2);
	}

	static int shellSort(int[] num)
	{
		int count = 0;
		
		for(int i=num.length/2; i>0; i/=2)
		{
			for(int j=i; j<num.length; j++)
			{
				int temp = num[j];
				
				for(int k=j-i; k>=0; k-=i)
				{
					if(num[k] > temp)
					{
						temp = num[k];
						num[k] = num[j];
						num[j] = temp;
						count++;
					}
				}
			}
		}
		return count;
	}
	
	static int shellSort2(int[] num2)
	{
		int count2 = 0; // 옮김 횟수
		int h;
		for (h = 1; h < num2.length / 9; h = h * 3 + 1)
			;

		for (; h > 0; h /= 3)
			for (int i = h; i < num2.length; i++) 
			{
				int j;
				int tmp = num2[i];
				for (j = i - h; j >= 0 && num2[j] > tmp; j -= h) 
				{
					num2[j + h] = num2[j];
					count2++;
				}
				num2[j + h] = tmp;
				count2++;
			}
		
		return count2;
	}
}
