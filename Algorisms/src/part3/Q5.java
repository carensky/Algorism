package part3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] num = {1,2,3,2,3,6,7,8,9};
		System.out.print("입력값 : ");
		int input = sc.nextInt();
		
		int result = binSearch(num,input);
		
		if(result == -1)
		{
			System.out.println("입력값이 존재하지 않습니다.");
		}
		else
		{
			System.out.println("입력값 " + input + "은 num[" + result +"]에 있습니다.");
		}
		
	}

	static int binSearch(int[] num, int input)
	{
		int start = 0;
		int end = num.length-1;
		
		do 
		{
			int center = (start + end)/2;
			
			if(num[center] == input) // 중간값이 입력값일 때
			{
				for(int i=0; i<center; i++)
				{
					if(num[i] == input)
					{
						return i;
					}
				}
				
				return center;
			}
			else if(num[center] < input)
			{
				start = center + 1;
			}
			else
			{
				end = center - 1;
			}
			
		}while(start <= end);
		
		return -1;
	}

}
