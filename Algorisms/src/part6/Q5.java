package part6;

public class Q5 {

	public static void main(String[] args) 
	{
		int[] bubbleNum = {9,1,3,4,6,7,8};
		
		System.out.println("----- 버블 정렬 -----");
		
		bubbleSort(bubbleNum);
		
		for(int i=0; i<bubbleNum.length; i++)
		{
			System.out.print(bubbleNum[i] + "  ");
		}
	}

	static void bubbleSort(int[] bubbleNum)
	{
		int length = bubbleNum.length;
		int temp;
		int count = 1;
		
		for(int i=0; i<length-1; i++)
		{
			if(count % 2 == 1) // 홀수 패스
			{
				for(int j=length-1; j>i; j--)
				{
					if(bubbleNum[j-1] > bubbleNum[j])
					{
						temp = bubbleNum[j-1];
						bubbleNum[j-1] = bubbleNum[j];
						bubbleNum[j] = temp;
					}	
				}
				count ++;
			}
			else
			{
				for(int j=0; j<=i; j++)
				{
					if(bubbleNum[j] > bubbleNum[j+1])
					{
						temp = bubbleNum[j+1];
						bubbleNum[j+1] = bubbleNum[j];
						bubbleNum[j] = temp;
					}
				}
				count++;
			}
		}
	}
}
