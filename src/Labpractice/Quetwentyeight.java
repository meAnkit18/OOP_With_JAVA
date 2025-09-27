package Labpractice;
import java.util.*;
public class Quetwentyeight {
	public static void main(String args[]) {
		List<String> li = new ArrayList<>();
		li.addFirst("Ankit");
		li.addFirst("Virat");
		li.addFirst("Kohli");
		li.addFirst("RCB");
		li.addFirst("Eighteen");
		Iterator it = li.iterator();
		while(it.hasNext()) {			
			System.out.println(it.next());
		}
	}
}
