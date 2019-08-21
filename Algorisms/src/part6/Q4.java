package part6;

public class Q4 {

	public static void main(String[] args) 
	{
		int[] bubbleNum = {9,1,3,4,6,7,8};
		
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
		int q = 0;
		
		while(q<length-1)
		{
			System.out.println("패스 " + count);
			int last = length - 1;
			
			for(int j=length-1; j>=q; j--)
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
					last = j;
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
			
			q = last;
			count++;
		}
		
		System.out.println("***********************************");
		System.out.println("비교를 " + compareCount + "회 했습니다.");
		System.out.println("교환을 " + exchangeCount + "회 했습니다.");
	}

}
