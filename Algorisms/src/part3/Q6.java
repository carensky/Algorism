package part3;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++)
		{
			do 
			{
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0)
		{
			System.out.println("그 값의 요소가 없습니다.");
			int insPoint = -idx - 1;
			System.out.print("삽입 포인트 : " + insPoint);
		}
		else
		{
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}

}
