package part4;

public class IntStack {
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체

	public class EmptyIntStackException extends RuntimeException 
	{
		public EmptyIntStackException() { }
	}

	public class OverflowIntStackException extends RuntimeException 
	{
		public OverflowIntStackException() { }
	}

	// 생성자
	public IntStack(int capacity) 
	{
		ptr = 0;
		max = capacity;
		try 
		{
			stk = new int[max];				
		}
		catch (OutOfMemoryError e)
		{		
			max = 0;
		}
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException 
	{
		if (ptr >= max)									
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException 
	{
		if (ptr <= 0)									
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 
	public int peek() throws EmptyIntStackException 
	{
		if (ptr <= 0)									
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택을 밑에서부터 출력
	public void dump() 
	{
		if (ptr <= 0)
		{
			System.out.println("스택이 비어 있습니다.");
		}
		else 
		{
			for (int i = 0; i < ptr; i++)
			{
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
	
	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 
	public int indexOf(int x) 
	{
		for (int i = ptr - 1; i >= 0; i--)				
		{	
			if (stk[i] == x)
			{
				return i;
			}
		}
		return -1;										
	}

	// 스택을 비움
	public void clear() 
	{
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() 
	{
		return max;
	}
	
	// 스택안에 데이터의 수
	public int size() 
	{
		return ptr;
	}
	
	// 스택이 비어있는가
	public boolean isEmpty() 
	{
		return ptr <= 0;
	}
	
	// 스택이 가득차있는가
	public boolean isFull() 
	{
		return ptr >= max;
	}
}