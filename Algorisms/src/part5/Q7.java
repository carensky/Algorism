package part5;

public class Q7 {

	public static void main(String[] args) 
	{
		System.out.println("-----하노이의 탑-----");
		
		Util input = new Util();
		int n = input.scan();
		
		move(3,1,3);
		
	}

	static void move(int n, int x, int y)
	{
		int[] first  = new int[10];
		int[] second = new int[10];
		int[] third  = new int[10];
		
		int num = n;
		
		for(int i=0; n>0; n--)
		{
			first[i] = n;
		}
		
		// first[0]=3;
		// first[1]=2;
		// first[2]=1; 
		//  1
		//  2
		//  3
		// 이런식의 구조로..
		
		while(true)
		{
			if(num > 0)
			{
				y = 6-x-y;
				num--;
				continue;
			}
		
		System.out.println();
		
		//3  3,1,3
		//2  3,1,2
		//1  3,1,3
		}
		
		
	}
}
