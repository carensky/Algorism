package part4;

public class Q2<E> {
	private int max; // 스택의 용량
	private int ptr; // 스택 포인터
	private E[] stk; // 스택 본체

	public static class EmptyGstackException extends RuntimeException 
	{
		public EmptyGstackException() {}
	}

	public static class OverflowGstackException extends RuntimeException 
	{
		public OverflowGstackException() {}
	}

	// 생성자
	public Q2(int capacity) 
	{
		ptr = 0;
		max = capacity;
		try 
		{
			stk = (E[]) new Object[max];		
		}
		catch (OutOfMemoryError e)
		{		
			max = 0;
		}
	}
	
	public E push(E x) throws OverflowGstackException 
	{
		if (ptr >= max) // 스택이 가득 참
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}

	public E pop() throws EmptyGstackException 
	{
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyGstackException();
		return stk[--ptr];
	}

	public E peek() throws EmptyGstackException 
	{
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}

	public int indexOf(E x) 
	{
		for (int i = ptr - 1; i >= 0; i--) // 꼭대기쪽부터 선형 검색
		{
			if (stk[i].equals(x))
			{
				return i; // 검색성공
			}
			
		}
		return -1; // 검색실패
	}

	public void clear() 
	{
		ptr = 0;
	}

	public int capacity() 
	{
		return max;
	}

	public int size() 
	{
		return ptr;
	}

	public boolean isEmpty() 
	{
		return ptr <= 0;
	}

	public boolean isFull() 
	{
		return ptr >= max;
	}

	public void dump() 
	{
		if (ptr <= 0)
		{
			System.out.println("스택이 비었습니다.");
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
}
