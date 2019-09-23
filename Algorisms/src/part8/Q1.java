package part8;

public class Q1 {

	public static void main(String[] args)
	{
		String txt = "ABABCDEFGHA";
		String pat = "ABC";

		int idx = bfMatch(txt, pat);
		
		if (idx == -1)
		{
			System.out.println("텍스트에 패턴이 없습니다.");
		}
		else 
		{
			System.out.println((idx+1) + "번째 문자부터 일치합니다.");
		}
	}

	static int bfMatch(String txt, String pat) 
	{
		int pt = 0; 
		int pp = 0; 
		int count = 0; 
		int num = -1;
		
		while (pt != txt.length() && pp != pat.length()) 
		{
			if (num == pt - pp)
			{
				System.out.print("  ");
			}
			else 
			{
				System.out.print((pt - pp) + " ");
				num = pt - pp;
			}
			
			for (int i = 0; i < txt.length(); i++)
			{
				System.out.print(txt.charAt(i) + " ");
			}
			
			System.out.println();

			for (int i = 0; i < pt * 2 + 2; i++)
			{
				System.out.print(" ");
			}
			
			if(txt.charAt(pt) == pat.charAt(pp))
			{
				System.out.println("+");
			}
			else
			{
				System.out.println("|");
			}

			for (int i = 0; i < (pt - pp) * 2 + 2; i++)
			{
				System.out.print(" ");
			}

			for (int i = 0; i < pat.length(); i++)
			{
				System.out.print(pat.charAt(i) + " ");
			}
			
			System.out.println();
			System.out.println();
			count++;

			if (txt.charAt(pt) == pat.charAt(pp))
			{
				pt++;
				pp++;
			}
			else 
			{
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		
		System.out.print("비교 횟수는  " + count + "회였입니다.");
		if (pp == pat.length())
		{
			return pt - pp;
		}
		return -1;
	}
	
}
