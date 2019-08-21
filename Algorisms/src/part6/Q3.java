package part6;

public class Q3 {

	public static void main(String[] args) 
	{
		int[] bubbleNum = {6,4,3,7,1,9,8};
		
		System.out.println("----- 버블 정렬 -----");
		
		bubbleSort(bubbleNum);
		
		
	}

	static void bubbleSort(int[] bubbleNum)
	{
		int length = bubbleNum.length;
		int temp;
		int count = 1;
		int exchangeCount = 0;
		int compareCount = 0;
		
		for(int i=0; i<length-1; i++)
		{
			int exchg = 0;
			System.out.println("패스 " + count);
			
			for(int j=length-1; j>=i; j--)
			{
				if(j==0)
				{
					for(int k=0; k<bubbleNum.length; k++)
					{
						System.out.print(bubbleNum[k] + "   ");
					}
					System.out.println();
				}
				else if(bubbleNum[j-1] > bubbleNum[j])
				{
					compareCount++;
					for(int k=0; k<bubbleNum.length; k++)
					{
						if(k == j-1)
						{
							exchangeCount ++;
							System.out.print(bubbleNum[k] + " + ");
						}
						else
						{
							System.out.print(bubbleNum[k] + "   ");
						}
					}
					System.out.println();
					temp = bubbleNum[j-1];
					bubbleNum[j-1] = bubbleNum[j];
					bubbleNum[j] = temp;
					exchg++;
				}
				else
				{
					compareCount++;
					for(int k=0; k<bubbleNum.length; k++)
					{
						if(k == j-1)
						{
							System.out.print(bubbleNum[k] + " - ");
						}
						else
						{
							System.out.print(bubbleNum[k] + "   ");
						}
					}
					System.out.println();
				}
			}
			
			if(exchg == 0)
			{
				break;
			}
			
			count++;
		}
		
		System.out.println("***********************************");
		System.out.println("비교를 " + compareCount + "회 했습니다.");
		System.out.println("교환을 " + exchangeCount + "회 했습니다.");
	}

}
