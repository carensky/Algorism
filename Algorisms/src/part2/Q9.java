package part2;

import java.util.Scanner;

public class Q9 {

	static int[][] days = 
	{ 
		{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년(2월이 28일까지 있음)
		{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년(2월이 29일까지 있음)
	};

	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);

		System.out.println("그 해 경과 일 수를 구합니다.");
		System.out.print("년 : ");
		int year = stdIn.nextInt(); // 년
		System.out.print("월 : ");
		int month = stdIn.nextInt(); // 월
		System.out.print("일 : ");
		int day = stdIn.nextInt(); // 일

		System.out.print("남은 일 수는 " + (365 + checkYear(year, month, day) - dayOfYear(year, month, day))); // 평년일 때는 1년이 365일, 윤년일 때는 366일
	}

	static int dayOfYear(int year, int month, int day)
	{
		int checkYear = checkYear(year, month, day);
		
		while(--month != 0) // 입력한 달의 저번달부터 계산한다. 입력한 달의 일수는 day에 가지고 있기때문에
		{
			day += days[checkYear][month-1];
		}
		
		return day;
	}
		
	static int checkYear(int year, int month, int day)
	{
		int checkYear = 0; // 평년인지, 윤년인지 체크를 위한 변수
		
		if(year%4==0 && year%100!=0 || year%400==0) // 4로 나누었을 때 나머지는 없어야하지만, 100으로 나누었을 땐 나머지가 있어야한다. 또한 400으로 나누었을 때는 윤년으로 친다.
		{
			checkYear = 1; // 윤년
		}
		else
		{
			checkYear = 0; // 평년
		}
		return checkYear;
	}

}
