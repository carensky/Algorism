package part2;

public class Q6 {

	public static void main(String[] args) 
	{
		int preAdd = 0;
		int nextAdd = 0;
		
		int i = 1;
		preAdd = ++i;
		
		System.out.println("전위 연산 : " + preAdd);
		System.out.println("i = " + i);
		
		int j = 1;
		nextAdd = i++;
		
		System.out.println("후위 연산 : " + nextAdd);
		System.out.println("j = " + j);
	}

		
		
		
	
}
