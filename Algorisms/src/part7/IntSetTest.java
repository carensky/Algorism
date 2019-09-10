package part7;

public class IntSetTest {

	public static void main(String[] args) 
	{
		IntSet intSet1 = new IntSet(10);
		IntSet intSet2 = new IntSet(10);
		IntSet intSet3 = new IntSet(10);
		
		intSet1.add(3);
		intSet1.add(2);
		intSet1.add(4);
		intSet1.add(1);
			
		//intSet2.add(4);
		//intSet2.add(5);
		//intSet2.add(6);
		
		//intSet1.addAll(intSet2);
		intSet2.output();
		//intSet3.output();
		//intSet1.removeAll(intSet2);
		//intSet1.retain(intSet2);
		//intSet1.isSubsetOf(intSet3);
		//intSet3.intersectionOf(intSet1, intSet2);
		//intSet3.differenceOf(intSet1, intSet2);
		//intSet3.output();
		
	}

}
