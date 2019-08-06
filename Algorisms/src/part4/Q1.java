package part4;
import java.util.Scanner;

class Q1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(20); //스택 생성

		while (true) {
			System.out.println("(1)push / (2)pop (3)peek /(4)dump / (5)indexOf / (6)clear / (7)capacity / (8)size / (9) isEmpty / (10)isFull ");
			int menu = stdIn.nextInt();

			int x;
			switch (menu) 
			{
			case 1: // 푸시
				System.out.print("데이터：");
				x = stdIn.nextInt();
				try 
				{
					s.push(x);
				} 
				catch (IntStack.OverflowIntStackException e) 
				{
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try 
				{
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} 
				catch (IntStack.EmptyIntStackException e) 
				{
					System.out.println("스택이 비었습니다.");
				}
				break;

			case 3: // 피크
				try 
				{
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} 
				catch (IntStack.EmptyIntStackException e) 
				{
					System.out.println("스택이 비었습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;

			case 5: // indexOf
				System.out.print("입력값：");
				x = stdIn.nextInt();
				int n = s.indexOf(x);
				System.out.println("입력값은 " + (s.size() - n) + "번 째");
				break;
			
			case 6: // clear
				s.clear();
				break;
			
			case 7: // capasity
				System.out.println("용량：" + s.capacity());
				System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
				break;
			
			case 8: // size
				System.out.println("데이터 수：" + s.size());
				break;
			
			case 9: // isEmpty
				if("true".equals(s.isEmpty()))
				{
					System.out.println("스택은 비어있다.");
				}
				else
				{
					System.out.println("스택은 비어있지않다.");
				}
				break;
			case 10: // isFull
				if("true".equals(s.isFull()))
				{
					System.out.println("스택은 가득 차있다.");
				}
				else
				{
					System.out.println("스택은 가득 차있지않다.");
				}
				break;
			}
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
	}
}
