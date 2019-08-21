package part6;

public class Q8 {

	public static void main(String[] args) 
	{
		int[] num = {3,2,6,9,1,4};
		
		insertSort(num);
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + "   ");
		}
	}

	static void insertSort(int[] num)
	{
		int temp;        // 임시 값
		int indexTemp;  // 임시 인덱스 
		
		for(int i=1; i<num.length; i++)
		{
			temp = num[i];
			
			indexTemp = binaryAndInsertSearch(num, 0, i, temp);
		
			for(int j=i-1; j>=indexTemp; j--)
			{
				num[j+1] = num[j];
			}
		
		num[indexTemp] = temp;	
		}
	}
	
	static int binaryAndInsertSearch(int[] num, int min, int max, int temp)
	{
		int center;
		
		if(max >= min)
		{
			center = min + (max-min)/2;
		
			if(num[center] == temp)
			{
				return center;
			}
			else if(num[center] > temp) // 중간값이 더 클 때는 최소값부터 중간값-1까지 다시 탐색
			{
				return binaryAndInsertSearch(num, min, center-1, temp);
			}
			else // 중간값이 더 작을 때는 중간값+1부터 최대값 까지 다시 탐색
			{
				return binaryAndInsertSearch(num, center+1, max, temp);
			}
		}
		else
		{
			return min;
		}
	}
	
	
}
