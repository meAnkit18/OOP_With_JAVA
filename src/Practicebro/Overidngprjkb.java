package Practicebro;
import java.util.*;
public class Overidngprjkb {
	public static void main(String sfs[]) {
		Sport s1 = new Sport();
		s1.eat();
	}
}
class Studentbro{
	void eat() {
		System.out.println("Dont eat");
	}
}
class Sport extends Studentbro{
	void eat() {
		System.out.println("mai to sprot hu");
	}
}
