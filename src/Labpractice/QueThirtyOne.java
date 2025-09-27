package Labpractice;
import java.util.*;
public class QueThirtyOne {
	public static void main(String ar[]) {
		TreeSet<Integer> li =new TreeSet<>();
		li.add(18);
		li.add(15);
		li.add(18);
		li.add(17);
		li.add(10);
		li.add(25);
		TreeSet<Integer> clonetree = (TreeSet<Integer>) li.clone();
		System.out.print(clonetree);
	}
}
