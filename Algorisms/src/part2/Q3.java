package part2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소 개수 입력 : ");
		int input = sc.nextInt();
		int[] num = new int[input];
		
		for(int i=0; i<input; i++)
		{
			System.out.println(i + "번째 요소 값을 입력 : ");
			num[i] = sc.nextInt(); // 배열의 값 추가
		}
		
		sumOf(num); // 배열내에 모든 요소의 합계
	}
	
	static void sumOf(int[] num)
	{
		int total = 0;
		
		System.out.print("배열내에 모든 요소의 합은 : ");
		
		for(int i=0; i<num.length; i++)
		{
			total += num[i];
		}
		
		System.out.print(total);		
	}
	
	

}
