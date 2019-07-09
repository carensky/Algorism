package part2;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) 
	{
		Random rand = new Random();

	    System.out.println("키의 최대값");
	    int num = 1 + rand.nextInt(10);      // 난수 생성
	    int[] height = new int[num];         // 난수로 생긴 num 만큼 배열을 생성

	    for (int i = 0; i < num; i++) 
	    {
	       height[i] = 100 + rand.nextInt(90);      
	       System.out.println("height[" + i + "]：" + height[i]);
	    }

	    System.out.println("최대값은 " + max(height));
	}
	
	static int max(int[] a) 
	{
	    int max = a[0];
	    for (int i = 1; i < a.length; i++)
	    {
	    	if (a[i] > max)
	    	{
	    		max = a[i];
	    	}
		    
	    }
	    return max;
	}

}
