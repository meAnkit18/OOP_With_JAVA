package Collwctionspack;
import java.util.*;
public class Questioone {
public static void main(String args[]) {
	List<String> li = new ArrayList<>();
	List<String> ad = new ArrayList<>();
	li.add("Ankit");
	ad.add("Delhi");
	li.add("Rahul");
	ad.add("Mumbai");
	li.add("Virat");
	ad.add("Banglor");
	li.add("Rohit");
	ad.add("Mumbai");
	li.add("Koholi");
	ad.add("Delhi");
	List<String> ans = new ArrayList<>();
	for(int i=0;i< li.size();i++) {
		if(ad.get(i)=="Delhi") {
			ans.add(li.get(i));
		}
	}
	System.out.println(ans);
	
}
}
