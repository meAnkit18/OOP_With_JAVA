package Practicebro;
import java.util.*;
public class Treesetppra {
	public static void main(String fsfs[]) {
		List<Integer> li = new ArrayList<>();
		li.add(23);
		li.add(24);
		li.add(26);
		li.add(237);
		li.add(22);
		System.out.println(Collections.max(li));
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(24);
		ts.add(999);
		ts.add(237);
		ts.add(22);
		System.out.println(Collections.max(ts));
		HashMap<String,Integer> hs = new HashMap<>();
		hs.put("df",43);
		hs.put("fdsf",432);
		hs.put("fsd",128);
		hs.put("fd",22);
		System.out.println(Collections.max(hs.values()));
	}
}
