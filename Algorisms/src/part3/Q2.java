package part3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num+1]; // 보초법으로 요소의 개수를 1개 더 늘려서 배열 생성
		
		for(int i=0; i<num; i++)
		{
			System.out.print( i + "번쨰의 값 : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 입력 : "); 
		
		int input = sc.nextInt();
		
		int result = findNumber(x,num, input); // x,4,2
		
		if(result == -1)
		{
			System.out.println("해당하는 요소의 값이 없습니다.");
		}
		else
		{
			System.out.println("해당하는 요소의 값은 x[" + result + "]에 있습니다.");
		}
		
	}

	static int findNumber(int[]x, int num, int input)
	{
		x[num] = input;
		int result = -1;
		
		System.out.print("   |");
		
		for(int j=0; j<num; j++)
		{
			System.out.print("   " + j );
		}
		
		System.out.println();
		
		System.out.print("---+");
		
		for(int k =0; k<num; k++)
		{
			System.out.print("----");
		}
		System.out.println();
		
		for(int i=0; i<num; i++)
		{
			System.out.print("   |");
			
			for(int q=0; q<i; q++)
			{
				System.out.print("    ");
			}
			System.out.println("   *");
			
			System.out.print("  " + i + "| ");
			
			for(int y=0; y<num; y++)
			{
				System.out.print("  " + x[y] + " ");
			}
			System.out.println();
			System.out.println("   |");
			
			if(x[i] == input)
			{	
				System.out.println(i + "번째는 " + x[i]);
				result = i;
				break;
			}
		}
		return result;
			
	}
}
