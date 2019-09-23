package part8;

public class Q2 {

	public static void main(String[] args) 
	{
		String txt = "ABABCDEFGHA";
		String pat = "ABC";

		int idx = bfMatchLast(txt, pat);
		
		if (idx == -1)
		{
			System.out.println("텍스트에 패턴이 없습니다.");
		}
		else 
		{
			System.out.println((idx+1) + "번째 문자부터 일치합니다.");
		}
	}

	static int bfMatchLast(String txt, String pat)
	{
		int pt = txt.length() - 1; 
		int pp = pat.length() - 1; 

		while (pt >= 0 && pp >= 0) 
		{
			if (txt.charAt(pt) == pat.charAt(pp))
			{
				pt--;
				pp--;
			}
			else 
			{
				pt--;
				pp = pat.length() - 1;
			}
		}
		if (pp < 0) 
		{
			return pt + 1;
		}
		else
		{
			return -1;
		}
	}
}
