package part7;

public class IntSet 
{
	private int max;   // 집합의 최대 개수
	private int num;   // 집합의 요소 개수
	private int[] set; // 집합 본체
	
	public IntSet(int capacity)
	{
		num = 0;
		max = capacity;
		
		try
		{
			set = new int[max];
		}
		catch(OutOfMemoryError e)
		{
			max = 0;
		}
	}
	
	// 집합 최대 개수 반환
	public int capacity()
	{
		return max;
	}
	
	// 집합 현재 요소 개수 반환
	public int size()
	{
		return num;
	}

	// index 반환
	public int indexOf(int n)
	{
		for(int i=0; i<num; i++)
		{
			if(set[i] == n)
			{
				return i;
			}
		}
		return -1;
	}

	// 요소를 포함하는지
	public boolean contains(int n)
	{
		if(indexOf(n) != -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// 집합에 값 추가
	public boolean add(int n)
	{
		if(num >= max || contains(n) == true)
		{
			return false;
		}
		else
		{
			set[num++] = n;
			
			sort(set);
			
			return true;
		}
	}
	
	// 집합에 n 삭제
	public boolean remove(int n)
	{
		int idx;
		
		if(num <= 0 || (idx = indexOf(n)) == -1)
		{
			return false;
		}
		else
		{
			set[idx] = set[--num];
			
			return true;
		}
	}
	
	// 집합 s에 복사 
	public void copyTo(IntSet s)
	{
		int n;
		
		if(s.max < num)
		{
			n = s.max;
		}
		else
		{
			n = num;
		}
		
		for(int i=0; i<n; i++)
		{
			s.set[i] = set[i];
		}
		
		s.num = n;
	}	

		// 집합 s를 복사
		public void copyFrom(IntSet s)	
		{
			int n;
			
			if(max < s.num)
			{
				n = max;
			}
			else
			{
				n = s.num;
			}
			for (int i=0; i<n; i++)
			{
				set[i] = s.set[i];
			}
			
			num = n;
		}

		// 집합 s와 같은지 확인
		public boolean equalTo(IntSet s)	
		{
			if (num != s.num)
			{
				return false;
			}

			for (int i = 0; i < num; i++) 
			{
				int j = 0;
				for ( ; j < s.num; j++)
				{
					if (set[i] == s.set[j])
					{
						break;
					}
				}
				if (j == s.num)
				{
					return false;
				}
			}
			return true;
		}

		// 집합 s1과 s2의 합집합을 복사
		public void unionOf(IntSet s1, IntSet s2) 
		{
			copyFrom(s1);
			
			for (int i = 0; i < s2.num; i++)			
			{
				add(s2.set[i]);
			}
		}

		// 문자열로 변환
		public String toString() 
		{
			StringBuffer temp = new StringBuffer("{ ");
			for (int i = 0; i < num; i++)
			{
				temp.append(set[i] + " ");
			}
			
			temp.append("}");
			
			return temp.toString();
		}
		
		// 집합 출력
		public void output()
		{
			for(int i=0; i<num; i++)
			{
				System.out.print(set[i] + "   ");
			}
			System.out.println();
		}
		
		// 공집합인지 확인
		public boolean isEmpty()
		{
			if(num > 0)
			{
				System.out.println("공집합이다");
				return true;
			}
			else
			{
				System.out.println("공집합이 아니다");
				return false;
			}
		}
		
		// 집합이 가득 찼는지 확인
		public boolean isFull()
		{
			if(num >= max)
			{
				System.out.println("집합이 가득찼다");
				return true;
			}
			else
			{
				System.out.println("집합이 가득 차지않았다");
				return false;
			}
		}
		
		// 집합을 초기화(모든 요소 삭제)
		public void clear()
		{
			System.out.println("집합 초기화");
			num = 0;
		}
		
		// 집합S에 모든 요소를 추가하는 메소드
		public boolean addAll(IntSet s) 
		{
			if (isFull() != true && max-num >= s.num && s.num > 0)
			{
				for (int i = 0; i < s.num; i++)
				{
					add(s.set[i]);
				}
				return true;
			}
			return false;
		}
		
		// 집합S에 들어있는 요소만 남기고 삭제
		public boolean retain(IntSet s)
		{
			boolean result = false;
			
			for(int i=0; i<num; i++)
			{
				if(s.contains(set[i]) == false)
				{
					remove(set[i]);
					
					result = true;
				}
			}
				
			return result;
		}
		
		// 집합S에 들어있는 요소를 삭제
		public boolean removeAll(IntSet s)
		{
			boolean result = false;
			
			for(int i=0; i<s.num; i++)
			{
				if(contains(s.set[i]) == true)
				{
					remove(s.set[i]);
					
					result = true;
				}
			}
			
			return result;
		}
		
		// 집합 s의 부분집합인지 확인
		public boolean isSubsetOf(IntSet s)
		{
			boolean result = false;
			
			loop:
			for(int i=0; i<num; i++)
			{
				for(int j=0; j<s.num; j++)
				{
					if(set[i] == s.set[j])
					{
						result = true;
						
						break loop;
					}
				}
			}
			System.out.println(result);
			return result;
		}

		// 집합S의 진부분집합인지 확인
		public boolean isProperSubsetOf(IntSet s)
		{
			boolean result = false;
			
			loop:
			for(int i=0; i<num; i++)
			{
				for(int j=0; j<s.num; j++)
				{
					if(set[i] == s.set[j])
					{
						result = true;
						
						continue loop;
					}
					else
					{
						result = false;
					}
				}
				
				if(!result)
				{
					break loop;
				}
			}
			System.out.println(result);
			return result;
		}

		// s1과 s2의 교집합을 복사
		public void intersectionOf(IntSet s1, IntSet s2) 
		{
			for (int i = 0; i < s1.num; i++)
			{
				if (s2.contains(s1.set[i]))
				{
					add(s1.set[i]);
				}	
			}
		}
		
		// s1과 s2의 차집합을 복사
		public void differenceOf(IntSet s1, IntSet s2) 
		{
			for (int i = 0; i < s1.num; i++)
			{
				if (!s2.contains(s1.set[i]))
				{
					add(s1.set[i]);
				}
			}
		}

		public void sort(int[] set)
		{
			for(int i=1; i<num; i++)
			{
				int j;
				int temp = set[i];
				
				for(j=i; j>0 && set[j-1]>temp; j--)
				{
					set[j] = set[j-1];
				}
				set[j] = temp;
			}
		}
}
