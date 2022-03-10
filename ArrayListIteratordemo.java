package p3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratordemo {

	public static void main(String[] args) {
		ArrayList y = new ArrayList();
		y.add("1");
		y.add("2");
		y.add("55");
		
		Iterator c = y.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
			
		}

	}

}
