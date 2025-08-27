package pack;
import java.util.*;
public class Modifiers {

public static void main(String s[]) {
	Test si = new Test();
	System.out.println(si.sum(18));
	System.out.println(si.sum("Virat","Kohli"));
	
}
}
class Test extends Exam{
	// Polymorfizem or Overloading
	int sum(int n) {
		return n;
	}
	String sum (String s ) {
		return s;
	}
	String sum(String fn,String ln){
		return (fn+" "+ln);
	}
	
}
class Exam{
	int sum(int x) {
		return 56;
	}
	
}