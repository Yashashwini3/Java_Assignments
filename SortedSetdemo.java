package p2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetdemo {
	public static void main(String[] args) {
		SortedSet a = new TreeSet();
		a.add(78);
		a.add(55);
		a.add(90);
		a.add(100);
		a.add(80);
		System.out.println(a);
		System.out.println(a.first());
		System.out.println(a.last());
		System.out.println(a.headSet(90));
		System.out.println(a.tailSet(55));
		System.out.println(a.subSet(78,100));

	}

}
