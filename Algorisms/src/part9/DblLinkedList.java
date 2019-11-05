package part9;

import java.util.Comparator;

import part9.DblLinkedListTester.Data;

public class DblLinkedList<E> 
{
	class Node<E>
	{
		private E data;
		private Node<E> prev;
		private Node<E> next;
	
		Node()
		{
			data = null;
			prev = next = this;
		}
		
		Node(E obj, Node<E> prev, Node<E> next)
		{
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E> head; // 머리노드(더미노드)
	private Node<E> crnt; // 선택노드
	
	public DblLinkedList()
	{
		head = crnt = new Node<E>(); // 더미노드 생성
	}
	
	public boolean isEmpty()
	{
		if(head.next == head)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public E search(E obj, Comparator<? super E> c)
	{
		Node<E> ptr = head.next; // 현재 스캔 중인 노드 (head가 가리키는 노드는 더미노드이므로, head.next가 진짜 머리노드)
		
		while(ptr != head)
		{
			if(c.compare(obj, ptr.data) == 0)
			{
				crnt = ptr;
				return ptr.data;
			}
			else
			{
				ptr = ptr.next;
			}
		}
		
		return null; // 검색한 값이 없을 때는 null을 리턴
	}
	
	public void printCurrentNode()
	{
		if(isEmpty())
		{
			System.out.println("선택된 노드가 없습니다.");
		}
		else
		{
			System.out.println(crnt.data);
		}
	}
	
	public void dump()
	{
		Node<E> ptr = head.next;
		
		while(ptr != head)
		{
			System.out.print(ptr.data + "  ");
			ptr = ptr.next;
		}
		System.out.println();
		System.out.println("==============================================================");
	}
	
	public void dumpReverse()
	{
		Node<E> ptr = head.prev;
		
		while(ptr != head)
		{
			System.out.print(ptr.data + "  ");
			ptr = ptr.prev;
		}
		System.out.println();
		System.out.println("==============================================================");
	}
	
	public boolean next()
	{
		if(isEmpty() || crnt.next == head)
		{
			return false;
		}
		else
		{
			crnt = crnt.next;
			return true;
		}
	}
	
	public boolean prev()
	{
		if(isEmpty() || crnt.prev == head)
		{
			return false;
		}
		else
		{
			crnt = crnt.prev;
			return true;
		}
	}
	
	public void add(E obj)
	{
		Node<E> node = new Node<E>(obj, crnt, crnt.next);
		crnt.next = node; // 선택노드의 뒤에 노드를 삽입
		crnt.next.prev = node; // 선택노드의 다음 노드의 앞에 노드를 삽입
		crnt = node; // 삽입한 노드를 선택노드로..
	}
	
	public void addFirst(E obj)
	{
		crnt = head; // 더미노드
		add(obj);
	}
	
	public void addLast(E obj)
	{
		crnt = head.prev; // 꼬리노드
		add(obj);
	}
	
	public void removeCurrentNode()
	{
		if(!isEmpty())
		{
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
		}
	}
	
	public void remove(Node p)
	{
		Node<E> ptr = head.next;
		
		while(ptr != head)
		{
			if(ptr == p)
			{
				crnt = p;
				removeCurrentNode();
				break;
			}
			else
			{
				ptr = ptr.next;
			}
		}
	}
	
	public void removeFirst()
	{
		crnt = head.next; // head는 더미노드이므로, 실제 머리노드는 head.next
		removeCurrentNode();
	}
	
	public void removeLast()
	{
		crnt = head.prev; // head는 더미노드이므로, 실제 꼬리노드는 head.prev
		removeCurrentNode();
	}
	
	public void clear()
	{
		while(!isEmpty())
		{
			removeFirst(); // removeFirst() 혹은 removeLast()
		}
	}
	
	public void purge(Comparator<? super E> c)
	{
		/*Node<E> ptr = head.next;

		while (ptr.next != head) {
			int count = 0;
			Node<E> ptr2 = ptr;
			Node<E> pre = ptr;

			while (pre.next != head) {
				ptr2 = pre.next;
				if (c.compare(ptr.data, ptr2.data) == 0) {
					pre.next = ptr2.next;
					count++;
				} else
					pre = ptr2;
			}
			if (count == 0)
				ptr = ptr.next;
			else {
				Node<E> temp = ptr;
				remove(ptr);
				ptr = temp.next;
			}
		}
		crnt = head;*/
		
		Node<E> ptr = head.next;

		while (ptr.next != head)
		{
			Node<E> ptr2 = ptr.next;
			System.out.println("☆");
			while (ptr2.next != head)
			{
				if (c.compare(ptr.data, ptr2.data) == 0)
				{
					ptr2.prev.next = ptr2.next;
					/*Node<E> temp = ptr2;
					remove(ptr2);
					ptr2 = temp.next;*/
					System.out.println("＠");
				}
				else
				{
					ptr2 = ptr2.next;
				}
				System.out.println("★");
			}
			ptr = ptr.next;
		}
		crnt = head; 
	}
	
	public E retrieve(int n)
	{
		Node<E> ptr = head.next;

		while (n >= 0 && ptr != head)
		{
			if (n-- == 0)
			{
				crnt = ptr;
				return ptr.data;
			}
			else
			{
				ptr = ptr.next;
			}
		}
		return (null);
	}
}
