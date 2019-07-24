package part2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 뒤의 자릿수
		char[] cno = new char[16]; // 변환 후 값들을 저장하기 위한 배열
		
		System.out.print("정수입력： ");
		no = sc.nextInt();

		System.out.print("진수 변환  (2~16)：");
		cd = sc.nextInt();
		
		dno = cardConv(no, cd, cno); // 정수를 원하는 진수로 변환

		System.out.print(cd + "진수 변환 값 : ");
		for (int i = 0; i < dno; i++)
		{
			System.out.print(cno[i]);
		}
	}
	
	static int cardConv(int no, int cd, char[] cno) 
	{
		int digits = 0; // 변환 뒤의 나머지
		String dchar = "0123456789ABCDEF";
		int remainNo = 0; // 마지막 나머지
		
		do {
			if(digits != 0)
			{
				System.out.println(cd + " | " + "    " + no + "  ..." + dchar.charAt(no % cd));
				System.out.println("  +---------");
			}
			else
			{
				System.out.println(cd + " | " + "    " + no);
				System.out.println("  +---------");
			}
			cno[digits++] = dchar.charAt(no % cd); // r로 나눈 나머지
			
			if(no<cd)
			{
				remainNo = no;
			}
			no /= cd; // x는 몫
		} while (no != 0);

		System.out.println("        " + no + " ..." + remainNo);
		
		for (int i = 0; i < digits / 2; i++)
		{ 
			char temp = cno[i];
			cno[i] = cno[digits - i - 1];
			cno[digits - i - 1] = temp;
		}
		return digits;
	}
	

}
