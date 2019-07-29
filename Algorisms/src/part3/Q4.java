package part3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] num = {1,2,3,4,5,6,7,8,9};
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
		
		System.out.print("   |  ");
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + "   ");
		}
		
		System.out.println();
		System.out.print("---+");
		
		for(int j=0; j<num.length; j++)
		{
			System.out.print("----");
		}
		System.out.println();
		
		do 
		{
			int center = (start + end)/2;
			
			System.out.print("   | ");
			
			for(int k=0; k<=end; k++)
			{
				if(k == center)
				{
					System.out.print(" + ");
				}
				else if(k == start)
				{
					System.out.print(" <- ");
				}
				else if(k == end)
				{
					System.out.print(" -> ");
					System.out.println();
				}
				else
				{
					System.out.print("    ");
				}
			}
			
			
			if(num[center] == input) // 중간값이 입력값일 때
			{
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
			
			//System.out.print(num[center] + "|");
			
			
		}while(start <= end);
		
		return -1;
	}
}
