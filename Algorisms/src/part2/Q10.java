package part2;

public class Q10 {

	static final int VMAX = 21; // 시력의 분포 (0.0부터 0.1 단위로 21개)

	static class PhyscData 
	{
		String name;
		int height;
		double vision;

		PhyscData(String name, int height, double vision) 
		{
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;

		for (i = 0; i < dat.length; i++)
		{
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
			{
				dist[(int) (dat[i].vision * 10)]++;
			}
		}
			
	}

	public static void main(String[] args) 
	{
		PhyscData[] x = 
		{ 
			new PhyscData("이나령", 162, 0.3), 
			new PhyscData("전서현", 173, 0.7),
			new PhyscData("이수민", 175, 2.0), 
			new PhyscData("홍준기", 171, 1.5), 
			new PhyscData("유지훈", 168, 1.2),
			new PhyscData("이호연", 174, 1.2), 
			new PhyscData("김한결", 169, 0.8), 
		};
		
		int[] vdist = new int[VMAX];

		distVision(x, vdist);
		
		for (int i = 0; i < VMAX; i++) 
		{
			System.out.printf("%3.1f~：", i / 10.0);
			for (int j = 0; j < vdist[i]; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
