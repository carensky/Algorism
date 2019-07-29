package part3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) 
	{
		int[] num = {1,2,3,1,5,3,6,2,7,1,9};
		Scanner sc = new Scanner(System.in);
		int idxNum = 0;
		
		System.out.print("입력값 : ");
		int input = sc.nextInt();
		
		int count = searchIdx(num, input);
		
		int[]idx = new int[count];
		
		for(int j=0; j<num.length; j++)
		{
			if(num[j]==input)
			{
				idx[idxNum] = j;
				idxNum++;
			}
			
		}
		
		System.out.println("배열 idx : " + Arrays.toString(idx));
		System.out.println("배열 idx의 개수 : " + idx.length);
	}
	
	static int searchIdx(int[]num, int input)
	{
		int count = 0;
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==input)
			{
				count ++;
			}
		}
		return count;
	}
}
