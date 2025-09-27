package Labpractice;
import java.util.*;
public class ThirtyFive {
	public static void main(String dfsd[]) {
		Iterable<String> itr = Arrays.asList("Java","Python","CPP","MERN");
		
		List<String> li = new ArrayList<>();
		for(String lang: itr) {
			li.add(lang);
		}
		System.out.print(li);
	}
}
