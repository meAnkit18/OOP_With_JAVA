package Labpractice;
import java.util.*;
public class QuetwentyNine {
	public static void main(String args[]) {
		List<Integer> li = new LinkedList<>();
		li.add(18);
		li.add(17);
		li.add(10);
		li.add(42);
		li.add(15);
		 ListIterator<Integer> pr = li.listIterator(li.size());
		while(pr.hasPrevious()) {
			System.out.println(pr.previous());
		}
	}
}
