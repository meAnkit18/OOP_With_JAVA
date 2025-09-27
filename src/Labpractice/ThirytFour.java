package Labpractice;
import java.util.*;
public class ThirytFour {
	public static void main(String args[]) {
		//for frequent searching
		List<String> li = new ArrayList<>();
		li.add("Ankit");
		li.add("Aryan");
		li.add("Abhisek");
		li.add("Askfh");
		li.add("Ankitfihsui");
		System.out.println(li.get(3));
		System.out.println(li.getLast());
		// singleton class
		//if insertion and deletion is high then use it
		LinkedList<String> t = new LinkedList<>();
		t.add("Ankit");
		
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(t);
		//
	}

}
