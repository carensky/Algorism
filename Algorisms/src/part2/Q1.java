package part2;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Random ran = new Random();

	    System.out.println("---사람 수와 키 랜덤 생성---");
	    
	    int people = ran.nextInt(10); // 사람 수 랜덤 생성
	    
	    int[] height = new int[people]; // 랜덤 생성된 사람들 수 만큼 height 배열 생성

	    for (int i = 0; i < people; i++) 
	    {
	       height[i] = 100 + ran.nextInt(100); // height 배열에 값들을 난수로 설정
	    }
	    
	    peopleData(height);
	}
	
	static void peopleData(int[] height)
	{
		for(int i=0; i<height.length; i++)
		{
			System.out.println(i + "번째 사람의 키는 : " + height[i]);
		}
	}
}
