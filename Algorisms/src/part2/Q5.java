package part2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소 개수 입력 : ");
		int input = sc.nextInt();
		int[] num1 = new int[input]; // num배열
		int[] num2 = new int[input]; // num2 배열
		
		for(int i=0; i<input; i++) // num배열 값 입력
		{
			System.out.println(i + "번째 요소 값을 입력 : ");
			num1[i] = sc.nextInt(); // 배열의 값 추가
		}
		
		copy(num1, num2); // num 배열내에 모든 요소를 num2에 복사
	}
	
	static void copy(int[] num1, int[] num2)
	{
		int temp; 
		
		num2 = num1.clone();
		
		for(int i=0; i<num1.length/2; i++)
		{
			temp = num1[num1.length-1-i];
			num2[num1.length-1-i] = num1[i];
			num2[i] = temp;
		}
		
		System.out.println("num1 배열의 값 : ");
		
		for(int i=0; i<num1.length; i++)
		{
			System.out.print(num1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("num2 배열의 값 : ");
		
		for(int i=0; i<num2.length; i++)
		{
			System.out.print(num2[i] + " ");
		}
	}

}
