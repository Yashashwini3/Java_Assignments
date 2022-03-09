package p3;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList b = new LinkedList();
		b.add("1");
		b.add("2");
		b.add("3");
		b.add("data");
		System.out.println(b);
		ListIterator listIterator = b.listIterator();
		listIterator.add("CLASS");
		while (listIterator.hasNext()) {
			listIterator.add("99");
			
			if(listIterator.next().equals("2")) {
				listIterator.set("100");
			}
	System.out.println(listIterator.next());
		}
        System.out.println(b);
	}

}
