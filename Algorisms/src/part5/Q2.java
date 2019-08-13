package part5;

public class Q2 {

	public static void main(String[] args) 
	{
		Util input = new Util();
		int num1 = input.scan();
		int num2 = input.scan();
		
		int result = gcd(num1, num2);
		
		System.out.println("최대공약수는 : " + result);
		
	}

	static int gcd(int num1, int num2)
	{
		int temp;
		
		if(num2 > num1)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		while(true)
		{
			int temp2;
			
			if(num1 % num2 == 0)
			{
				return num2;
			}
			else
			{
				temp2 = num2;
				num2 = num1 % num2;
				num1 = temp2;
			}
		}
	}
}
