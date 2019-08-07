package part4;

import java.util.Scanner;

import javax.management.Query;

public class Q6<E> {

	public static class EmptyGqueueException extends RuntimeException 
	{
		public EmptyGqueueException() {}
	}

	// 실행할 때 예외：큐가 가득 참
	public static class OverflowGqueueException extends RuntimeException 
	{
		public OverflowGqueueException() {}
	}

	private int max; // 큐의 용량
	private int num; // 현재의 데이터 수
	private E[] que; // 큐의 본체
	private int front; // 프런트 요소 커서
	private int rear;  // 리어 요소 커서
	
	// 생성자
	public Q6(int capacity)
	{
	      num = 0;
	      max = capacity;
	      try 
	      {
	    	  que = (E[]) new Object[max];        // 큐 본체용 배열을 생성
		  } 
	      catch (OutOfMemoryError e) 
	      { 
	    	  max = 0;
		  }
	}
	
	// 인큐
	public E enque(E x) throws OverflowGqueueException 
	{
		if (num >= max)
		{
			throw new OverflowGqueueException(); // 큐가 가득 참
		}
			que[num++] = x; // 스택의 PUSH와 같이 데이터를 입력
			return x;
		}

	// 디큐
	public E deque() throws EmptyGqueueException  
	{
		if (num <= 0)
		{
			throw new EmptyGqueueException (); // 큐가 비어 있음
		}
		E x = que[0];
		for (int i = 0; i < num - 1; i++)
		{
			que[i] = que[i + 1]; // 한칸씩 위로 배치
		}
			num--;
			return x;
		}

		// 피크
		public E peek() throws EmptyGqueueException  
		{
			if (num <= 0)
			{
				throw new EmptyGqueueException (); // 큐가 비어 있음
			}
			return que[num - 1]; // 가장 위에있는(가장 먼저 인큐된 데이터 출력)
		}

		// 큐를 비움
		public void clear() 
		{
			num = 0;
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

		// 큐 안의 데이터를 머리→꼬리의 차례로 출력함
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
					System.out.print(que[i] + " ");
				}
				System.out.println();
			}
		}
		
		// INDEX
		public int indexOf(E x) 
		{
			for (int i = 0; i < num; i++)
			{
				if (que[(i + front) % max] == x) // 검색성공
				{
					return i + front;
				}
			}
			return -1; // 검색실패
		}
		
		// 큐에서 x를 검색하여 머리부터 몇 번 째인가(찾지 못하면 0)를 반환
		public int search(E x) 
		{
			for (int i = 0; i < num; i++)
			{
				if (que[(i + front) % max] == (x))   // 검색 성공
				{
			        return i + 1;
				}
			}
		    return 0; // 검색실패
		}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			Q6 i = new Q6<>(20);
			
			i.enque(1);
			i.enque("가");
			i.enque("a");
			
			System.out.println("큐의 사이즈 : " + i.size());
			
			System.out.println("-----디큐 전-----");
			System.out.print("인덱스 찾을 값 : ");
			System.out.println("a는 " + i.indexOf("a") + "번 째에 있다.");
		
			System.out.print("search할 값 : ");
			System.out.println("a는 " + i.search("a") + "번 째에 있다.");
			
			System.out.println("-----디큐 후-----");
			i.deque();
			
			System.out.print("인덱스 찾을 값 : ");
			System.out.println("a는 " + i.indexOf("a") + "번 째에 있다.");
			
			System.out.print("search할 값 : ");
			System.out.println("a는 " + i.search("a") + "번 째에 있다.");
			
		
		}
		
}
