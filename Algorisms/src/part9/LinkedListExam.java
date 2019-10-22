package part9;

class LinkedListExam
{
	Node head; 

	static class Node
	{
		int data; 
		Node next = null; 
	}

	LinkedListExam()
	{
		head = new Node();
	}

	void append(int d)
	{
		Node end = new Node();
		end.data = d;
		Node n  = head;
		
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d)
	{
		Node n = new Node();
		
		while(n.next != null)
		{
			if(n.next.data == d)
			{
				n.next = n.next.next;
			}
		}
	}
	
	void output()
	{
		Node n = head.next;
		
		while(n.next != null)
		{
			System.out.print(n.data + " | ");
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	void purge()
	{
		Node n = head;
		
		while(n != null && n.next != null)
		{
			Node r = n;
			
			while(r.next != null)
			{
				if(n.data == r.next.data)
				{
					r.next = r.next.next;
				}
				else
				{
					r = r.next;
				}
			}
			n = n.next;
		}
	}
	
	void retrieve(int n)
	{
		int num = n;
		Node ptr = head;

		while (n >= 0 && ptr != null) 
		{
			if (n-- == 0)
			{
				System.out.println(num + "번째 노드는 " + ptr.data);
			}
			ptr = ptr.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListExam test = new LinkedListExam();
		
		test.append(2);
		test.append(3);
		test.append(4);
		test.append(2);
		test.append(1);
		test.append(5);
		test.append(2);
		test.append(3);
		test.append(6);
		
		test.output();
		test.retrieve(3);
		
		test.purge();
		test.output();
	}


}
