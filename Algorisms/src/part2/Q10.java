package part2;

public class Q10 {

	static final int VMAX = 21; // 시력분포표 (0.0~2.0 까지) 0.1 크기만큼 범위 지정해서 총 21개의 범위

	static class PhyscData 
	{
		String name;   // 이름
		int height;    // 키
		double vision; // 시력

		PhyscData(String name, int height, double vision) 
		{
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	public static void main(String[] args) 
	{
		PhyscData[] chart = 
		{ 
			new PhyscData("강아지", 162, 0.3), 
			new PhyscData("고양이", 173, 0.7),
			new PhyscData("코끼리", 175, 2.0), 
			new PhyscData("독수리", 171, 1.5), 
			new PhyscData("돌고래", 168, 1.2),
			new PhyscData("다람쥐", 174, 1.2), 
			new PhyscData("코뿔소", 169, 0.8), 
		};
		
		int[] vc = new int[VMAX]; // 시력분포표 만큼의 배열을 생성

		visionChart(chart, vc);
		
		System.out.println("★신체검사리스트★");
		System.out.println("이름     키     시력 ");
		System.out.println("-------------");
		for(int i=0; i<chart.length; i++)
		{
			System.out.print(chart[i].name + "  ");
			System.out.print(chart[i].height + "  ");
			System.out.print(chart[i].vision + "  ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("★시력분포★");
		for (int i = 0; i < VMAX; i++) 
		{
			System.out.printf("%3.1f~：", i / 10.0);
			for (int j = 0; j < vc[i]; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void visionChart(PhyscData[] chart, int[] vc) // 시력분포표
	{
		int i = 0;
		vc[i] = 0;

		for (i = 0; i < chart.length; i++)
		{
			if (chart[i].vision >= 0.0 && chart[i].vision <= VMAX / 10.0)
			{
				vc[(int) (chart[i].vision * 10)]++;
			}
		}
			
	}

	
}
