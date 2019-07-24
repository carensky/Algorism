package part2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int temp;
		
		System.out.println("요소 개수 입력 : ");
		int input = sc.nextInt(); // 입력값 개수 
		
		int[] num = new int[input]; // 입력값 개수만큼 배열을 생성
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(i + "번째 요소 값을 입력 : ");
			num[i] = sc.nextInt(); // 배열의 값 추가
		}
		
		System.out.println("---요소의 값--- ");
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + " "); // 배열 요소의 값들을 순서대로 정렬
		}
		
		System.out.println();
		
		for(int i=0; i<num.length/2; i++)
		{
			temp = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = temp;
		}
		
		System.out.println("---요소를 역순 정렬---");
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] + " "); // 배열 요소의 값들을 역순으로 정렬
		}
	}
}
