package part5;

public class Q6 {

	static String[] num = {"A", "B", "C"};
	
	public static void main(String[] args) 
	{
		Util input = new Util();
		System.out.println("-----하노이의 탑-----");
		int n = input.scan();
		
		move(n,1,3);
		
	}
	
	static void move(int n, int x, int y)
	{
		if(n > 1)
		{
			move(n-1, x, 6-x-y);
		}
		
		System.out.println("원반[" + n + "]을 " + num[x-1] + "기둥에서 " + num[y-1] + "기둥으로 옮김");
		 
		if(n > 1)
		{
			move(n-1, 6-x-y, y);
		}
		
		
	}

}
