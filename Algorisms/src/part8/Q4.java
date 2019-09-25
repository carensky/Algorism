package part8;

public class Q4 {

	public static void main(String[] args) 
	{
		String txt = "ABABCDEFGHA";
		String pat = "ABC";

		bmMatch(txt, pat);
		
		int idx = bmMatch(txt, pat);
		
		if (idx == -1)
		{
			System.out.println("텍스트에 패턴이 없습니다.");
		}
		else 
		{
			System.out.println((idx+1) + "번째 문자부터 일치합니다.");
		}
	}

	static int bmMatch(String txt, String pat) 
	{
		int pt;								
		int pp;								
		int txtLen = txt.length();			
		int patLen = pat.length();			
		int[] skip = new int[Character.MAX_VALUE + 1];	// 표
		int count = 0;
		int num = -1;
		
		for (pt = 0; pt <= Character.MAX_VALUE; pt++)
		{
			skip[pt] = patLen;
		}
		
		for (pt = 0; pt < patLen - 1; pt++)
		{
			skip[pat.charAt(pt)] = patLen - pt - 1;	
		}
		
		while (pt < txtLen)
		{
			pp = patLen - 1;		

			if (num == pt - pp)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print(pt - pp + " ");
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
			
			while (txt.charAt(pt) == pat.charAt(pp)) 
			{
				if (pp == 0)
				{
					return pt;
				}
				pp--;
				pt--;
			}
			if((skip[txt.charAt(pt)] > patLen - pp))
			{
				pt += skip[txt.charAt(pt)];
			}
			else
			{
				pt += patLen - pp;;
			}
		}
		return -1;				
	}
}
