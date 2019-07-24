package part2;

import java.util.Scanner;

public class Q11 {

	static class YMD 
	{
		int y;
		int m;
		int d;

		YMD(int y, int m, int d) 
		{
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		static int[][] day = 
		{ 
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
		};
		
		YMD afterDay(int after)
		{
			YMD ymd = new YMD(y,m,d);
			
			if(ymd.y%4==0 && ymd.y%100!=0 || ymd.y%400==0) // 4로 나누었을 때 나머지는 없어야하지만, 100으로 나누었을 땐 나머지가 있어야한다. 또한 400으로 나누었을 때는 윤년으로 친다.
			{
				ymd.d += after; // 오늘 일에 n일 후 만큼 더한다. 
				
				while(ymd.d>day[1][ymd.m-1])
				{
					ymd.d -= day[1][ymd.m-1]; // 오늘 일에 n일 만큼 더한 값에서 해당 달에 일 수만큼 빼준다.
					ymd.m++;
					if(ymd.m>12)
					{
						ymd.y++;
						ymd.m = 1;
					}
				}
			}
			else
			{
				ymd.d += after; // 오늘 일에 n일 후 만큼 더한다. 
				
				while(ymd.d>day[0][ymd.m-1])
				{
					ymd.d -= day[0][ymd.m-1]; // 오늘 일에 n일 만큼 더한 값에서 해당 달에 일 수만큼 빼준다.
					ymd.m++;
					if(ymd.m>12)
					{
						ymd.y++;
						ymd.m = 1;
					}
				}
			}
			return ymd;
		}
		
		YMD beforeDay(int before)
		{
			YMD ymd = new YMD(y,m,d);
			
			if(ymd.y%4==0 && ymd.y%100!=0 || ymd.y%400==0) // 4로 나누었을 때 나머지는 없어야하지만, 100으로 나누었을 땐 나머지가 있어야한다. 또한 400으로 나누었을 때는 윤년으로 친다.
			{
				ymd.d -= before; // 오늘 일에 n일 후 만큼 뺀다. 
				
				while(ymd.d<1)
				{
					ymd.m--;
					
					if(m<1)
					{
						ymd.y--;
						ymd.m = 12;
					}
					
					ymd.d += day[1][ymd.m-1]; // 오늘 일에 n일 만큼 더한 값에서 해당 달에 일 수만큼 더해준다.
				}
			}
			else
			{
				ymd.d -= before; // 오늘 일에 n일 후 만큼 뺀다. 
				
				while(ymd.d<1)
				{
					ymd.m--;
					
					if(m<1)
					{
						ymd.y--;
						ymd.m = 12;
					}
					
					ymd.d += day[0][ymd.m-1]; // 오늘 일에 n일 만큼 더한 값에서 해당 달에 일 수만큼 더해준다.
				}
			}
			return ymd;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 입력 : ");
		int y = sc.nextInt();
		System.out.print("월 입력 : ");
		int m = sc.nextInt();
		System.out.print("일 입력 : ");
		int d = sc.nextInt();
		System.out.print("n일 뒤 날짜 입력 : ");
		int after = sc.nextInt();
		System.out.print("n일 전 날짜 입력 : ");
		int before = sc.nextInt();
		
		YMD day = new YMD(y, m, d);
		YMD nextDate = day.afterDay(after);
		YMD preDate  = day.beforeDay(before);
		System.out.println("n일 뒤 날짜는 : " + nextDate.y + " / " + nextDate.m + " / " + nextDate.d);
		System.out.println("n일 전 날짜는 : " + preDate.y + " / " + preDate.m + " / " + preDate.d);
		
	}

}
