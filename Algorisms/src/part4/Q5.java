package part4;

public class Q5 {
	private int max;   // 큐의 용량
	private int front; // 첫번째 요소 커서
	private int rear;  // 마지막 요소 커서
	private int num;   // 현재 데이터 수
	private int[] que; // 큐 본체
	
	private class EmptyIntQueueException extends RuntimeException
	{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException
	{
		public OverflowIntQueueException() {}
	}
	
	public Q5(int capacity)
	{
		num = front = rear = 0; // 초기화
		max = capacity;
		try
		{
			que = new int[max]; // 큐 본체용 배열 생성
		}
		catch(OutOfMemoryError e)
		{
			max = 0;
		}
	}
	
	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException 
	{
		if (num >= max)
		{
			throw new OverflowIntQueueException(); // 큐가 가득 참
		}
		que[rear++] = x;
		num++;
		if (rear == max)
		{
			rear = 0;
		}
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException 
	{
		if (num <= 0)
		{
			throw new EmptyIntQueueException(); // 큐가 비어 있음
		}
		int x = que[front++];
		num--;
		if (front == max)
		{
			front = 0;
		}
		return x;
	}

	// 큐에서 데이터를 피크(머리데이터를 살펴봄)
	public int peek() throws EmptyIntQueueException 
	{
		if (num <= 0)
		{
			throw new EmptyIntQueueException(); // 큐가 비어 있음
		}
		return que[front];
	}

	// 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(int x) 
	{
		for (int i = 0; i < num; i++) 
		{
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색성공
			{
				return idx;
			}
		}
		return -1; // 검색실패
	}

	// 큐를 비움
	public void clear() 
	{
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() 
	{
		return max;
	}

	// 큐에 쌓인 데이터 수를 반환
	public int size() 
	{
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() 
	{
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() 
	{
		return num >= max;
	}

	// 큐 안의 터(이터를 머리→꼬리의 차례로 나타냄
	public void dump() 
	{
		if (num <= 0)
		{
			System.out.println("큐가 비었습니다.");
		}
		else 
		{
			for (int i = 0; i < num; i++)
			{
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}

	// 큐에서 x를 검색하여 머리부터 몇 번 째인가(찾지 못하면 0)를 반환
	public int search(int x) 
	{
		for (int i = 0; i < num; i++)
		{
			if (que[(i + front) % max] == x) // 검색성공
			{
				return i + 1;
			}
		}
		return 0; // 검색실패
		}
}
