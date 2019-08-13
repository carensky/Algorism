package part5;

public class Q1 {

	public static void main(String[] args) 
	{
		Util input = new Util();
		
		int num = input.scan();
		
		int total = factorial(num);
		
		System.out.println(num + "! = " + total);
	}

	static int factorial(int num)
	{
		int total = 1;
		
		while(num > 0)
		{
			total *= num;
			num--;
		}
		
		return total;
	}
	
}
