package Collwctionspack;
import java.util.*;
public class Stackpop {
	public static void main(String args[]) {
		Stack<String> s = new Stack<>();
		s.push("ankit");
		s.push("amna");
		s.push("a");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
