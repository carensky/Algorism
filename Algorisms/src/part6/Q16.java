package part6;

import java.util.Arrays;
import java.util.Comparator;

public class Q16 {

	public static void main(String[] args) 
	{
		PhyscData[] x = 
		{ 
				new PhyscData("이나령", 162, 0.3), 
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이수민", 175, 2.0), 
				new PhyscData("홍준기", 171, 1.5), 
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("이호연", 174, 1.2), 
				new PhyscData("김한결", 169, 0.8), 
		};

		Arrays.sort(x, PhyscData.VISION_DESC);

		System.out.println("★   신체검사 리스트   ★");
		System.out.println("이름        키         시력");
		System.out.println("================");
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.print(x[i].name + "    " + x[i].height + "   " + x[i].vision);
			System.out.println();
		}
	}
	
	static class PhyscData 
	{
		String name;   // 이름
		int height;    // 키
		double vision; // 시력

		public PhyscData(String name, int height, double vision) 
		{
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// 시력 내림차순용 comparator
		static final Comparator<PhyscData> VISION_DESC = new VisionDesc();

		private static class VisionDesc implements Comparator<PhyscData> 
		{
			public int compare(PhyscData d1, PhyscData d2) 
			{
				if(d1.vision < d2.vision)
				{
					return 1;
				}
				else if(d1.vision > d2.vision)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		}
	}

	
}
