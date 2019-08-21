package part6;

public class Q1 {

	public static void main(String[] args) 
	{
		int[] bubbleNum = {32,45,12,3,67,23,50};
		
		System.out.println("----- 버블 정렬 -----");
		
		bubbleSort(bubbleNum);
		
		for(int i=0; i<bubbleNum.length; i++)
		{
			if(bubbleNum[i]== bubbleNum[bubbleNum.length-1])
			{
				System.out.print(bubbleNum[i]);
			}
			else
			{
				System.out.print(bubbleNum[i] + " / ");
			}
		}
	}

	static void bubbleSort(int[] bubbleNum)
	{
		int length = bubbleNum.length;
		int temp;
		
		for(int i=length-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(bubbleNum[j] > bubbleNum[j+1])
				{
					temp = bubbleNum[j+1];
					bubbleNum[j+1] = bubbleNum[j];
					bubbleNum[j] = temp;
				}
			}
		}
	}
}
